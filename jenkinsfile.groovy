node {
    properties([pipelineTriggers([cron('H * * * * ')])])
    stage("Terraform init") {
        sh "terraform init"
    }    
    stage("Terraform plan") {
        sh "terraform apply  --auto-approve"
    }
}
