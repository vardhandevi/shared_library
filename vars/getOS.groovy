def call(){
	if (isUnix()) {
		shell="sh"	
	}
	else {
		shell="bat"
	}
	return shell
}