import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(bubbleSort(arr, 10)));


    }

    public static int[] bubbleSort(int[] array, int size){
        int temp;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++ ){
                if(array[i] < array[j]){
                    temp = array[j];
                    array[j]=array[i];
                    array[i]= temp;
                }
            }
        }
        return array;
    }
}
