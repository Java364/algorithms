package console;

class ZeroValue extends Exception{}
public class CountingSorter implements  Sort {
 static void dd(){
     int n =2;
     if (n==2){
         return;
     }
 }
      @Override
    public int[] sort( int[] array ) {
        int number = array.length;

        if (number == 0){
            try {
                throw new ZeroValue();
            } catch (ZeroValue e) {
                System.out.println("Element can not contain zero");
        }
            int max = array[0], min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < array.length; i++)
            count[array[i] - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                array[j++] = i + min;


}return array;


}}
