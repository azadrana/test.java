public class KadaneAlgo
{
     public static void main (String [] args)
	 {
	       int [] a={4,-2,7,8,9,-3,4,-1,-2,3,9,10,1,5,-3};
	      int b=0;
		  int c=0;
		  for(int i=0;i<a.length;i++)
		  {
		      c=c+a[i];
			  if(b<c)
			  {
			      b=c;
			  }
			  if(c<0)
			  {
			      c=0;
			  }
		  }
		  System.out.println(b);
	 }
	 
	 
}