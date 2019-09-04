/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sopheak.Project;

import java.util.Scanner;

public class FindDayinMonthUsing {
    public static void IfElse(){
    Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();
if(month==1){
	MonthOfName = "January";
			number_Of_DaysInMonth = 31;
}
else if(month==2){
		MonthOfName = "February";
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			number_Of_DaysInMonth = 29;
		} else {
			number_Of_DaysInMonth = 28;
		}
}
else if(month==3){
	MonthOfName = "March";
    number_Of_DaysInMonth = 31;
}
else if(month==4){
	MonthOfName = "April";
    number_Of_DaysInMonth = 30;
}
else if(month==5){
	MonthOfName = "May";
    number_Of_DaysInMonth = 31;
}
else if(month==6){
	MonthOfName = "June";
    number_Of_DaysInMonth = 30;
}

else if(month==7){
	MonthOfName = "July";
    number_Of_DaysInMonth = 31;
}
else if(month==8){
	MonthOfName = "August";
    number_Of_DaysInMonth = 31;
}
else if(month==9){
	MonthOfName = "September";
    number_Of_DaysInMonth = 30;
}
else if(month==10){
	MonthOfName = "October";
    number_Of_DaysInMonth = 31;
}
else if(month==11){
	MonthOfName = "November";
    number_Of_DaysInMonth = 30;
}
else if(month==12){
	MonthOfName = "December";
    number_Of_DaysInMonth = 31;
}
System.out.print("Using If Else :\n"+MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
}
    public static void SwitchCase(){
        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print("Using Switch Case :\n"+MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
    public static void main(String[] args) {
        IfElse();
        SwitchCase();
    }
}
