def rajudown(a)
{
  git "${https://github.com/intelliqittrainings/${a}.git"
}
def rajubuild()
{
  sh "mvn package"
}
def rajudeploy(b,c)
{
  
}
