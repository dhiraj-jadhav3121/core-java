package Method;

public class Factorial {
    public static void main(String[] args) {
        Factorial f=new Factorial();
        f.factor(6);
    }
    public void factor(int n){
        int sum=1;
        for(int i =1;i<=n;i++){
          sum =sum*i;
        }
        System.out.println(sum);

    }

}
