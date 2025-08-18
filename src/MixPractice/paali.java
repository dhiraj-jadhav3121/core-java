package MixPractice;

import TodayPractice30.ReverseNumber;

public class paali {
    public static void main(String[] args) {
        int num=222;
      int ReverseNumber=0;
      int OriginalNumber=num;

      while(num!=0){
          int digit =num%10;
          ReverseNumber=ReverseNumber*10+digit;
          num=num/10;

      }if(ReverseNumber==OriginalNumber){
            System.out.println("the palimdrome number is ="+ OriginalNumber);
        }else{
            System.out.println(" not the palimdrome number is ="+ OriginalNumber);


        }
    }
}
