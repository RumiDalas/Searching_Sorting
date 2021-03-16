
public class PivotFinding {
    
    public int findPivot(int arr[], int low, int high) 
    { 
        // base cases 
        if (high < low) 
            return -1; 
        if (high == low) 
            return low; 
  
        /* low + (high - low)/2; */
        int mid = (low + high) / 2; 
        if (mid < high && arr[mid] > arr[mid + 1]) //Increasing order ...so   4 5 6 1 2 3....mid=6 and mid+1=1
            return mid; 
        if (mid > low && arr[mid] < arr[mid - 1]) 
            return (mid - 1); 
        if (arr[low] >= arr[mid]) 
            return findPivot(arr, low, mid - 1); 
        return findPivot(arr, mid + 1, high); 
    } 
    
   
    
    
    
    
    public static void main(String[] args) {
        PivotFinding obj = new PivotFinding();
        int arr1[] = { 5, 6, 7, 10, 1, 2, 3 }; //Here pivot index 3..3 index pos=10...then accending order
        int n = arr1.length; 
        int result = obj.findPivot(arr1, 0, n-1);
        System.out.println(result);
        
    }
    
}
