import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int sum=0;
    int count=0;
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
    }
    int avg=sum/n;
    for(int i=0;i<n;i++){
      if(arr[i]>avg){
        count++;
      }
    }System.out.println("count is "+count);
  }
}
