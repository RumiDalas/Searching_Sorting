
package data_sorting;

import java.util.Scanner;


public class Max_Using_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1>n2){
        if(n1>n3){
            System.out.println("Max "+n1);
        }
        }
        if(n2>n1){
        if(n2>n3){
            System.out.println("Max "+n2);
        }
        }
        if(n3>n1){
        if(n3>n2){
            System.out.println("Max "+n3);
        }
        }
        
    }
    
}
