def call(string stageName){

    if ( "${stageName}" == "build")
    {
        sh 'mvn clean package'
    }
    else if ( "${stageName}" == "SonarQube Report")
    {
        sh 'mvn sonar:sonar'
    }
    else if ( "${stageName}" == "Upload Into Nexus")
    {
        sh 'mvn deploy'
    }
}
