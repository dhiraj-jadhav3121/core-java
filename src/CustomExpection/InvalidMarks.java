package CustomExpection;

import java.util.Collection;
import java.util.Collections;

public class InvalidMarks {
    public static void main(String[] args) throws InvalidMarksException {
        int mark = 33;

         if(mark<0||mark>100){
             throw new InvalidMarksException("marks should be between 0 and 100");
         }else{
             System.out.println("mark enter :"+mark);
         }


    }
}
   class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);

    }
   }