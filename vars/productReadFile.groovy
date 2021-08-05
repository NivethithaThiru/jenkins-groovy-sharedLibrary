#!/usr/bin/env groovy

def readFile(String path)
{
    new File(${path}).eachLine {  
         line -> println "$line"; 
    }
} 

return this
   
