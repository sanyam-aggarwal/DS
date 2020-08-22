package ds;
import java.util.*;

public class pretopost {
	
	static String preToPost(String a) 
	{ 
		Stack<String> s= new Stack<String>(); 
	    int length = a.length(); 
	  
	    for (int i = length - 1; i >= 0; i--)  
	    {  
	        if (a.charAt(i)=='-' || a.charAt(i)=='+' ||a.charAt(i)=='/' ||a.charAt(i)=='*' || a.charAt(i)=='^')  
	        { 
	            String op1 = s.pop(); 
	            String op2 = s.pop(); 
	             
	            String temp = op1 + op2 + a.charAt(i); 
	            s.push(temp); 
	        } 
	  
	        else
	        { 
	            s.push( a.charAt(i)+""); 
	        } 
	    } 
	    return s.peek(); 
	} 
	public static void main(String args[])  
	{ 
		Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    System.out.println("Postfix : " + preToPost(a)); 
	} 
	} 

