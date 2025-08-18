package forLoops;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 14;
        int prime =1;
        for(int i =1;i<=97;i++){
            if(i%2==0){
                prime=1;

            }
        }
        if(prime==1){
            System.out.println( num+"= number is prime");
        }else{
            System.out.println(num+ "= number is not prime");
        }
    }
}
