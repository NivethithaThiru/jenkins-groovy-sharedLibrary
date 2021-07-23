node {
    // Git checkout before load source the file
    checkout scm

    // To know files are checked out or not
    sh '''
        ls -lhrt
    '''

    def rootDir = pwd()
    println("Current Directory: " + rootDir)

    // point to exact source file
    def file1 = load "${rootDir}/vars/productReadFile.groovy"

    file1.readFile()
    
}
