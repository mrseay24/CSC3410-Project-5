/*        CSC3410 ‐Spring 2015
 *        Sidney Seay ‐sseay5@student.gsu.edu
 *        DateDue: 04‐9‐2015
 *        Assignment: 5, Comparison of Sorting Algorithms Code
 *        File(s): SortAlgor.java, Timer.java, InstrumentedSorter.java, Comparator.java
 /*
  * 
  */
package sortAlgor;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Comparator extends InstrumentedSorter  {


    public Comparator() {
    	
   	
    }
/*
 * Method selectionSort extends Class InstrumentedSorter
 * @param int[] array
 * @see sortAlgor.InstrumentedSorter#bubbleSort(int[])
 */
    public void bubbleSort(int[] array) {
    
    	int iLength = array.length;
    	instructionCounter++; // increment for =    	
    	int arrayValue = 0;
    	instructionCounter++; // increment for =
    	
    	for(int i=0; i < iLength; i++){
      	  instructionCounter++; // increment for < ++

    		for(int j=1; j < (iLength-i); j++){                        
   	    	  instructionCounter++; // increment for < ++

    			if(array[j-1] > array[j]){
    	   	    	instructionCounter++; // increment for >

    	   	    	arrayValue = array[j-1];
    	   	    	instructionCounter++; // increment for = -
    	   	    	
    	            array[j-1] = array[j];
    	   	    	instructionCounter++; // increment for =
    	   	    	
    	            array[j] = arrayValue;
    	   	    	instructionCounter++; // increment for =
    	       }                    
    	   }
    	}
    	
    }
   
/*
 * Method selectionSort extends Class InstrumentedSorter
 * @param int[] array 
 * @see sortAlgor.InstrumentedSorter#selectionSort(int[])
 */
    public void selectionSort(int[] array) {

    	for ( int i = 0; i < array.length; i++ ) {
          instructionCounter++; // increment for = ++    		
    	  int aIndex = i; // aIndex contain for loop counter
      	  instructionCounter++; // increment for =    	  
    	  int aValue = array[i]; // value at array[aIndex]
      	  instructionCounter++; // increment for =
    	  
    	  for ( int j = i + 1; j < array.length; j++ ) {
    		instructionCounter++; // increment for < ++
    		
    		// look ahead in the array  i + 1
    		// compare value  
    	    if ( array[ j ] < aValue ) {
    	    	instructionCounter++; // increment for <
    	    	  
    	      // value a j is less than aValue	
    	      aIndex = j;
        	  instructionCounter++; // increment for =
        	  
    	      // aValue now contain array[j] value
    	      aValue = array[j];
        	  instructionCounter++; // increment for =    	      
    	      
    	    }
    	  }
    	  // sort / rearrange array values
    	  int temp = array[i];
    	  instructionCounter++; // increment for =
    	  
    	  array[i] = aValue;
    	  instructionCounter++; // increment for =
    	  
    	  array[aIndex] = temp;
    	  instructionCounter++; // increment for =
    	  
    	}

    }
/*
 * Method insertionSort extends Class InstrumentedSorter
 * @param int[] array
 * @see sortAlgor.InstrumentedSorter#insertionSort(int[])
 */
    public void insertionSort(int[] array) {
    	
    	int unsortedIndex;
        int sortedIndex; 

        for (int i = 1; i < array.length; i++)
        {
       	   instructionCounter++; // increment for < ++
        	
        	unsortedIndex = array[i];
	        sortedIndex = i - 1;
	     	instructionCounter++; // increment for = -	        

            while ((sortedIndex >= 0) && (unsortedIndex < array [sortedIndex]))
            {
            	instructionCounter++; // increment for >= <
            	array[sortedIndex + 1] = array[sortedIndex];
	           sortedIndex--;
	     	  instructionCounter++; // increment for + =
	     	  instructionCounter++; // increment for --	           
            }
            array[sortedIndex + 1] = unsortedIndex;
	     	instructionCounter++; // increment for + =
	     	
         }
    }

/*
 * Method mergerSort extends Class InstrumentedSorter
 * @param int[] array
 * @see sortAlgor.InstrumentedSorter#mergerSort(int[])
 */
    public void mergerSort(int[] array) {

        int mergerArray[] = new int[array.length];
     	instructionCounter++; // increment for =        
        sortMerge(array, mergerArray, 0, array.length-1);
    	instructionCounter++; // increment for -
    	
    }

    private void sortMerge(int array[], int mergerArray[], int left, int
    		right)
    {
    		     if (left < right) {
    			    instructionCounter++; // increment for <    		    	 
    		        int center = (left + right) / 2;
    		        instructionCounter++; // increment for = + /
    		        //
    		        // recursive call sortMerge
    		        sortMerge(array, mergerArray, left, center);
    		        sortMerge(array, mergerArray, center + 1, right);
    		        instructionCounter++; // increment for +
    		        
    		        merge(array, mergerArray, left, center + 1, right);
    		        instructionCounter++; // increment for +
    		     
    		     }
    }

    private void merge(int array[], int mergeArray[], int leftPos, int
        rightPos, int rightEnd)
    {
    	   int leftEnd = rightPos - 1;
    	   instructionCounter++; // increment for = -
    	   int currPos = leftPos;
    	   instructionCounter++; // increment for =
    	   int numElements = rightEnd - leftPos + 1;
    	   instructionCounter++; // increment for = - +

    	   while (leftPos <= leftEnd && rightPos <= rightEnd) {
    		  instructionCounter++; // increment for <= 
    	      if (array[leftPos] <= array[rightPos]) {
    	    	instructionCounter++; // increment for <=  
    	        mergeArray[currPos++] = array[leftPos++];
    	        instructionCounter++; // increment for = ++
    	      }  
    	      else {
    	        mergeArray[currPos++] = array[rightPos++];
    	        instructionCounter++; // increment for = ++
    	      }
    	      
    	   while (leftPos <= leftEnd) {
    		   instructionCounter++; // increment for <=
    	       mergeArray[currPos++] = array[leftPos++];
    	       instructionCounter++; // increment for = ++
    	   }
    	   while (rightPos <= rightEnd) {
    		   instructionCounter++; // increment for <=
    	       mergeArray[currPos++] = array[rightPos++];
    	       instructionCounter++; // increment for = ++

    	       for (int i=0; i<numElements; i++, rightEnd--) {
    	    	   instructionCounter++; // increment for = < ++ --
    		       array[rightEnd] = mergeArray[rightEnd];
    		       instructionCounter++; // increment for =
    	       }    
    	   }
      }   
   }
    
/*
 * Method quickSort extends Class InstrumentedSorter
 * @param int[] array
 * @see sortAlgor.InstrumentedSorter#quickSort(int[])
 */
    public void quickSort(int[] array) {
    	
        sortQuick(array, 0, array.length - 1);    	
	    instructionCounter++; // increment for -
	       
    }

    private void sortQuick(int[] array, int left, int right) {
        if (right - left <= 0) {
    	    instructionCounter++; // increment for - <=
        	return;
        }  
        else {
          int quickValue = array[right];
  	      instructionCounter++; // increment for =
  	      // call method sortedQuick
          int quickSortPos = sortedQuick(array, left, right, quickValue);
          //
          // recursive call sortQuick
          sortQuick(array, left, quickSortPos - 1);
  	      instructionCounter++; // increment for -
  	      
          sortQuick(array, quickSortPos + 1, right);
  	      instructionCounter++; // increment for +
  	      
        }
      }
    
    private int sortedQuick(int[] array, int left, int right, int quickSortPos) {

    	int leftPointer = left - 1;
	    instructionCounter++; // increment for = -        
    	int rightPointer = right;
	    instructionCounter++; // increment for =
    	
        while (true) {
          while (array[++leftPointer] < quickSortPos) {
      	      instructionCounter++; // increment for <
      	      break;
      	      
          }
            
          while (rightPointer > 0 && array[--rightPointer] > quickSortPos) {
      	      instructionCounter++; // increment for > --
      	      break;
      	      
          }
            

          if (leftPointer >= rightPointer) {
      	    instructionCounter++; // increment for >=  
            break;
          }  
          else {
            swap(array, leftPointer, rightPointer);
          }
          
        }
        
        swap(array, leftPointer, right);
        
        return leftPointer;
      }

      private void swap(int[] array, int leftPointer, int rightPointer) {
        
    	  int arrayValue = array[leftPointer];
  	      instructionCounter++; // increment for =  
    	  array[leftPointer] = array[rightPointer];
  	      instructionCounter++; // increment for =
          array[rightPointer] = arrayValue;
  	      instructionCounter++; // increment for =
  	      
      }
    
    
    
/*
 * Method randomizedSort extends Class InstrumentedSorter
 * @param int[] array
 * @see sortAlgor.InstrumentedSorter#randomizedQuickSort(int[])
 */
    public void randomizedQuickSort(int[] array) {
    	
    	quickSort(array);
    
    }
    
}
