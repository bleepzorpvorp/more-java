import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] swapNumbers = {9, 3};

        SortingAlgorithms swap = new SortingAlgorithms(swapNumbers);

        System.out.println("Before Swap: " + Arrays.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("After Swap: " + Arrays.toString(swapNumbers));
        int[] selectionNumbers = {9, 3, 1, 5, 10, 2, 4, 8, 7, 6};
        SortingAlgorithms selection = new SortingAlgorithms(selectionNumbers);
        selection.selectionShort();
        System.outprintln("Selection Sort:" + Arrays.toString(selectionNumbers));

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

