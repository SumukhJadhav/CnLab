package belman2;

import java.util.Scanner; 

public class Main
{
	
	private int D[]; 
	private int num_ver;     
	public static final int MAX_VALUE = 999;     
	public static void main(String[ ] args)   
	 {  
		
	    int num_ver = 0;        
	    int source;         
	    Scanner scanner = new Scanner(System.in);   
	    System.out.println("Enter the number of vertices");        
	     num_ver = scanner.nextInt();  
	     
	     int A[][] = new int[num_ver + 1][num_ver + 1];         
	    System.out.println("Enter the adjacency matrix");         
	   for (int sn = 1; sn <= num_ver; sn++)        
	   {         
	    for (int dn = 1; dn <= num_ver; dn++)          
	   {
	   	 A[sn][dn] = scanner.nextInt();        
	   	 if (sn == dn)                
	   	 {           
	            A[sn][dn] = 0;                 
	            continue;            
	      }               
	   	 if (A[sn][dn] == 0)               
	   	 {           
	            A[sn][dn] = MAX_VALUE;              
	   	 }              
	   	}
	    }  
	   
	   
	   	System.out.println("Enter the source vertex");   
	        source = scanner.nextInt();     
	       ford b = new ford (num_ver);     
	       b.BellmanFordEvaluation(source, A);        
	       scanner.close();
	     }
}
