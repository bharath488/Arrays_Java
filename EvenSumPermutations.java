import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    System.out.println("Enter the array:");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int sum=0;
    long fact=1;
    for(int i=0;i<n;i++){
      sum+=arr[i];
    }
    if(sum%2==0){
      for(int i=1;i<=n;i++){
        fact*=i;
      }
      System.out.println("Array has even sum Valid permutations: " + fact);
    }
    else
    {
       System.out.println("Array has odd sum valid permutations: 0");
    }
  }
}
