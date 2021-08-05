#!/usr/bin/env groovy

def call(String path)
{
    new File(${path}).eachLine {  
         line -> println "$line"; 
    }
} 
