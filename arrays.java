public class assigment{
    public static void main(String[] args){
        //printing values in an array
        int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i*i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
        //printing values in reverse order
        for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
        //printing duplicates
        int arr2[]=new int[5];
        for(int i=1;i<arr2.length;i++) {
			arr2[i]=i;
		}
		arr2[0]=1;
		for(int i:arr2) {
			for(int j:arr2) {
				if(i==j) {
					System.out.println(i);
					
				}
				
			}
			break;
		}
        //sorting the array
     for (int i = 0; i < arr.length; i++)   
	{  
	for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
	if (arr[i] > arr[j])   
	{  
		tmp = arr[i];  
	arr[i] = arr[j];  
	arr[j] = tmp;  
	}  
	}   
	System.out.println(arr[i]);  
	}
    //reverse a six digit number
    int number = 245671;
		int arr3[] = new int[6];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=number%10;
			number=number/10;
		}
		int reverse=0;
	    for(int i=0;i<arr3.length;i++) {
	         reverse=reverse*10+arr3[i];
	    }
				System.out.println(reverse); 

    }
}

