#!/usr/bin/env groovy

def fileRead(String filename) {
    println("Displaying File Contents");
    def filePath = readFile "${filename}" 
    def lines = filePath.readLines() 
    for (line in lines) { 
      println "$line"
    }
    
    /*sh "echo Displaying File Contents!"
    sh "cat ${filename}"*/
}

