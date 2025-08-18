package CustomExpection;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingCheck {
    public static void main(String[] args) {
        int age =16;
        try{
            checkAge(age);

        }catch(InvalidAgeException e){
            System.out.println("Exception caught : "+e.getMessage());

        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Invalid Age for voting");

        }else{
            System.out.println("You are eligible to vote.");
        }
    }
}

