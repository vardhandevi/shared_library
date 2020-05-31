 
def call(){

stage("maven Build"){
            steps{
                withMaven(jdk: 'jdk1.8_172', maven: 'mvn363') {
    // some block
     sh "mvn -f javademo/pom.xml clean install -Dmaven.test.skip=true"
                  }
              }
         }
}
