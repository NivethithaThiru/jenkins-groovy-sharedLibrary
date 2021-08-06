#!/usr/bin/env groovy

def fileRead(String filename = "product.csv") {
    println("Displaying File Contents");
    def filePath = readFile "${filename}" 
    def lines = filePath.readLines() 
    for (line in lines) { 
      println "$line"
    }
    
    /*sh "echo Displaying File Contents!"
    sh "cat ${filename}"*/
}

