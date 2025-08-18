package forLoops;

public class RevesreNumber {
    public static void main(String[] args) {


       int num =7654321;
       int reversed =0;
       int count= 0;

       while(num!=0){
           count=num%10;
           reversed = reversed*10+count;
           num = num/10;


       }
        System.out.println(reversed);
    }

}

