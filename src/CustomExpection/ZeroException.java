package CustomExpection;

public class ZeroException {
    public static void main(String[] args) throws DivideByZeroException {

        int a = 12;
        int b = 0;
        int result = a/b;

        if(b==0){
            throw new DivideByZeroException("cannot divide zero !!");
        }else{
            System.out.println( "Result will be : "+result);
        }

    }
}


  class DivideByZeroException extends Exception{
    public DivideByZeroException(String message){

        super(message);
    }
  }