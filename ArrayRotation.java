class ArrayRotation
{
     static void rotation(int ar1[],int n)
	 {
		 int temp,t=3;
		 while(t-->0)
		 {
		 temp=ar1[n-1];
		 for(int i=n-1;i<ar1.length-1;i--)
		 {
			 ar1[i]=ar1[i-1];
			 i--;
		 }
		 ar1[0]=temp;
		 
		 }
		 for(int i=0;i<ar1.length-1;i++)
		 {
		 System.out.println(ar1[i]);
		 }
	 }
    public static void main(String[] args)
	{
	    int []ar1={4,3,6,8,9};
		int n=ar1.length;
		rotation(ar1,n);
	}
}