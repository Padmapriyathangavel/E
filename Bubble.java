import java.util.Arrays;

public class BubbleSortStrings {

 public static void main(String[] args) {

 String[] arr = {“banana”, “apple”, “orange”, “grapes”, “pineapple”};

 bubbleSort(arr);

 System.out.println(“Sorted Array: ” + Arrays.toString(arr));

 }

 public static void bubbleSort(String[] arr) {

 int n = arr.length;

 for (int i = 0; i < n – 1; i++) {

 for (int j = 0; j < n – i – 1; j++) {

 if (arr[j].compareTo(arr[j + 1]) > 0) {

 // swap arr[j] and arr[j+1]

 String temp = arr[j];

 arr[j] = arr[j + 1];

 arr[j + 1] = temp;

 }

 }

 }

 }

}
