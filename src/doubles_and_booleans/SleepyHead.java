package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
       int vaca=JOptionPane.showConfirmDialog(null, "Is it a vacation","Sleepy head", JOptionPane.YES_NO_OPTION);
       if (vaca==0) {
    	   isVacation=true;
    	   System.out.println("sleep in");
       }
       else if (vaca==1) { 
    	   isVacation=false;
        /* You MUST use the above boolean variables in your code */
       //if (isVacation=false) {
      int answer=JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
      
       if(answer==0) {
    	   isWeekday=true;
       System.out.println("get up lazybones!");
       }if (answer==1) {
    	   System.out.println("sleep in");
    	   
       }
    	   
       }
       /*
         * Ask the user for these values using a confirm dialog like the one below
         JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
    


        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
