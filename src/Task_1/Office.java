package Task_1;

public class Office {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.assignValues(45 , "Dhiraj" ,"Hinjewadi" , 23, "Male" , 12 ,7821958749L , "dhirajj8048@gmail.com", 50000 );


        e.printValues();
        e.printContactDetails();
        e.votingEligibility();
        e.calculateHike();


    }
}
