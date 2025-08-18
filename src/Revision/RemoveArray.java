package Revision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveArray {
    public static void main(String[] args) {
        int array [] = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> num= new HashSet<>();
        for(int number : array)
            num.add(number);
        System.out.println(num);


    }
}
