package com.oops.examples;

class Test   
{  
    int i;   
}  

class Testing{
	
	int j = 100;
	
}
public class Demo
{  
    public static void main (String args[])   
    {  
        Test test = new Test();   
        Testing t = new Testing();
        System.out.println(test.i); 
        System.out.println(t.j);
    }  
}