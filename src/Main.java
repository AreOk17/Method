import javax.swing.*;

class Scratch {
        public static void main(String[] args) {
            int year = 2022;
            boolean leapYear = isLeapYear(year);
            printYearInfo(year, leapYear);
        }
        private static boolean isLeapYear(int year) {
            return year % 4 == 0 && year % 100 != 0  || year % 400 == 0;

        }
        private  static void  printYearInfo(int year, boolean leapYear) {
            if (leapYear) {
                System.out.println("Год " + year + " високосный ");
            }
            else {
                System.out.println("Год "+year+ " не високосный");

            }
        }
    }