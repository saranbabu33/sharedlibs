node ('Win10') {

  echo "Initial multi-thread pipeline..."

}

teamsUrl = https://dell.webhook.office.com/webhookb2/68f3dac6-cf38-42a5-a4bf-69adfc1869dc@945c199a-83a2-4e80-9f8c-5a91be5752dd/IncomingWebhook/1922f62fd23341a59a5c85ee259a4e3f/7aadc77b-2395-46d5-93fe-a4e5ec6a2b99

   repo_config = [
      "Lagos" : [

                  "arti" : "foxconn,inventec,wistron,insyde",
                  "generation" : "16G",
                  "email" : "hawk.sun@dell.com",
                  "branch" : "main",
                  "script" : "",
                ],

      "EagleMnt" : [
                  "arti" : "foxconn",
                  "generation" : "16G",
                  "email" : "hawk.sun@dell.com",
                  "branch" : "main",
                  "script" : "",
                  "build_dir" : "Build_Genoa",
                ],

      "Brazos" : [
                  "arti" : "foxconn",
                  "generation" : "16G",
                  "email" : "bbbb@dell.com",
                  "branch" : "main",
                  "script" : "",
                               "build_dir" : "Build_Genoa",
                ],

      "MonteCarlo" : [
                  "arti" : "foxconn,inventec,wistron,compal",
                  "generation" : "15G",
                  "email" : "bbbb@dell.com",
                  "branch" : "stg/15g_main",
                  "script" : "",
                ],
    ]
  }
