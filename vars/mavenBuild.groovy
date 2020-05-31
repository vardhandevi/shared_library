 
def call(){         
      withMaven(jdk: 'jdk1.8_172', maven: 'mvn363') {
      sh "mvn -f javademo/pom.xml clean install -Dmaven.test.skip=true"
             }
       }
