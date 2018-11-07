package console;

import java.util.Scanner;

public class ArrayUtil {
    public static int[] parseCustomInputToArray(String s){
        if (s.contains(",")||!s.contains(" ")) {
            throw new IllegalArgumentException();
        }else{
            String[] s1 = s.split(" ");
            int[] array = new int[s1.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(s1[i].trim());
            }
            return array;
        }
    }

    public static void printArray(int[] array){
        System.out.println("");
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println("");
    }
}
