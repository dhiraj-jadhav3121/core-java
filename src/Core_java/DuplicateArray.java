package Core_java;

public class DuplicateArray {
    public static void main(String[] args) {
        int number []= {1,2,3,4,5,32,1,2,3};
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]==number[j]){
                    System.out.print(number[i]+" ");
                }
            }
        }
    }
}
