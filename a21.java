public class assigment{
//java method for binary search
public static void binarySearch(int arr[], int start, int end, int key){  
	int mid = (start + end)/2;  
	while( start <= end ){  
	   if ( arr[mid] < key ){  
		 start = mid + 1;     
	   }else if ( arr[mid] == key ){  
		 System.out.println(mid);  
		 break;  
	   }else{  
		  end = mid - 1;  
	   }  
	   mid = (start + end)/2;  
	}  
	if ( start> end ){  
	   System.out.println("Not found!");  
	}  
  }  
	public static void main(String[] args){
      //find no  of characters in string
	  String string = "Sridhar is doing the assgiment";    
        int count = 0;    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
		System.out.println(count);
    }

}

