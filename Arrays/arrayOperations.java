public class arrayOperations {
    public static void main(String []args) {
        int arr[] = {1,2,3,4,5};
        arr[0] = 9;
        System.out.println("Printing the array elements using for loop: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");// printing array elements
        }

        System.out.println("Printing the array elements using while loop: ");
        arr[0] = 10;
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
