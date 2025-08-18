package CustomExpection;

import java.util.Scanner;

public class InvalidEmail {
    public static void main(String[] args) throws InvalidEmailException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email :");
        String email= sc.next();
        if(!email.contains("@")||!email.endsWith(".com")){
           throw new InvalidEmailException("Invalid email format ");

           }else{
            System.out.println("valid email: "+email);
        }


    }
}

class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);

    }
}