
package data_sorting;

import java.util.Scanner;

public class Max_using_Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1>n2&n1>3){
            System.out.println("Max "+n1);
        }else if(n2>n3&n2>1){
           System.out.println("Max "+n2); 
        }else if(n3>n1&n3>n2){
            System.out.println("Max "+n3); 
        }
        
    }
    
}
