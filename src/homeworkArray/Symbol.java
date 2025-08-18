package homeworkArray;

import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        char[] symbol=new char[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR CHARACTER : ");

        for(int i =0;i< symbol.length;i++){
             symbol[i]= sc.next().charAt(0);

        }
        for(int i = 0;i< symbol.length;i++){
            if(!(symbol[i]>='A' && symbol[i]<='Z')&& !(symbol[i]>='a' && symbol[i]<='z')){
                symbol[i]= ' ';


            }
        }
        System.out.println("Result : ");
        for(int i=0;i<symbol.length;i++){
            System.out.print(symbol[i]+" ");
        }

    }
}
