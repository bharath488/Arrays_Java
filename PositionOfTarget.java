import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target element :");
    int target=sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==target){
        System.out.println("Position of target element is:"+i);
      }
     }
    }
  }
}
