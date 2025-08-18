package Task_1;

public class Employee {
    int id;
    String name ;
    String address;
    int age ;
    String gender;
    int exp;
    long phoneNumber;
    String emailId;
    double salary;

    public void assignValues(int id , String name ,String address , int age, String gender , int exp ,long phoneNumber , String emailId, double salary ){

        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.exp = exp;
        this.phoneNumber = phoneNumber;
       this.emailId = emailId;
        this.salary = salary;

    }
    public void printValues(){
        System.out.println(" ------Employee Detailes -----");
        System.out.println("ID = "+ id );
        System.out.println("Name = "+ name);
        System.out.println("Address = "+ address);
        System.out.println("Age = "+ age);
        System.out.println("experience = "+ exp);
        System.out.println("Gender = "+ gender);
        System.out.println("PhoneNumber = "+ phoneNumber);
        System.out.println("EmailId = "+ emailId);
        System.out.println("Salary = "+ salary);

    }
    public void printContactDetails(){
        System.out.println("-------ContactDetails------");
        System.out.println("Name = "+ name);
        System.out.println("Address = "+ address);
        System.out.println("PhoneNumber = "+ phoneNumber);
        System.out.println("EmailId = "+ emailId);

    }
    public void votingEligibility(){
        System.out.println("-----votingEligibility----");
        if(age>40){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
    public void calculateHike(){
        System.out.println("-------calculateHike-----");
        double hikePercent =0;
        if(exp>1&& exp<=5){
            hikePercent = 0.05;

        }else if(exp >6&& exp<=10){
            hikePercent=0.10;

        }else if(exp>10){
            hikePercent=0.25;

        }
        double hikeAmount = salary * hikePercent;
        double newSalary = salary + hikeAmount;

        System.out.println("Experience: " + exp + " years");
        System.out.println("Hike %   : " + (hikePercent * 100) + "%");
        System.out.println("New Salary after Hike: ₹" + newSalary);


    }
}
