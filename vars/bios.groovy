import groovy.transform.Field
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder
import jenkins.model.*
    
    class Config implements Serializable {
    static Map data     = [
        locale          : 'bois'
    ]

    static Map settings = [:]
}

def call(Map config=[:]){
    node {
        settings.config(config)
    }

    pipeline {
        agent any

        options {
            //timestamps()
            skipDefaultCheckout()
            parallelsAlwaysFailFast()
            timeout(time: 60, unit: 'MINUTES')
            buildDiscarder(logRotator(numToKeepStr: '30'))
        }

         /*parameters {
            gitParameter (
                branch: '', 
                branchFilter: 'origin/(.*)', 
                defaultValue: 'master', 
                listSize: '10', ) */
               

            choice(
                name: 'Lagos',
                description: 'Please select Environment',
                choices: 'dev\nqa\nuat\npre\nprd')

            choice(
                name: 'EagleMnt',
                description: 'Please select action',
                choices: 'deploy\nrollback')

            choice(
                name: 'Brazos',
                description: 'Please select action',
                choices: 'Container\nLegacy\nMixed')
        }

        stages {
            stage ('Initial Pipeline') {
                steps {
                    script {
                        log.i 'Initiating Pipeline'
                        controller.entry()
                    }
                }
            }
        }

        
            }
