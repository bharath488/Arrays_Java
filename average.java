public class demo{
    public static void main(String args[]){
        int[] arr={10,70,85,964,98};
        int sum=0;
        int avg;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        avg=sum/2;
        System.out.println(avg);
    }
}
