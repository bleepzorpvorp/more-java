public class MedianArrary {
    public static void main(String[] args) {
        int[] array = {45, 67, 80, 30, 7, 9, 10,85, 60, 70};
        int sum = 0;
        int length = array.length;
        int median = length / 2;
        median = median - 1;
        int middle = length % 2;
        System.out.println(array[median]);
        if (middle == 0) {
            int median2 = median + 1;
            System.out.println(array[median2]);

        }
        
    }
}