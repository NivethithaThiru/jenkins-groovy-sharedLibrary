#!/usr/bin/env groovy

def call(String fileName) {
    def fileContent = libraryResource "csvfiles/${fileName}"
    writeFile file: "product1.txt", text: fileContent
} 
