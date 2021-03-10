
import java.util.Scanner;


public class CountingSort {
    
    public void counting_sort(int A[], int k, int n)  //A array name, K max value, n total number
{  
    int i, j;  
    int B[]=new int[15], C[]=new int[20];  
    for (i = 0; i <= k; i++)  //Initially make all value 0
        C[i] = 0;  
    for (j = 1; j <= n; j++)  
        C[A[j]] = C[A[j]] + 1;  //Counting...Konta kotobar ace
    for (i = 1; i <= k; i++)  
        C[i] = C[i] + C[i-1];  //Index increasing...update count..Like 0 3 3 4 will be 0 3 6 10
    for (j = n; j >= 1; j--)  //This will start from last...
    {  
        B[C[A[j]]] = A[j];    //Last i count same i bsame i e rakhboo
        C[A[j]] = C[A[j]] - 1;  //pos decrement kore dilm
    }  
    System.out.println("The Sorted array is : "); 
    for (i = 1; i <= n; i++)  
        System.out.printf("%d ", B[i]);  
}  
    
    public static void main(String[] args) {
        CountingSort obj = new CountingSort();
        int n, k = 0, A[]= new int[15], i;  
        System.out.printf("Enter the number of input : "); 
        Scanner sc  = new Scanner(System.in);
        n= sc.nextInt();
        System.out.printf("\nEnter the elements to be sorted :\n");  
        for (i = 1; i <= n; i++)  
        {  
            //scanf("%d", &A[i]); 
            A[i]= sc.nextInt();
            if (A[i] > k) {  
                k = A[i];  
            }  
        }  
        obj.counting_sort(A, k, n);  
          
        }
    
}
