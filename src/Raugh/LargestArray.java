package Raugh;

public class LargestArray {
    public static void main(String[] args) {

        int array [] = {1,2,3,4,8,5,6,7};

        int largest =array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i]>largest){

                largest=array[i];

            }
        }
        System.out.println(largest);

    }
}
