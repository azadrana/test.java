import java.util.Scanner;
class MergeTwoArray
{
    public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the size of array1");
	   int size1=s.nextInt();
	   System.out.println("enter the size of array2");
	   int size2=s.nextInt();
	    int size3=size1+size2+1;
	   int [] a=new int[size1];
	   int [] b=new int[size2];
	   int [] c=new int[size3];
	   System.out.println("enter the element of array one");
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=s.nextInt();
	   }
	   System.out.println("enter the element of array two");
	   for(int i=0;i<b.length;i++)
	   {
		   b[i]=s.nextInt();
	   }
	   System.out.println("merging of array");
	   for(int i=0;i<a.length;i++)
	   {
		   c[i]=a[i];
	   }
	   for(int i=0;i<b.length;i++)
	   {
	      c[size2-1+i]=b[i];
	   }
	   for(int i=0;i<c.length;i++)
	   {
	   System.out.println(c[i]);
	   }
	   }
	   
	}