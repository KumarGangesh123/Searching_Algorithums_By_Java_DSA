/*

    following is the code for the BINARY SEARCH implementation for an array 
    
*/


import java.util.Arrays;

public class binarySearchByIterative.Approarch{
  public static void main(String []argument){
     int[] array = {12,89,34,5,2,78,4,677,89};
     
     int element = 34;
     
     showArray(array);    // showing the array before sorted
     
     Arrays.sort(array);
     
     showArray(array);    // showing the array after sorted
     
     if(elementIndexByIteration(array,element) == -1){
         System.out.print("\nElement is not present in the array ");
     }else{
          System.out.print("\nElement "+element+" found at index:\t"+elementIndexByIteration(array,elemenet));
     }
     
  }
     
  
  public static void showArray(int []array){
      for(int x=0;x<array.length;x++){
          System.out.print(array[x]+" ");
      }
      
  }
  
     
     
  public static int elementIndexByIteration(int array[],int elemnent){
      
      int low = 0;
      int high = array.length-1;
      int mid = (low+high)/2;
      
      while(low <= high){
          if(array[mid] == element){
              return mid;
          }
          
          else if(array[mid] > element){
              high = mid-1;
              mid = (low+high)/2;
          }
          
          else{
              low = mid+1;
              mid = (low+high)/2;
          }
          
      }
      
      return -1;
      
  }
  
}




/*


    in the above menthod elementIndexByIteration uses BINARY SEARCH for searching the element from the array with the help of recursion
    
    
 */
     
