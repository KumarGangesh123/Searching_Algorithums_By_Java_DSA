/*

    In this program of Java , their's imlementation of linear search with the help of recursion
    
*/


public class linearSearchByRecursion{
  public static void main(String []argument){
     int[] array = {12,67,2,45,2,89,2,12,56,23};
     int element = 45;
     
     if(elementIndexByRecursion(array,elenent,0) == -1){
         System.out.print("\nElement is not present in the array ");
     }else{
         System.out.print("Element "+element+" found at index:\t"+elementIndexByRecursion(array,element,0));
     }
     
  }
  
  public static int elementIndexByRecursion(int[] array,int element,int position){
       if(position == array.length){
          return -1;
       }
       
       if(array[position] == element){
          return position;
       }
       
       elemenetIndexByRecursion(array,element,position+1);
  }
  
}



/*

      In the above code  ,  method elementIndexByRecursion uses recursion approach to find the index of the element in the array if it is present in the array and 
      if it not present in the array then it returns -1
      
*/
 
     
     
