/**
 * Date
 */
public class Date {
    
    // Instance Variables
    int day;
    int month;
    int year;

    // Default Constructor (No Parameters)
    public Date(){
        day = 1;
        month = 1;
        year = 1;
    }

    // Parameterized constructor (3 Parameters)
    public Date(int newDay, int newMonth, int newYear){
        day = newDay;
        month = newMonth;
        year = newYear;
    }
    
    // Parameterized constructor (2 Parameters)
    public Date(int newDay, int newMonth){
        day = newDay;
        month = newMonth;
    }
    
    // Parameterized constructor (1 Parameter)
    public Date(int newDay){
        day = newDay;
    }
    
    // A simple print method
    public void printDate(){
        // Print the date like this: day/month/year
        System.out.println(day+"/"+month+"/"+"/"+year);
    }

}
