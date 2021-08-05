#!/usr/bin/env groovy

def fileRead() {
    def filePath = readFile "AppReleases.csv" 
    def lines = filePath.readLines() 
    for (line in lines) { 
      println "$line"
    }
}

