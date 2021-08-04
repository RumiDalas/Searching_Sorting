
public class MergeSort {
    
 void merge(int arr[], int beg, int mid, int end)  
    {  
  
        int l = mid - beg + 1;  
        int r = end - mid;  

        int LeftArray[] = new int [l];  
        int RightArray[] = new int [r];  

        for (int i=0; i<l; ++i){
        LeftArray[i] = arr[beg + i]; 
        }

        for (int j=0; j<r; ++j) { 
        RightArray[j] = arr[mid + 1+ j]; 
        }


        int i = 0, j = 0;  
        int k = beg;  
        while (i<l&&j<r)  
        {  
        if (LeftArray[i] <= RightArray[j])  
        {  
        arr[k] = LeftArray[i];  
        i++;  
        }  
        else  
        {  
        arr[k] = RightArray[j];  
        j++;  
        }  
        k++;  
        }  
        while (i<l)  
        {  
        arr[k] = LeftArray[i];  
        i++;  
        k++;  
        }  

        while (j<r)  
        {  
        arr[k] = RightArray[j];  
        j++;  
        k++;  
        }  
        }  

        void sort(int arr[], int beg, int end)  
        {  
        if (beg<end)  
        {  
        int mid = (beg+end)/2;  
        sort(arr, beg, mid);  
        sort(arr , mid+1, end);  
        merge(arr, beg, mid, end);  
        }  
        }  
 
    public static void main(String[] args) {
        
        int arr[] = {90,2,101,45,65,22,67,89,34,23};  
        MergeSort ob = new MergeSort();  
        ob.sort(arr, 0, arr.length-1);  

        System.out.println("\nSorted array");  
        for(int i =0; i<arr.length;i++)  
            {  
               System.out.print(arr[i]+" ");  
            }  
        System.out.println("");
        } 
}



// merge Sort Another Rule

class sorting {

  public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){
      
      int i=0,l=0,r = 0;
      //The while loops check the conditions for merging
      while(l<left_size && r<right_size){
          
          if(left_arr[l]<right_arr[r]){
              arr[i++] = left_arr[l++];
          }
          else{
              arr[i++] = right_arr[r++];
          }
      }
      while(l<left_size){
          arr[i++] = left_arr[l++];
      }
      while(r<right_size){
        arr[i++] = right_arr[r++];
      }
  }

  public static void mergeSort(int [] arr, int len){
      if (len < 2){return;}
      
      int mid = len / 2;
      int [] left_arr = new int[mid];
      int [] right_arr = new int[len-mid];
      
    //Dividing array into two and copying into two separate arrays
      int k = 0;
      for(int i = 0;i<len;++i){
          if(i<mid){
              left_arr[i] = arr[i];
          }
          else{
              right_arr[k] = arr[i];
              k = k+1;
          }
      }
    // Recursively calling the function to divide the subarrays further
      mergeSort(left_arr,mid);
      mergeSort(right_arr,len-mid);
    // Calling the merge method on each subdivision
      merge(left_arr,right_arr,arr,mid,len-mid);
  }

  public static void main( String args[] ) {
        int [] array = {12,1,10,50,5,15,45};
        mergeSort(array,array.length);
        for(int i =0; i< array.length;++i){
            System.out.print(array[i]+ " ");
        }
    }
}
