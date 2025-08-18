package Core_java;

public class FrequencyElement {
    public static void main(String[] args) {
        int number[]= {1, 2, 2, 3, 1};
        int count =0;
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length;j++){
                if(number[i]==number[j]){
                    count++;
                    if(count==1){
                        System.out.println(number[i]+" "+count);
                        count=0;
                    }

                }



            }



        }




    }
}
