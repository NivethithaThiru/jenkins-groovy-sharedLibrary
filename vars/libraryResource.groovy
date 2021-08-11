#!/usr/bin/env groovy

def libResource(String fileName)
{
    def fileContent = libraryResource "csvfiles/${fileName}"
    writeFile file: "product1.csv" text: fileContent
} 
