/*
 * LOGOS It Academy enum file
 * 
 * */

package ua.lviv.lgs.lessonlogos8;


/**
 * @since java 1.8
 * @author Oleg
 * @version 1.1
 * */

import java.util.Scanner;

public class Main {
    
    
    /**
     * @param Month[] mas, String month
     * @exception WrongInputConsoleParametersException
     * @author Oleg
     * @see java code convention
     * */
    
    // Викидайте даний exception, коли користувач введе неправильні дані.  
    public void isMonthPresent(Month[] mas, String month) throws WrongInputConsoleParametersException{
        
        /* docs for boolean */
        boolean flag = false;
        
        /* Checking for the existence of a month */
        for (Month m : mas) {
            if (m.name().equals(month)) {
                System.out.println("Month exist");
                flag = true;
            }
        }
        
        
        /* Throw new WrongInputConsoleParametersException */
        
        // Перевіряе чи є такий місяць, та викидає exception, коли користувач введе неправильні дані.
        
        if (!flag) {
            String message = "Invalid value. Please enter a valid month name.";
            throw new WrongInputConsoleParametersException(message);
        } 

        }

    /**
     * @param no input params
     * @author Oleg
     * @see java code convention
     * */
    public static void main(String[] args) throws WrongInputConsoleParametersException {

        /* reading the name of the month */
        
        // Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб
        // регістр букв був не важливим)

        Month[] mas = Month.values();
        while (true) {
            System.out.println("Enter month: ");
            Scanner sc = new Scanner(System.in);
            String month = sc.next().toUpperCase();
            Main exc = new Main();
            exc.isMonthPresent(mas, month);
            
            
            /* outputs all months with the same season */
            
            // Вивести всі місяці з такою ж порою року.

            boolean flag = false;
            Month month2 = Month.valueOf(month);
            for (Month m : mas) {
                if (m.getSeason().name().equals(month2.getSeason().toString())) {
                    flag = true;
                }
            }
            System.out.println("\nMonths with the same season: ");
            if (flag) {

                for (Month mon : mas) {
                    if (mon.getSeason().toString().equalsIgnoreCase(month2.getSeason().toString())) {
                        System.out.println(mon + " - " + mon.getSeason().toString());
                    }
                }
            }

            if (!flag) {
                System.out.println("Month doesnt exit");
            }

            
            /* display all months that have the same number of days */
            
            // Вивести всі місяці які мають таку саму кількість днів.

            flag = false;
            for (Month m : mas) {
                if (m.getDays() == month2.getDays()) {
                    flag = true;
                }
            }
            System.out.println("\nMonths with the same number of days: ");
            if (flag) {

                for (Month mon : mas) {
                    if (mon.getDays() == month2.getDays()) {
                        System.out.println(mon + " - " + mon.getDays());
                    }
                }
            }

            if (!flag) {
                System.out.println("Month doesnt have same number of days");
            }
            
            
            /* display all months with a smaller number of days */
            
            // Вивести на екран всі місяці які мають меншу кількість днів.

            flag = false;
            for (Month m : mas) {
                if (m.getDays() < month2.getDays()) {
                    flag = true;
                }
            }
            System.out.println("\nMonths with a smaller number of days: ");
            if (flag) {

                for (Month mon : mas) {
                    if (mon.getDays() < month2.getDays()) {
                        System.out.println(mon + " - " + mon.getDays());
                    }
                }
            }

            if (!flag) {
                System.out.println("Month doesnt have smaller number of days");
            }

            
            /* display all months with a larger number of days */
            
              //Вивести на екран всі місяці які мають більшу кількість днів.

            flag = false;
            for (Month m : mas) {

                if (m.getDays() > month2.getDays()) {
                    flag = true;
                }
            }
            System.out.println("\nMonths with a larger number of days: ");
            if (flag) {

                for (Month mon : mas) {
                    if (mon.getDays() > month2.getDays()) {
                        System.out.println(mon + " - " + mon.getDays());
                    }
                }
            }

            if (!flag) {
                System.out.println("Month doesnt have larger number of days");
            }

            
            /* display the next season */    
            
         // Вивести на екран наступну пору року.
            
            Season[] mass = Season.values();
            flag = true;
            int ordinalSeason  = month2.getSeason().ordinal();
 
            System.out.println("\nNext season: ");
            if (flag) {
                if(ordinalSeason == (mass.length -1)) {
                    ordinalSeason = 0;
                    System.out.println(mass[ordinalSeason]);
                }else {
                    System.out.println(mass[ordinalSeason+1]); 
                }
            }
            
            
            /* display the previous season */   
            
         // Вивести на екран попередню пору року.
            
 
            System.out.println("\nPrevious season: ");
            if (flag) {
                if(ordinalSeason == 0) {
                    ordinalSeason = (mass.length -1);
                    System.out.println(mass[ordinalSeason]);
                }else {
                    System.out.println(mass[ordinalSeason-1]); 
                }
            }
            
            
            /* display all months with an even number of days */   
            
            //  Вивести на екран всі місяці які мають парну кількість днів.
            

            flag = false;
            
            for (Month m : mas) {
                if ((m.getDays())%2==0) {
                    flag = true;
                }
            }
            System.out.println("\nMonths with even number of days: ");
            if (flag) {

                for (Month mon : mas) {
                    if ((mon.getDays())%2==0) {
                        System.out.println(mon + " - " + mon.getDays());
                    }
                }
            }

            if (!flag) {
                System.out.println("Month doesnt have even number of days");
            }

            
            /* display all months with an odd number of days */   
            
            //  Вивести на екран всі місяці які мають непарну кількість днів.
            

            flag = false;
            
            for (Month m : mas) {
                if ((m.getDays())%2!=0) {
                    flag = true;
                }
            }
            System.out.println("\nMonths with odd number of days: ");
            if (flag) {

                for (Month mon : mas) {
                    if ((mon.getDays())%2!=0) {
                        System.out.println(mon + " - " + mon.getDays());
                    }
                }
            }

            if (!flag) {
                System.out.println("Month doesnt have odd number of days");
            }
            
            
            /* display whether the month entered from the console has an even number of days */   
            
            
            //Вивести на екран чи введений з консолі місяць має парну кількість днів.

 
          System.out.println("\nDoes the month entered from the console have even number of days: ");


                  if (month2.getDays()%2==0) {
                      System.out.println(month2 + " has even number of days - " + month2.getDays());
                  }
                  else if (month2.getDays()%2!=0) {
                      System.out.println(month2 + " does not have even number of days - " + month2.getDays());
                  }
              }

            
            
        }



}
