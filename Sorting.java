import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] swapNumbers = {9, 3};

        SortingAlgorithms swap = new SortingAlgorithms(swapNumbers);

        System.out.println("Before Swap: " + Arrays.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("After Swap: " + Arrays.toString(swapNumbers));

    }
}


class SortingAlgorithms {

        //data or attributes 
        private int[] list;

        //constructor 
        public SortingAlgorithms(int[] newList) {
            this.list = newList;
        } 

        //behavior
       // int[] swapNumbers = {9, 3}; 
        public void swapNumbers() {
            int temp = list[0]; //9
            list[0] = list[1]; // 9 <-- 3
            list[1] = temp;
        }   

        public void selectionSort() {
            list n = list.length;
            System.out.println("length of list" + n) {
                int minIndex = i;
            }
            //out loop
            for (int i = 0; i < n; i++){
                //conditional logic to compare values
                if (list[j] < minIndex){
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }

}

