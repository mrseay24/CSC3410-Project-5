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
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.sql.Timestamp;
import sortAlgor.Comparator;
import sortAlgor.Timer;

public class SortAlgor {
	  
	// constructor
	public SortAlgor() {
				
	}
	
   /*
    * M A I N
   */
   public static void main(String[] args){
	   
	   // define variable
	   Timestamp startTime = new Timestamp(System.currentTimeMillis());
	   Timestamp endTime = new Timestamp(System.currentTimeMillis());

	   // sort type total instruction counter
	   long totalInstructionBubble = 0;
	   long totalInstructionSelection = 0;	   
	   long totalInstructionInsertion = 0;
	   long totalInstructionMerge = 0;
	   long totalInstructionQuick = 0;
	   long totalInstructionRandom = 0;
	   
	   // sort type total time
	   long totalTimeBubble = 0;
	   long totalTimeSelection = 0;	   
	   long totalTimeInsertion = 0;
	   long totalTimeMerge = 0;
	   long totalTimeQuick = 0;
	   long totalTimeRandom = 0;
	   // sort type grand total time
	   long grandTotalTimeBubble = 0;
	   long grandTotalTimeSelection = 0;	   
	   long grandTotalTimeInsertion = 0;
	   long grandTotalTimeMerge = 0;
	   long grandTotalTimeQuick = 0;
	   long grandTotalTimeRandom = 0;	   
	   
	   
	   // create instance of Class Comparator
	   Comparator comparator = new Comparator();

	   // create instance of Class SortTimer
	   Timer sortTimer = new Timer();
	   
	   for (int size = 1000; size <= 1000; size += 1000) {
	   for (int round = 1; round <= 10; round++) {
		   int[] randomArray = comparator.createRandomArray(size);
		   for (int iter = 1; iter <= 20; iter++) {
			   //
			   // clone randomArray for selection sort
			   int[] randomX = randomArray.clone();
			   // reset instruction counter for Selection Sort
			   comparator.resetInstructionCounter();
			   // Start Timer
			   sortTimer.start();
			   // call Selection Sort
			   comparator.selectionSort(randomX);
			   // Stop Timer
			   sortTimer.end();
			   // Get Start Time
			   startTime = sortTimer.getStartTime();
               // Get End Time
			   endTime = sortTimer.getEndTime();
               // Total time
			   totalTimeSelection = sortTimer.getTotalTime();
               // calculate Sort Type Grand Total Time and Grand Total Instruction
			   grandTotalTimeSelection = grandTotalTimeSelection + totalTimeSelection;
               totalInstructionSelection = totalInstructionSelection + comparator.instructionCounter;
                   //
    			   // record instruction counter for Selection Sort
                   System.out.println("Selection Sort");
                   System.out.println("Instruction Counter is " + comparator.instructionCounter);
    			   // record time for Selection Sort  Start Time
                   System.out.println("Start Time is " + startTime);
                   // record time for Selection Sort  End Time
                   System.out.println("End Time is " + endTime);
                   // record total time for Selection Sort
                   System.out.println("Total Time is " + totalTimeSelection);
                   // print new line
                   System.out.println("\n");                    

               //
			   // clone randomArray for insertion sort
               //
			   randomX = randomArray.clone();
			   // reset instruction counter for Insertion Sort
			   comparator.resetInstructionCounter();
			   // Start Timer
			   sortTimer.start();
			   // call Insertion Sort
			   comparator.insertionSort(randomX);
			   // Stop Timer
			   sortTimer.end();
			   // Get Start Time
			   startTime = sortTimer.getStartTime();
               // Get End Time
			   endTime = sortTimer.getEndTime();
               // Total time
			   totalTimeInsertion = sortTimer.getTotalTime();
               // calculate Sort Type Grand Total Time and Grand Total Instruction
			   grandTotalTimeInsertion = grandTotalTimeInsertion + totalTimeInsertion;
               totalInstructionInsertion = totalInstructionInsertion + comparator.instructionCounter;
                   //
    			   // record instruction counter for Insertion Sort
                   System.out.println("Insertion Sort");
                   System.out.println("Instruction Counter is " + comparator.instructionCounter);
    			   // record time for Insertion Sort  Start Time
                   System.out.println("Start Time is " + startTime);
                   // record time for Insertion Sort  End Time
                   System.out.println("End Time is " + endTime);
                   // record total time for Insertion Sort
                   System.out.println("Total Time is " + totalTimeInsertion);
                   // print new line
                   System.out.println("\n");

              //
		      // clone randomArray for bubble sort
              //
    		  randomX = randomArray.clone();
    		  // reset instruction counter for Bubble Sort
    		  comparator.resetInstructionCounter();
    		  // Start Timer
    		  sortTimer.start();
    		  // call Insertion Sort
    		  comparator.bubbleSort(randomX);
    		  // Stop Timer
    		  sortTimer.end();
    		  // Get Start Time
    		  startTime = sortTimer.getStartTime();
              // Get End Time
    		  endTime = sortTimer.getEndTime();
              // Total time
              totalTimeBubble = sortTimer.getTotalTime();
              // calculate Sort Type Grand Total Time and Grand Total Instruction
              grandTotalTimeBubble = grandTotalTimeBubble + totalTimeBubble;
              totalInstructionBubble = totalInstructionBubble + comparator.instructionCounter;
              //
        	  // record instruction counter for Bubble Sort
              System.out.println("Bubble Sort");
              System.out.println("Instruction Counter is " + comparator.instructionCounter);
        	  // record time for Bubble Sort  Start Time
              System.out.println("Start Time is " + startTime);
              // record time for Bubble Sort  End Time
              System.out.println("End Time is " + endTime);
              // record total time for Bubble Sort
              System.out.println("Total Time is " + totalTimeBubble);
              // print new line
              System.out.println("\n");

               //
			   // clone randomArray for merger sort
               //
			   randomX = randomArray.clone();
			   // reset instruction counter for Merger Sort
			   comparator.resetInstructionCounter();
			   // Start Timer
			   sortTimer.start();
			   // call Merger Sort
			   comparator.mergerSort(randomX);
			   // Stop Timer
			   sortTimer.end();
			   // Get Start Time
			   startTime = sortTimer.getStartTime();
              // Get End Time
			   endTime = sortTimer.getEndTime();
              // Total time
              totalTimeMerge = sortTimer.getTotalTime();
              // calculate Sort Type Grand Total Time and Grand Total Instruction
              grandTotalTimeMerge = grandTotalTimeMerge + totalTimeMerge;              
              totalInstructionMerge = totalInstructionMerge + comparator.instructionCounter;
                  //
   			      // record instruction counter for Merger Sort
                  System.out.println("Merger Sort");
                  System.out.println("Instruction Counter is " + comparator.instructionCounter);
   			      // record time for Merger Sort  Start Time
                  System.out.println("Start Time is " + startTime);
                  // record time for Merger Sort  End Time
                  System.out.println("End Time is " + endTime);
                  // record total time for Merger Sort
                  System.out.println("Total Time is " + totalTimeMerge);
                  // print new line
                  System.out.println("\n");
                   

               //
   			   // clone randomArray for quick sort
               //
   			   randomX = randomArray.clone();
   			   // reset instruction counter for Quick Sort
   			   comparator.resetInstructionCounter();
   			   // Start Timer
   			   sortTimer.start();
   			   // call Quick Sort
   			   comparator.quickSort(randomX);
   			   // Stop Timer
   			   sortTimer.end();
   			   // Get Start Time
   			   startTime = sortTimer.getStartTime();
                 // Get End Time
   			   endTime = sortTimer.getEndTime();
                 // Total time
   			    totalTimeQuick = sortTimer.getTotalTime();
                // calculate Sort Type Grand Total Time and Total Instruction
   			    grandTotalTimeQuick = grandTotalTimeQuick + totalTimeQuick;
                totalInstructionQuick = totalInstructionQuick + comparator.instructionCounter;
                     //
      			     // record instruction counter for Quick Sort
                     System.out.println("Quick Sort");
                     System.out.println("Instruction Counter is " + comparator.instructionCounter);
        			 // record time for Quick Sort  Start Time
                     System.out.println("Start Time is " + startTime);
                     // record time for Quick Sort  End Time
                     System.out.println("End Time is " + endTime);
                     // record total time for Quick Sort
                     System.out.println("Total Time is " + totalTimeQuick);
                     // print new line
                     System.out.println("\n");
                     
                     //
         			 // clone randomArray for randomized sort
                     //
          		       randomArray = comparator.createRandomArray(size);
          		       //
         			   randomX = randomArray.clone();
         			   // reset instruction counter for Randomized Sort
         			   comparator.resetInstructionCounter();
         			   // Start Timer
         			   sortTimer.start();
         			   // call Randomized Quick Sort
         			   comparator.randomizedQuickSort(randomX);
         			   // Stop Timer
         			   sortTimer.end();
         			   // Get Start Time
         			   startTime = sortTimer.getStartTime();
                       // Get End Time
         			   endTime = sortTimer.getEndTime();
                       // Total time
         			    totalTimeRandom = sortTimer.getTotalTime();
                        // calculate Sort Type Grand Total Time and Total Instruction
         			    grandTotalTimeRandom = grandTotalTimeRandom + totalTimeRandom;
                        totalInstructionRandom = totalInstructionRandom + comparator.instructionCounter;
                           //
            			  // record instruction counter for Randomized Sort
                           System.out.println("Randomized Sort");
                           System.out.println("Instruction Counter is " + comparator.instructionCounter);
              			 // record time for Randomized Sort  Start Time
                           System.out.println("Start Time is " + startTime);
                           // record time for Randomized Sort  End Time
                           System.out.println("End Time is " + endTime);
                           // record total time for Randomized Sort
                           System.out.println("Total Time is " + totalTimeRandom);
                           // print new line
                           System.out.println("\n");
                     
		   }
	   }
	   //**************************************************************
	   // compute average and standard deviation of the measurements
	   //**************************************************************
	   //
	   // Bubble Sort Summary
	   System.out.println("\n");
	   System.out.println("___________________________________________________________________________________________________");	   
       System.out.println("                                              array size = 1000 to 10000");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("                          instruction counter                           run time");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("sorting algorithm      average     standard deviation         average     standard deviation");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("1000 bubble sort              " + (totalInstructionBubble / 1000) + "     " + Math.sqrt(totalInstructionBubble / 1000) + "              " + (grandTotalTimeBubble / 1000) + "         " + Math.sqrt(grandTotalTimeBubble / 1000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("2000 bubble sort              " + (totalInstructionBubble / 2000) + "     " + Math.sqrt(totalInstructionBubble / 2000) + "              " + (grandTotalTimeBubble / 2000) + "         " + Math.sqrt(grandTotalTimeBubble / 2000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("3000 bubble sort              " + (totalInstructionBubble / 3000) + "     " + Math.sqrt(totalInstructionBubble / 3000) + "              " + (grandTotalTimeBubble / 3000) + "         " + Math.sqrt(grandTotalTimeBubble / 3000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("4000 bubble sort              " + (totalInstructionBubble / 4000) + "     " + Math.sqrt(totalInstructionBubble / 4000) + "              " + (grandTotalTimeBubble / 4000) + "         " + Math.sqrt(grandTotalTimeBubble / 4000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("5000 bubble sort              " + (totalInstructionBubble / 5000) + "     " + Math.sqrt(totalInstructionBubble / 5000) + "              " + (grandTotalTimeBubble / 5000) + "         " + Math.sqrt(grandTotalTimeBubble / 5000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("6000 bubble sort              " + (totalInstructionBubble / 6000) + "     " + Math.sqrt(totalInstructionBubble / 6000) + "              " + (grandTotalTimeBubble / 6000) + "         " + Math.sqrt(grandTotalTimeBubble / 6000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("7000 bubble sort              " + (totalInstructionBubble / 7000) + "     " + Math.sqrt(totalInstructionBubble / 7000) + "              " + (grandTotalTimeBubble / 7000) + "         " + Math.sqrt(grandTotalTimeBubble / 7000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("8000 bubble sort              " + (totalInstructionBubble / 8000) + "     " + Math.sqrt(totalInstructionBubble / 8000) + "              " + (grandTotalTimeBubble / 8000) + "         " + Math.sqrt(grandTotalTimeBubble / 8000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("9000 bubble sort              " + (totalInstructionBubble / 9000) + "     " + Math.sqrt(totalInstructionBubble / 9000) + "              " + (grandTotalTimeBubble / 9000) + "         " + Math.sqrt(grandTotalTimeBubble / 9000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("10000 bubble sort              " + (totalInstructionBubble / 10000) + "     " + Math.sqrt(totalInstructionBubble / 10000) + "              " + (grandTotalTimeBubble / 10000) + "         " + Math.sqrt(grandTotalTimeBubble / 10000));
	   System.out.println("___________________________________________________________________________________________________");
 	   // System.out.println("Instruction Counter Total is " + totalInstructionBubble);
       // System.out.println("Total Time is " + grandTotalTimeBubble);
	   //
	   // Selection Sort Summary
	   System.out.println("\n");	   
	   System.out.println("___________________________________________________________________________________________________");
       System.out.println("                                              array size = 1000 to 10000");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("                          instruction counter                           run time");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("sorting algorithm      average     standard deviation         average     standard deviation");
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("1000 selection sort              " + (totalInstructionBubble / 1000) + "     " + Math.sqrt(totalInstructionBubble / 1000) + "              " + (grandTotalTimeBubble / 1000) + "         " + Math.sqrt(grandTotalTimeBubble / 1000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("2000 selection sort              " + (totalInstructionBubble / 2000) + "     " + Math.sqrt(totalInstructionBubble / 2000) + "              " + (grandTotalTimeBubble / 2000) + "         " + Math.sqrt(grandTotalTimeBubble / 2000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("3000 selection sort              " + (totalInstructionBubble / 3000) + "     " + Math.sqrt(totalInstructionBubble / 3000) + "              " + (grandTotalTimeBubble / 3000) + "         " + Math.sqrt(grandTotalTimeBubble / 3000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("4000 selection sort              " + (totalInstructionBubble / 4000) + "     " + Math.sqrt(totalInstructionBubble / 4000) + "              " + (grandTotalTimeBubble / 4000) + "         " + Math.sqrt(grandTotalTimeBubble / 4000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("5000 selection sort              " + (totalInstructionBubble / 5000) + "     " + Math.sqrt(totalInstructionBubble / 5000) + "              " + (grandTotalTimeBubble / 5000) + "         " + Math.sqrt(grandTotalTimeBubble / 5000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("6000 selection sort              " + (totalInstructionBubble / 6000) + "     " + Math.sqrt(totalInstructionBubble / 6000) + "              " + (grandTotalTimeBubble / 6000) + "         " + Math.sqrt(grandTotalTimeBubble / 6000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("7000 selection sort              " + (totalInstructionBubble / 7000) + "     " + Math.sqrt(totalInstructionBubble / 7000) + "              " + (grandTotalTimeBubble / 7000) + "         " + Math.sqrt(grandTotalTimeBubble / 7000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("8000 selection sort              " + (totalInstructionBubble / 8000) + "     " + Math.sqrt(totalInstructionBubble / 8000) + "              " + (grandTotalTimeBubble / 8000) + "         " + Math.sqrt(grandTotalTimeBubble / 8000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("9000 selection sort              " + (totalInstructionBubble / 9000) + "     " + Math.sqrt(totalInstructionBubble / 9000) + "              " + (grandTotalTimeBubble / 9000) + "         " + Math.sqrt(grandTotalTimeBubble / 9000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("10000 selection sort              " + (totalInstructionBubble / 10000) + "     " + Math.sqrt(totalInstructionBubble / 10000) + "              " + (grandTotalTimeBubble / 10000) + "         " + Math.sqrt(grandTotalTimeBubble / 10000));
	   System.out.println("___________________________________________________________________________________________________");
	   // System.out.println("Instruction Counter Total is " + totalInstructionSelection);
       // System.out.println("Total Time is " + grandTotalTimeSelection);
	   //
	   // Insertion Sort Summary
	   System.out.println("\n");	   
	   System.out.println("___________________________________________________________________________________________________");
       System.out.println("                                              array size = 1000 to 10000");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("                          instruction counter                           run time");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("sorting algorithm      average     standard deviation         average     standard deviation");
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("1000 insertion sort              " + (totalInstructionBubble / 1000) + "     " + Math.sqrt(totalInstructionBubble / 1000) + "              " + (grandTotalTimeBubble / 1000) + "         " + Math.sqrt(grandTotalTimeBubble / 1000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("2000 insertion sort              " + (totalInstructionBubble / 2000) + "     " + Math.sqrt(totalInstructionBubble / 2000) + "              " + (grandTotalTimeBubble / 2000) + "         " + Math.sqrt(grandTotalTimeBubble / 2000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("3000 insertion sort              " + (totalInstructionBubble / 3000) + "     " + Math.sqrt(totalInstructionBubble / 3000) + "              " + (grandTotalTimeBubble / 3000) + "         " + Math.sqrt(grandTotalTimeBubble / 3000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("4000 insertion sort              " + (totalInstructionBubble / 4000) + "     " + Math.sqrt(totalInstructionBubble / 4000) + "              " + (grandTotalTimeBubble / 4000) + "         " + Math.sqrt(grandTotalTimeBubble / 4000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("5000 insertion sort              " + (totalInstructionBubble / 5000) + "     " + Math.sqrt(totalInstructionBubble / 5000) + "              " + (grandTotalTimeBubble / 5000) + "         " + Math.sqrt(grandTotalTimeBubble / 5000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("6000 insertion sort              " + (totalInstructionBubble / 6000) + "     " + Math.sqrt(totalInstructionBubble / 6000) + "              " + (grandTotalTimeBubble / 6000) + "         " + Math.sqrt(grandTotalTimeBubble / 6000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("7000 insertion sort              " + (totalInstructionBubble / 7000) + "     " + Math.sqrt(totalInstructionBubble / 7000) + "              " + (grandTotalTimeBubble / 7000) + "         " + Math.sqrt(grandTotalTimeBubble / 7000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("8000 insertion sort              " + (totalInstructionBubble / 8000) + "     " + Math.sqrt(totalInstructionBubble / 8000) + "              " + (grandTotalTimeBubble / 8000) + "         " + Math.sqrt(grandTotalTimeBubble / 8000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("9000 insertion sort              " + (totalInstructionBubble / 9000) + "     " + Math.sqrt(totalInstructionBubble / 9000) + "              " + (grandTotalTimeBubble / 9000) + "         " + Math.sqrt(grandTotalTimeBubble / 9000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("10000 insertion sort              " + (totalInstructionBubble / 10000) + "     " + Math.sqrt(totalInstructionBubble / 10000) + "              " + (grandTotalTimeBubble / 10000) + "         " + Math.sqrt(grandTotalTimeBubble / 10000));
	   System.out.println("___________________________________________________________________________________________________");
	   // System.out.println("Instruction Counter Total is " + totalInstructionInsertion);
       // System.out.println("Total Time is " + grandTotalTimeInsertion);
	   //
	   // Merge Sort Summary
	   System.out.println("\n");	   
	   System.out.println("___________________________________________________________________________________________________");
       System.out.println("                                              array size = 1000 to 10000");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("                          instruction counter                           run time");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("sorting algorithm      average     standard deviation         average     standard deviation");
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("1000 merge sort              " + (totalInstructionBubble / 1000) + "     " + Math.sqrt(totalInstructionBubble / 1000) + "              " + (grandTotalTimeBubble / 1000) + "         " + Math.sqrt(grandTotalTimeBubble / 1000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("2000 merge sort              " + (totalInstructionBubble / 2000) + "     " + Math.sqrt(totalInstructionBubble / 2000) + "              " + (grandTotalTimeBubble / 2000) + "         " + Math.sqrt(grandTotalTimeBubble / 2000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("3000 merge sort              " + (totalInstructionBubble / 3000) + "     " + Math.sqrt(totalInstructionBubble / 3000) + "              " + (grandTotalTimeBubble / 3000) + "         " + Math.sqrt(grandTotalTimeBubble / 3000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("4000 merge sort              " + (totalInstructionBubble / 4000) + "     " + Math.sqrt(totalInstructionBubble / 4000) + "              " + (grandTotalTimeBubble / 4000) + "         " + Math.sqrt(grandTotalTimeBubble / 4000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("5000 merge sort              " + (totalInstructionBubble / 5000) + "     " + Math.sqrt(totalInstructionBubble / 5000) + "              " + (grandTotalTimeBubble / 5000) + "         " + Math.sqrt(grandTotalTimeBubble / 5000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("6000 merge sort              " + (totalInstructionBubble / 6000) + "     " + Math.sqrt(totalInstructionBubble / 6000) + "              " + (grandTotalTimeBubble / 6000) + "         " + Math.sqrt(grandTotalTimeBubble / 6000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("7000 merge sort              " + (totalInstructionBubble / 7000) + "     " + Math.sqrt(totalInstructionBubble / 7000) + "              " + (grandTotalTimeBubble / 7000) + "         " + Math.sqrt(grandTotalTimeBubble / 7000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("8000 merge sort              " + (totalInstructionBubble / 8000) + "     " + Math.sqrt(totalInstructionBubble / 8000) + "              " + (grandTotalTimeBubble / 8000) + "         " + Math.sqrt(grandTotalTimeBubble / 8000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("9000 merge sort              " + (totalInstructionBubble / 9000) + "     " + Math.sqrt(totalInstructionBubble / 9000) + "              " + (grandTotalTimeBubble / 9000) + "         " + Math.sqrt(grandTotalTimeBubble / 9000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("10000 merge sort              " + (totalInstructionBubble / 10000) + "     " + Math.sqrt(totalInstructionBubble / 10000) + "              " + (grandTotalTimeBubble / 10000) + "         " + Math.sqrt(grandTotalTimeBubble / 10000));
	   System.out.println("___________________________________________________________________________________________________");
	   // System.out.println("Instruction Counter Total is " + totalInstructionMerge);
       // System.out.println("Total Time is " + grandTotalTimeMerge);
	   //
	   // Quick Sort Summary
	   System.out.println("\n");	   
	   System.out.println("___________________________________________________________________________________________________");
       System.out.println("                                              array size = 1000 to 10000");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("                          instruction counter                           run time");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("sorting algorithm      average     standard deviation         average     standard deviation");
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("1000 quick sort              " + (totalInstructionBubble / 1000) + "     " + Math.sqrt(totalInstructionBubble / 1000) + "              " + (grandTotalTimeBubble / 1000) + "         " + Math.sqrt(grandTotalTimeBubble / 1000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("2000 quick sort              " + (totalInstructionBubble / 2000) + "     " + Math.sqrt(totalInstructionBubble / 2000) + "              " + (grandTotalTimeBubble / 2000) + "         " + Math.sqrt(grandTotalTimeBubble / 2000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("3000 quick sort              " + (totalInstructionBubble / 3000) + "     " + Math.sqrt(totalInstructionBubble / 3000) + "              " + (grandTotalTimeBubble / 3000) + "         " + Math.sqrt(grandTotalTimeBubble / 3000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("4000 quick sort              " + (totalInstructionBubble / 4000) + "     " + Math.sqrt(totalInstructionBubble / 4000) + "              " + (grandTotalTimeBubble / 4000) + "         " + Math.sqrt(grandTotalTimeBubble / 4000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("5000 quick sort              " + (totalInstructionBubble / 5000) + "     " + Math.sqrt(totalInstructionBubble / 5000) + "              " + (grandTotalTimeBubble / 5000) + "         " + Math.sqrt(grandTotalTimeBubble / 5000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("6000 quick sort              " + (totalInstructionBubble / 6000) + "     " + Math.sqrt(totalInstructionBubble / 6000) + "              " + (grandTotalTimeBubble / 6000) + "         " + Math.sqrt(grandTotalTimeBubble / 6000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("7000 quick sort              " + (totalInstructionBubble / 7000) + "     " + Math.sqrt(totalInstructionBubble / 7000) + "              " + (grandTotalTimeBubble / 7000) + "         " + Math.sqrt(grandTotalTimeBubble / 7000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("8000 quick sort              " + (totalInstructionBubble / 8000) + "     " + Math.sqrt(totalInstructionBubble / 8000) + "              " + (grandTotalTimeBubble / 8000) + "         " + Math.sqrt(grandTotalTimeBubble / 8000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("9000 quick sort              " + (totalInstructionBubble / 9000) + "     " + Math.sqrt(totalInstructionBubble / 9000) + "              " + (grandTotalTimeBubble / 9000) + "         " + Math.sqrt(grandTotalTimeBubble / 9000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("10000 quick sort              " + (totalInstructionBubble / 10000) + "     " + Math.sqrt(totalInstructionBubble / 10000) + "              " + (grandTotalTimeBubble / 10000) + "         " + Math.sqrt(grandTotalTimeBubble / 10000));
	   System.out.println("___________________________________________________________________________________________________");
	   // System.out.println("Instruction Counter Total is " + totalInstructionQuick);
       // System.out.println("Total Time is " + grandTotalTimeQuick);
	   //
	   // Randomized Sort Summary
	   System.out.println("\n");	   
	   System.out.println("___________________________________________________________________________________________________");
       System.out.println("                                              array size = 1000 to 10000");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("                          instruction counter                           run time");
	   System.out.println("___________________________________________________________________________________________________");
 	   System.out.println("sorting algorithm      average     standard deviation         average     standard deviation");
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("1000 randomized sort              " + (totalInstructionBubble / 1000) + "     " + Math.sqrt(totalInstructionBubble / 1000) + "              " + (grandTotalTimeBubble / 1000) + "         " + Math.sqrt(grandTotalTimeBubble / 1000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("2000 randomized sort              " + (totalInstructionBubble / 2000) + "     " + Math.sqrt(totalInstructionBubble / 2000) + "              " + (grandTotalTimeBubble / 2000) + "         " + Math.sqrt(grandTotalTimeBubble / 2000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("3000 randomized sort              " + (totalInstructionBubble / 3000) + "     " + Math.sqrt(totalInstructionBubble / 3000) + "              " + (grandTotalTimeBubble / 3000) + "         " + Math.sqrt(grandTotalTimeBubble / 3000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("4000 randomized sort              " + (totalInstructionBubble / 4000) + "     " + Math.sqrt(totalInstructionBubble / 4000) + "              " + (grandTotalTimeBubble / 4000) + "         " + Math.sqrt(grandTotalTimeBubble / 4000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("5000 randomized sort              " + (totalInstructionBubble / 5000) + "     " + Math.sqrt(totalInstructionBubble / 5000) + "              " + (grandTotalTimeBubble / 5000) + "         " + Math.sqrt(grandTotalTimeBubble / 5000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("6000 randomized sort              " + (totalInstructionBubble / 6000) + "     " + Math.sqrt(totalInstructionBubble / 6000) + "              " + (grandTotalTimeBubble / 6000) + "         " + Math.sqrt(grandTotalTimeBubble / 6000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("7000 randomized sort              " + (totalInstructionBubble / 7000) + "     " + Math.sqrt(totalInstructionBubble / 7000) + "              " + (grandTotalTimeBubble / 7000) + "         " + Math.sqrt(grandTotalTimeBubble / 7000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("8000 randomized sort              " + (totalInstructionBubble / 8000) + "     " + Math.sqrt(totalInstructionBubble / 8000) + "              " + (grandTotalTimeBubble / 8000) + "         " + Math.sqrt(grandTotalTimeBubble / 8000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("9000 randomized sort              " + (totalInstructionBubble / 9000) + "     " + Math.sqrt(totalInstructionBubble / 9000) + "              " + (grandTotalTimeBubble / 9000) + "         " + Math.sqrt(grandTotalTimeBubble / 9000));
	   System.out.println("___________________________________________________________________________________________________");
	   System.out.println("10000 randomized sort              " + (totalInstructionBubble / 10000) + "     " + Math.sqrt(totalInstructionBubble / 10000) + "              " + (grandTotalTimeBubble / 10000) + "         " + Math.sqrt(grandTotalTimeBubble / 10000));
	   System.out.println("___________________________________________________________________________________________________");
	   // System.out.println("Instruction Counter Total is " + totalInstructionRandom);
       // System.out.println("Total Time is " + grandTotalTimeRandom);
       
   }
	 
  }
  
}   // end class SortAlgor