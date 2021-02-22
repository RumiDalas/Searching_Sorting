
public class QuickSortAlgo {
    public static void main(String[] args) {
       int[] arr={15,9,7,13,12,16,4,18,11} ;
       int leng=arr.length;
       QuickSortAlgo obj = new QuickSortAlgo();
       obj.QuickSortRecursion(arr,0, leng-1);
       obj.printArray(arr);
    }
    int partition(int arr[], int low , int high){
        int pivot=arr[low] ;
        while(low<=high){
            while(arr[low]<pivot){
                low++ ;
            
            }
            while(arr[high]>pivot){
                high-- ;
            
            }
            if(low<=high){
                int temp = arr[low];
                arr[low]= arr[high];
                arr[high]= temp   ;   
                low++;
                high--;  
            }
        } 
        return low ;
    }
    
    
    void QuickSortRecursion(int arr[], int low, int high){
        int pi = partition( arr,  low ,  high);
        if(low<pi-1){
            QuickSortRecursion(arr,low,pi-1);
        }
        if(pi<high){
            QuickSortRecursion(arr,pi,high);
        
        }   
    }
    
    void printArray(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        
        }
    
    }
    
    
    
    
    
}
