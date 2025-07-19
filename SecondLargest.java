import java.util.*;
class secondLargest{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i]>largest){
        secondLargest=largest;
        largest=arr[i];
      }
      else if(arr[i]<largest && arr[i]>secondLargest){
        secondLargest=arr[i];
      }
    }
    if(secondLargest==Integer.MIN_VALUE){
      System.out.println("there is no second element");
    }
    else{
      System.out.println("Second element is"+secondLargest);
        }
  }
}
