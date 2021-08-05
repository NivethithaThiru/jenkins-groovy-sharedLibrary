#!/usr/bin/env groovy

def fileCall() {
    /*def filePath = readFile "AppReleases.csv" 
    def lines = filePath.readLines() 
    for (line in lines) { 
      println "$line"
    }*/
    sh "echo Displaying File Contents!"
    sh "cat product.csv"
}

