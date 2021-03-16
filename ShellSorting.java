
import java.util.Scanner;


public class ShellSorting {
    
     static void shellsort(int[] arr, int num)    
        {    
        int gap, j, k, tmp;    
        for (gap = num / 2; gap> 0; gap = gap / 2)  //First gap num/2 , then gap= gap1/2, then gap=gap2/2  
        {    
        for (j = gap; j<num; j++)  //j loop gap theke start and num theke chuto hbe ,,, j++   
        {    
        for(k = j - gap; k>= 0; k = k - gap)    //K or i ...o theke before gap...
        {    
        if (arr[k+gap] >= arr[k])    //jdi chuto hoy then no  change 
        break;    
        else                //jdi boro hoy change.possition change
        {    
        tmp = arr[k];    
        arr[k] = arr[k+gap];    
        arr[k+gap] = tmp;    
        }    
        }    
        }    
        }

            }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int arr[]= new int[30];    
        int k,  num;    
        System.out.println("Enter total no. of elements : ");      
        num = sc.nextInt();  
        for (k =  0 ; k<num; k++)    
        {    
        arr[k]=sc.nextInt();    
        }    
        shellsort(arr, num);    
        System.out.println("\n Sorted array is: ");    
        for (k = 0; k<num; k++)    
        System.out.print(arr[k] +" ");    
        }    
        
    }

