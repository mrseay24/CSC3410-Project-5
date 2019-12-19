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

public class Timer {

	  Timestamp startTime = new Timestamp(System.currentTimeMillis());  
	  Timestamp endTime = new Timestamp(System.currentTimeMillis());
	  //int diff = 0;
	  //long startTime = 0;  
	  //long endTime = 0;	
	  long diff = 0;
	  
	  public void start() {
		 try {
			   Thread.sleep(2);
		 }
		 catch (Exception exp1) {
						   
		 }
		 this.startTime = new Timestamp(System.currentTimeMillis());
	  }

	  public void end() {
	    try {
			   Thread.sleep(3);
		}
		catch (Exception exp1) {
					   
		}
		this.endTime = new Timestamp(System.currentTimeMillis());
	  }

	  public Timestamp getStartTime() {
	    return this.startTime;
	  }

	  public Timestamp getEndTime() {
	    return this.endTime;
	  }

	  public long getTotalTime() {
		//diff = endTime.getNanos() - startTime.getNanos();
		diff = endTime.getTime() - startTime.getTime();  
	    return diff;
	  }

	}