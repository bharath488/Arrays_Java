class SearchElement{
  public static void main(String[] args){
    int arr[]={20,30,40,50,60};
    int target=60;
    boolean found=false;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==target){
        System.out.println("Trageted element is: "+target+" at index "+i);
        found=true;
      }
    }
    if(!found){
        System.out.println("Trageted element Not found");
    }
  }
}
