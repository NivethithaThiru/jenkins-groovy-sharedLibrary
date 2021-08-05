#!/usr/bin/env groovy

def readFile()
{
    new File("product.csv").eachLine {  
         line -> println "$line"; 
    }
} 

return this
   
