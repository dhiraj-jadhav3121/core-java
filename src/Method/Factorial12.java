package Method;

import java.util.Scanner;

public class Factorial12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        Factorial12 f=new Factorial12();
        int number = sc.nextInt();
        f.factor(number);

    }
    public void factor(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;

        }
        System.out.println(sum);
    }
}
