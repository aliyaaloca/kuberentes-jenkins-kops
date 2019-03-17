node {
    stage("Terraform init") {
        sh "terraform init"
    }    
    stage("Terraform plan") {
        sh "terraform apply  --auto-approve"
    }
}
