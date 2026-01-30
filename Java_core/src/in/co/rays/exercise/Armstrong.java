package in.co.rays.exercise;

public class Armstrong {
	public static void main(String[] args) {
        int num =171;
        
        int r;
       int sum=0;
       int n = num;
       
       while(n>0) {
    	   r=n%10;
    	   
    	   sum=sum+(r*r*r);
    	   
    	   n=n/10;
       }
    	   if(num==sum) {
    		   System.out.println("yes");
    		   
    	   }else {
    		   System.out.println("no");
    	   }
    	   
    	   
       }
   
        
        
	}


