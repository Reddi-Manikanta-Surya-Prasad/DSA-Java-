

//finding the number of consecutive pairs whose sum is equal to K

import java.util.Scanner;

public class ConsecutivePairs {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sum(k) value: ");
        int k = sc.nextInt();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Print the user given array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //solution
        
    }
}
