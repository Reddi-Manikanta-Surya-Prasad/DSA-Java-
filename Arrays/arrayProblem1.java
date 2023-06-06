import java.util.Scanner;
//Find the index of the largest element in an Array
public class arrayProblem1{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array you want: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("User given array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //finding the largest element and its index in an array
        int largest = arr[0];
        int maxIndex = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Largest element in the given array is: "+largest);
        System.out.println("Index of the largest element in an array: "+maxIndex);
        

    }
}