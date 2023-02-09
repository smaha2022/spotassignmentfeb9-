package zoho.test;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {

	        int [] arr = {5,8,2,4,3,9};
            Insertionsort(arr);
	}

	public static void Insertionsort(int[] arr) {
			  for(int i=1;i<arr.length;i++) {
            	for(int j=i;j>0;j--) {
            		if(arr[j]<arr[j-1])       
            		{                         
            			int temp = arr[j];  
            			arr[j]= arr[j-1] ;
            			arr[j-1]= temp;       
            			
            		}
            		else
            			
            			break;
            	}
            }
			  System.out.print("[");
			  for(int i=0;i<arr.length;i++)
			  {
				  
				  System.out.print(arr[i]+" ");
			  }
			  System.out.print("]");
			  System.out.println();
            System.out.println(Arrays.toString(arr));
	}


	}
/*public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}*/

