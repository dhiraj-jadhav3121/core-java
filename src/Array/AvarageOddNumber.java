package Array;

public class AvarageOddNumber {
    public static void main(String[] args) {

        //2. WAP to print average of all odd numbers of the array.


        int number[]= {13,15,17,22,44,33};

        int sum=0;
        for(int i=0;i< number.length;i++){

            if(number[i]%2==1){
                sum= sum + number[i];


            }

        }
        System.out.println((float)sum/ number.length);

    }
}

