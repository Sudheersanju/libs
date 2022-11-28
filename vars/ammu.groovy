def rajudown(repo)
{
  git "{https://github.com/intelliqittrainings/${repo}.git"
}
def rajubuild()
{
  sh 'mvn package'
}
def rajudeploy(b,c)
{
    sh "scp /var/lib/jenkins/workspace/${b}/webapp/target/webapp.war ubuntu@172.31.27.110:/var/lib/tomcat9/webapps/${c}.war"
}
def rajurun(d)
{
  sh "java -jar /var/lib/jenkins/workspace/${d}/testing.jar"
}
