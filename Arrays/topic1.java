import java.util.Scanner;

public class topic1{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int []arr = new int[n]; //creating an array with size n
        System.out.println("Enter the values in an array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); //taking array input from user
        }
        System.out.println("Given elements in an array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" "); //printing the all the elements in an array in a line
        }
    }
}