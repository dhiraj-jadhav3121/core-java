package Core_java;

public class MissingNumber {
    public static void main(String[] args) {
        int number [] ={1,2,3,5,6};

        int n= number.length+1;
        int expectedSum=n*(n+1)/2;
        int actualSum =0;

        for(int i=0;i<number.length;i++){
            actualSum+=number[i];

        }
        int missing = expectedSum-actualSum;
        System.out.println("Missing Number : "+missing);
    }
}
