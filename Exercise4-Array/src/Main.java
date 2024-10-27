import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        1.Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to
2 Test Data:
array = 50, -20, 0, 30, 40, 60, 10
Sample Output: false
         */
        int[] array = {50,-20,0,30,40,60,10};
        if (array[0] == array[array.length - 1] && array.length>=2){
            System.out.println("true ");
        }else if(array[0] != array[array.length - 1] ){
            System.out.println("false ");
        }else{
            System.out.println("the count in the array is less then 2 ");
        }
                /*
2.Write a Java program to find the numbers greater than the average of the
numbers of a given array.
Original Array:
[1, 4, 17, 7, 25, 3, 100]
Expected Output:
The average of the said array is: 22.0 The numbers in the said array that are
greater than the average are: 25 100
         */
        int[] array2 = {1, 4, 17, 7, 25, 3, 100};
        int avg =0;
        for (int n2:array2){
            avg +=n2;
        }
        avg = avg / array2.length;
        ArrayList<Integer> array_list2 = new ArrayList();
        for (int n2:array2){
            if(avg < n2)
                array_list2.add(n2);
        }
        System.out.println("The average of the said array is: "+avg+" The numbers in the said array that are \n" +
                "greater than the average are: "+array_list2);

                /*
3.Write a Java program to get the larger value between first and last
element of an array of integers.
Original Array:
[20, 30, 40]
Sample Output:
Larger value between first and last element: 40
         */
        int[] array3 = {20, 30, 40};
        int largest = 0;
        for (int n3:array3){
            if (n3 > largest ){
                largest = n3;
            }
        } System.out.println("Larger value between first and last element: "+largest);
                /*
4.Write a Java program to swap the first and last elements of an array and
create a new array.
Original Array:
[20, 30, 40]
Sample Output:
New array after swapping the first and last elements: [40, 30, 20]
         */
        int[] array4 = {20, 30, 40};
        int[] array4_1 = new int[array4.length];
        for (int i = 0; i < array4.length; i++) {
            if (i ==0) {
                array4_1[i] = array4[array4.length-1];
            }else if (i == array4.length-1){
                array4_1[i] = array4[0];
            }else{
                array4_1[i] = array4[i];
            }
            }
        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(array4_1));

                /*
5. Write a program that places the odd elements of an array before the
even elements.
Original Array:
[2,3,40,1,5,9,4,10,7]
Sample Output:
[3,1,5,9,7,2,40,4,10]
         */

        ArrayList<Integer> array5 = new ArrayList<Integer>();
        array5.add(2); array5.add(3); array5.add(40); array5.add(1); array5.add(5); array5.add(9);
        array5.add(4); array5.add(10); array5.add(7);
        int num =0;
        int m =0;
        int y =0;
        for (int i=0; i<array5.size();i++){
            if (array5.get(i) % 2 ==1 ){
                m = array5.get(i);
                y = array5.get(num);
                array5.set(num,m);
                array5.set(i,y);
                num++;
            }
        }
        System.out.println(array5);
                /*
6. Write a program that test the equality of two arrays.
[2,3,6,6,4] [2,3,6,6,4]
Sample Output: true
         */

        int[] array6_1 = {2,3,6,6,4};
        int[] array6_2 = {2,3,6,6,4};
        boolean equal =true;
        for (int i = 0; i < array6_1.length; i++) {
            if (array6_1[i] == array6_2[i]){
                continue;
            }else {
                equal = false;
                break;
            }
        }
        if(equal){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}