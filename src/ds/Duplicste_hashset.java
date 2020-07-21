package ds;
import java.util.*;
import java.io.*;
public class Duplicste_hashset {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(),array[] = new int[n];
	        for (int i = 0; i < n; i++) array[i] = sc.nextInt();
	        
	        ArrayList<Integer> dup=new ArrayList<>();
	        for(int i=0;i<n;i++) array[array[i]%n]+=n;
	        for(int i=0;i<n;i++) if(array[i]/n>1) dup.add(i);
	        if(dup.isEmpty()) dup.add(-1);
	        for (Integer val : dup) System.out.print(val + " ");
	        System.out.println();
	    }
	}


