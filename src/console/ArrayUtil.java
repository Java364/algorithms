package console;

import java.util.Scanner;

public class ArrayUtil {
    public static int[] parseCustomInputToArray(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.contains(",")||!s.contains(" ")) {
            System.out.println("You entered in wrong format. Please, try again.");
            return null;
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
