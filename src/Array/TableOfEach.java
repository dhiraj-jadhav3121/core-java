package Array;

public class TableOfEach {
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0;i<numbers.length;i++){
            for(int j=1;j<numbers.length;j++)
                System.out.print(numbers[i]*j+" ");
                System.out.println();
            }
        }
    }

//    int n[] = {8, 1, 2, 4, 3, 7, 6, 9, 5, 12};
//
//		for (int i = 0; i < n.length; i++) {
//
//        for (int j = 1; j <= 10; j++)
//        System.out.print((n[i] * j) + " ");
//
//        System.out.println();
//        }