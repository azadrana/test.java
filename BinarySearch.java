public  class BinarySearch
       {
	       public static void main(String[] args)
		   {
		      int a[]={2,4,6,8,10,15};
			  int ele=30; 
			  int low=0,high=5,mid;
			  boolean found=false;
			  while(low<=high)
			  {
			     mid=(low+high)/2;
				 if(ele<a[mid])
				 {
				   high=mid-1; 
				 }
				 else if(ele>a[mid])
                 {
					 low=mid+1;
				 }	
                   else if(ele==a[mid])
				   {
					   System.out.println("element found :"+a[mid]);
					   found=false;
					   break;
				   }   
			  }
			  if(!found)
			  {
				  System.out.println("element not found");
			  }
		   }
		}