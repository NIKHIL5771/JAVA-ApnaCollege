package JavaApnaCollege;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int physics = 97;
        int chem = 98;
        int math = 96;

        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2]= 96;


    // sort
    System.out.println(marks[0]);
    Arrays.sort(marks);
    System.out.println(marks[0]);
    }
    
}
