package IMP;

public class PrimeNumber {
    public static void main(String[] args) {
        int num =17;
        int count =0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
                break;


            }
        }
        if(num>1 && count==0){
            System.out.println(num + " = PrimeNumber");
        }else{
            System.out.println(num + " = NOTPrimeNumber");
        }
    }
}
