package Lesson;

/**
 * Created by Сергей on 01.08.2017.
 */
public class Lesson2 {
    public static void main(String[] args) {
/*1.
Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/
        System.out.println("///////////////////////Задание 1///////////////////////");
        int arr [] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("///////////////////////Задание 2///////////////////////");

/*2. Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
*/
        int arr2 [] = new int[8];
        for(int j = 0; j < arr2.length; j++) {
            arr2 [j] = j * 3;
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        System.out.println("///////////////////////Задание 3///////////////////////");
/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
*/
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int t = 0; t < arr3.length; t++) {
            if (arr3[t] < 6) {
                arr3[t] *= 2;
            }
            System.out.print(arr3[t] + " ");
        }
        System.out.println();
        System.out.println("///////////////////////Задание 4///////////////////////");

/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
*/
        int arr4 [] [] = new int[4][4];


        for (int i = 0; i < arr4.length; i++ ) {
            for (int j = 0; j < arr4.length; j++ ) {
                if (i == j) {
                    arr4[i][j] = 1;
                    int v = arr4.length - 1 - i;
                    arr4[i][v] = 1;
                }
            }

        }
        System.out.println();
        System.out.println("///////////////////////Задание 5///////////////////////");

/*5**. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
*/
        int arr5 [] = {1, 20 , 13, -16, 50, 51, -20};
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) max = arr5[i];
            if (arr5[i] < min) min = arr5[i];
        }
        System.out.println("Максимальное чило массива - " + max);
        System.out.println("Минимальное чило массива - " + min);
        System.out.println();
        System.out.println("///////////////////////Задание 6///////////////////////");
/*6**. Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
 Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
 checkBalance ([2, 1, 1, 2, 1]) → false,
  checkBalance ([10, || 10]) → true,
  граница показана символами ||, эти символы в массив не входят.
*/
        int arr6_1 [] = {1, 1, 1, 2, 1};
        int arr6_2 [] = {2, 1, 1, 2, 1};
        int arr6_3 [] = {10, 10};
        int arr6_4 [] = {1, 20 , 13, -16, 50, 51, -20};
        int arr6_5 [] = { 2, 7};
        boolean b1 = checkBalance(arr6_1);
        boolean b2 = checkBalance(arr6_2);
        boolean b3 = checkBalance(arr6_3);
        boolean b4 = checkBalance(arr6_5);
        System.out.println();
        System.out.println("///////////////////////Задание 7///////////////////////");
/*7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
*/

        offsetN(arr6_4, 3);
        for(int t = 0; t < arr6_4.length; t++) {
            System.out.print(arr6_4[t] + " ");
        }
    }
    // Метод определение наличия места, в котором сумма левой и правой части массива равны.
    static boolean checkBalance(int arr6[]) {
        int summ = 0;
        int summ_ = 0;
        for (int i = 0; i < arr6.length; i++) {
            summ += arr6[i];
        }
        if (summ % 2 == 0) {
            summ /= 2;
            for (int i = 0; i < arr6.length; i++){
                summ_ += arr6[i];

                if (summ == summ_){
                    break;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
    // /////////////////////////////////////////////////////////////////
    static void offsetN(int arr7[], int n) {
        for(int g = 0; g < n; g++ ) {
            int ram = 0;
            int ram_ = 0;
            for(int i = 0; i < arr7.length; i++ ) {
                ram_ = arr7[i];
                arr7[i] = ram;
                ram = ram_;
                if (i == arr7.length - 1) {
                    arr7[0] = ram_;
                }
            }

        }
    }
}