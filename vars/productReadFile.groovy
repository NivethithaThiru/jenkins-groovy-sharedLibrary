def readFile()
{
    new File("C:/Users/nivir/Desktop/Groovy/product.csv").eachLine {  
         line -> println "$line"; 
    }
} 
static void main(String[] args) { 
     readFile();
} 
   
