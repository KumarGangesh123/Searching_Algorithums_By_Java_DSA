/*

  this is the program to implement the Linear Search by iteration 
  
*/

puvlic class linearSearchByIterativeApproach{
  public static void main(String []args){
    int[] arr={78,2,45,1,90,34,67};
    int element = 45;
    if(elementIndexByIterative(arr,element) == -1){
      System.out.print("Data "+element" + is't present in the array");
  }else{
    System.out.print("Data "+element+" is found at :\t"+elementIndexByIteration(arr,element));
  }
  
  public static int elementIndexByIteration(int arr[],int element){
    for(int x=0;x<arr.length;x++){
      if(arr[x]==element){
        return x;
      }
    }return-1;
  }
  
}
    
