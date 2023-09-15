def gitdownload(repo)
{
   git "http://github.com/Sravan2990/${repo}.git"
}
def mavenbuild()
{
 sh 'mvn package'
}
def tomcatDeploy(jobname,ip,context)
{
sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war   ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}

