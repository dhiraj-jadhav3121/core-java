package homeworkArray;

public class ReplaceNumbers {
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60,70,80,90};

        for(int i=0;i< numbers.length-1;i+=2){

            int flag = numbers[i];
            numbers[i]=numbers[i+1];
            numbers[i+1]= flag;
        }
        for(int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+",");
        }



    }
}
