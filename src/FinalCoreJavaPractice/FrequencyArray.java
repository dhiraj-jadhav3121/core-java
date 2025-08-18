package FinalCoreJavaPractice;

public class FrequencyArray {
    public static void main(String[] args) {

        int array []= {1,2,3,4,3,2,1,5};

        boolean visit []=new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if(visit[i])continue;

            int count =0;
            for (int j = i=1; j < array.length ; j++) {
                if(array[i]==array[j]){
                    count++;
                    visit[j]=true;

                }

            }
            System.out.println(array[i]+":"+count);


        }


    }
}
