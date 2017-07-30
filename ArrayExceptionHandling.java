package assignment12;//here  I'm creating a package assignment12

import java.util.Arrays;

public class ArrayExceptionHandling {   //here creating the class as ArrayExceptionHandling 

	public static void main(String[] args) { //creating a main method

	    int [] Array =   {8,12,6,5,19,30,20,54,8,1};   //here i created an array and initialized 10 e
	    int [] newArray =new  int [9];  
	    //here i have taken another array and declared an array size of 9
	    
	    for(int i=0;i<Array.length;i++)//
	    {
	    	try{
	    		
	           newArray[i]=Array[i];
	    }
	    	
	    
	    	catch (Exception e){
	    	
	    		System.out.println("ArrayIndexOutOfBoundsException");
	    } }       
	    System.out.println(Arrays.toString(Array));//exist array
	 
	    System.out.println(Arrays.toString(newArray));//copied array
}
}
