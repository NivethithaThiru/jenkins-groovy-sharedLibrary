#!/usr/bin/env groovy

def readFile()
{
    new File("https://github.com/NivethithaThiru/jenkins-groovy-sharedLibrary/blob/master/product.csv").eachLine {  
         line -> println "$line"; 
    }
} 

return this
   
