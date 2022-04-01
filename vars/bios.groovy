def call(){
    node ('Win10') {
        
        stage('Preparation') { // for display purposes
        echo "Preparation"
        checkout scm
        test.setEnableFlag(true)
        test.execute()
        helper.performAction()
        }
        stage('Build') {
        echo "Build"
        }
        stage('Results') {
            echo "Results"
        }
    }
}
