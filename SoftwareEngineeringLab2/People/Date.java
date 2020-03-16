package People;

import java.io.OutputStream;
import java.io.PrintStream;

public class Date implements Cloneable {

    int day, month, year;

    // constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // print method
    public void printDate(PrintStream ps){
        ps.print(getDay()+"/"+getMonth()+"/"+getYear()+" \n");
    }

    int getDay(){
        return day;
    }

    int getMonth(){
        return month;
    }

    int getYear(){
        return year;
    }

    // returns difference in years between the Date parameter and itself
    public int diffInYears(Date date){
        int diffInYears = 0;
        diffInYears = this.year - date.getYear();
        return diffInYears;
    }
    
    // creates and returns a copy of date object
    protected Date clone() throws CloneNotSupportedException{
    	return (Date) super.clone();
    }
    
}