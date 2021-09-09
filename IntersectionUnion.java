import java.util.Scanner;
class IntersectionUnion
{
    public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the size of array1");
	   int size1=s.nextInt();
	   System.out.println("enter the size of array2");
	   int size2=s.nextInt();
	    System.out.println("enter the size of array3");
		int size3=s.nextInt();
	   int [] a=new int[size1];
	   int [] b=new int[size2];
	   int [] c=new int[size3];
	    System.out.println("enter the element of array1");
		for(int i=0;i<size1-1;i++)
		{
		   a[i]=s.nextInt();
		}
		 System.out.println("enter the element of array2");
		 for(int i=0;i<size2-1;i++)
		 {
		     b[i]=s.nextInt();
		 }
		 /*for(int i=0;i<a.length-1;i++)
		 {
		   System.out.println("element of array1"+a[i]);
	      }
		  for(int i=0;i<b.length-1;i++)
		  {
		      System.out.println("element of array2"+a[i]);
		  }*/
		   //System.out.println("intersection of two array");
		   for(int i=0;i<a.length-1;i++)
		   {
			   for(int j=0;j<b.length-1;j++)
			   {
				   if(a[i]==b[j])
				   {
					    System.out.println(b[j]);
					  /* for(int k=0;k<c.length-1;k++)
					   {
						   c[k]=a[i];
					   }*/
				   }
			   }
		   }
		   /*for(int k=0;k<c.length-1;k++)
		   {
		    System.out.println("intersection of two array "+c[k]);
		   }*/
		  
	}
}