
package data_sorting;


public class Selection_Sort {
    public static void main(String[] args) {
        int a[] ={1,7,5,9,3,4,11};
        int i,j,min , temp ;
        for(i=0; i<a.length;i++)
        {
            min = i;
            for( j =i+1 ; j<a.length; j++)
            {
            if(a[j]<a[min])
            {
            min = j;
            
            }
        
        }
            temp = a[i];
            a[i] = a[min];
            a[min]= temp;
        
        
        }
        for( i=0; i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
    
}
