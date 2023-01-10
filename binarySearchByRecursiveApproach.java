/*

    The following method is implemented for binary search for an array with the help of recursion
    
    
*/


import java.util.Arrays;

public class binarySearchByRecursion{
  public static void main(String []argument){
      int []array = {67,4,78,2,45,6,2,2,4356,90};
    
      showArray(array);   //showing array before sorting
    
      Arrays.sort(array);
    
      showArray(array);   //showing array after sorting
    
      if(elementIndexByRecursion(array,element,0,array.length-1,array.length-1/2) == -1){
            System.out.print("\nElement is not present in the array");
      }else{
            System.out.print("\nElement "+element+" is found at index :\t"+elementIndexByRecursion(array,element,0,array.length-1,array.length-1/2));
      }
    
  }
  
  
  public static void showArray(int []array){
      for(int x=0;x<array.length;x++){
          System.out.print(array[x]+" ");
      }
  }
  
  
  public static int elementIndexByRecursion(int []array,int element,int low,int high,int mid){
      if(low > high){
          return -1;
      }
    
      if(array[mid] == element){
          return mid;
      }
    
      else if(array[mid] > element){
          high = mid-1;
          mid = (low+high)/2;
          return elementIndexByRecursion(array,element,low,high,mid);
      }
    
      else{
          low = mid+1;
          mid = (low+high)/2;
          return elementIndexByRecursion(array,element,low,high,mid);
      }
  }
  
}
   
