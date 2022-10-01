package ua.lviv.lgs.lessonlogos8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        // Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб
        // регістр букв був не важливим)

        Month[] mas = Month.values();
        while (true) {
            System.out.println("Enter month: ");
            Scanner sc = new Scanner(System.in);
            String month = sc.next().toUpperCase();
            boolean flag = isMonthPresent(mas, month);

            if (!flag) {
                System.out.println("Month doesnt exit");
                break;
            }

            // Вивести всі місяці з такою ж порою року.

            flag = false;
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


    
    
    
    
    
    private static boolean isMonthPresent(Month[] mas, String month) {
        boolean flag = false;

        for (Month m : mas) {

            if (m.name().equals(month)) {
                System.out.println("Month exist");
                flag = true;
            }
        }
        return flag;
    }

}
