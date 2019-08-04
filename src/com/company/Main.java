import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        int[] addArray = {1}; //то, что запишем в начале массива
        int offset = addArray.length;
        int a[] = {2, 3, 4, 5, 6, 7, 8, 9, 10}; //Массив, который будем сдвигать
        int b[] = new int[a.length + offset];
        System.out.print("Массив  до   сдвига: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            b[i + offset] = a[i];
            a[i] = b[i];
        }
        System.out.println();
        for (int i = 0; i < offset; i++) {
            a[i] = addArray[i];
        }
        System.out.print("Массив после сдвига: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


class task2 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 1, 3, 3};
        int n = a.length;
        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (a[j] != a[i]) {
                    if (m != j) a[m] = a[j];
                    m++;
                }
            }
        }
        if (n != a.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = a[i];

            a = b;
        }
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }
}



class task3 {
    public static void main(String[] args) {
        int[] a = {2, 3, 10, 12};
        int[] b = {1, 5, 8, 9};
        int[] c = new int[a.length + b.length];
//Объединеие двух массивов int C
        for (int i = 0; i < c.length / 2; i++) {
            if (a[i] > b[i]) {
                c[i + i] = b[i];
                c[i + i + 1] = a[i];
            } else {
                c[i + i] = a[i];
                c[i + i + 1] = b[i];

            }


        }

///элемент 1-го массива меньше предыдущего элемента

        for (int i = 0; i < c.length - 1; i++) {
            int t = c[i];
            if (c[i] > c[i + 1]) {
                c[i] = c[i + 1];
                c[i + 1] = t;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}


//class task4//
//public static void main(String[] args) {//

//}
//}//

