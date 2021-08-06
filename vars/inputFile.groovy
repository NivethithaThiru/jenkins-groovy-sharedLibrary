#!/usr/bin/env groovy

def fileRead(String filename = "product.csv") {
    def filePath = readFile ${filename} 
    def lines = filePath.readLines() 
    for (line in lines) { 
      println "$line"
    }
    
    /*sh "echo Displaying File Contents!"
    sh "cat ${filename}"*/
}

