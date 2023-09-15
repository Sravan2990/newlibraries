def gitdownload(repo)
{
   git "http://github.com/Sravan2990/${repo}.git"
}
def mavenbuild()
{
 sh 'mvn package'
}
