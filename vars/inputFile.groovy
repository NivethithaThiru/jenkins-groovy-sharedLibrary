#!/usr/bin/env groovy

def call() {
    /*def filePath = readFile "AppReleases.csv" 
    def lines = filePath.readLines() 
    for (line in lines) { 
      println "$line"
    }*/
    sh "echo Displaying File Contents!"
    sh "cat product.csv"
}

