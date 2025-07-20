import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");
    int n=sc.nextInt();
    System.out.println("Enter the array:");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the first range element:");
    int l=sc.nextInt();
    System.out.println("Enter the second range element:");
    int r=sc.nextInt();
    int sum=0;
    if(l<0 || r>=n || l>r){
      System.out.println("Element not found");
    }
    for(int i=l;i<r+1;i++){
      sum+=arr[i];
    }
    System.out.println("Range sum of array is :"+sum);
  }
}
