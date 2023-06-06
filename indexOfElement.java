/*
 * You are given an integer array arr of size N and a number X. 
 * You need to print all the indexes of the given X in the array
 * else print -1
 * NOTE: you have to give the output in 1-index basing
 */
public class indexOfElement {
    public static void main(String []args) {
        int N = 5;
        int X = 1;
        int arr[] = {2, 1, 3, 1, 1};
        boolean found = false;
        for(int i=0;i<N;i++){
            if(arr[i] == X){
                System.out.print(i+1+ " ");
                found = true;
            }
        }
        if(!found){
            System.out.println(-1);
        }
    }
}
