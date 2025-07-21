import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter first range");
        int start=sc.nextInt();
        System.out.println("Enter second range");
        int end=sc.nextInt();
        int rangeSum=0;
        for(int i=start;i<=end;i++){
            rangeSum+=arr[i];
        }
        System.out.println("Rangesum of an array is: "+ rangeSum);
    }
}
