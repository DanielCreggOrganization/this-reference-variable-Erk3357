/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Create a Date object using the default constructor
        Date dateObject1 = new Date();
        System.out.println(dateObject1.year);
        // Create 3 more Date objects using all the paramiterised constructors
        Date dateObject2 = new Date(20, 1, 2020);
        
        Date dateObject3 = new Date(31);
        System.out.println(dateObject3.day);
        System.out.println(dateObject3.year);
        // Call the printDate() method for each object you create.
        //printDate();
    }
}
