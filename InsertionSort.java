
public class InsertionSort {
    public static void main(String[] args) {
        int[] a={15,9,7,13,12,16,4,18,11} ;
        
        int i, j, temp=0 ;
        for( i=0; i<a.length; i++){
            temp = a[i];
            j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]= a[j] ;
                j--;
            }
            a[j+1]= temp ;
        }
        for(i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        
        }
    }
    
}
