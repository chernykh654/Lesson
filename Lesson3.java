/**
 * Java. Level 1. Lesson 3.  homework
 *
 * @author Sergey Chernykh
 * @version dated Aug 04, 2017
 */
package newLesson;

import java.util.Random;
import java.util.Scanner;
/*
Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3
попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли
указанное пользователем число чем загаданное, или меньше. После победы или проигрыша
выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
public class Lesson3 {
    public static void main(String[] args) {
        int t = 1;
        int g = 1;
        int g1 = 1;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int x = rand.nextInt(10);
        while ( t == 1){
            System.out.println("Угадай загаданное число от 0 до 9   !!!! У вас есть 3 попытки угадать  ");
            for (int i = 0; i < 3; i++) {
                System.out.println("Попытка - " + (3 - i));
                System.out.print("Введите ваше число  -  ");
                int a = sc.nextInt();
                if (a == x) {
                    System.out.println("Вы победили. Загаданное число было - " + x);
                    break;
                } else {
                    if (a > x) {
                        System.out.println("Загаданное число  меньше");
                    } else {
                        System.out.println("Загаданное число  больше");
                        if (i == 2) {
                            System.out.println("Вы проиграли!!! Загаданное число - " + x);
                        }
                    }
                }
            }
            System.out.println("Хотите сыграть еще 1 - ДА!!! 0 - НЕТ!!! ");
            System.out.print("ДА(1)/НЕТ(0)  -   ");
            t = sc.nextInt();
        }

        /*
* Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
"cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
"peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если
слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
*/
        char s1, s2;
        while (g == 1) {
            System.out.println("Угадай загаданное слово  !!!!   ");
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                    "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                    "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            int v = rand.nextInt(words.length);
            String h = words[v];

            while (g1 == 1) {

                System.out.println("Варианты загаданного слова -  apple, orange, lemon, banana, apricot, avocado, broccoli, carrot, " +
                        "cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, olive, pea, " +
                        "peanut, pear, pepper, pineapple, pumpkin, potato");
                System.out.print("Введите ваше слово  -  ");
                String str = sc.next();
                if (str == h) {
                    System.out.println("You WIN!!!!!");
                    break;

                } else {
                    for (int k = 0; k < 15; k++) {
                        s1 = str.charAt(k);
                        s2 = h.charAt(k);
                        if ( s1 == s2) {
                            System.out.print(s1);
                        } else {
                            System.out.print("#");
                        }
                    }
                    System.out.println("Вы не угадали Попробуйте еще раз !");
                }
            }
            System.out.println("Хотите сыграть еще 1 - ДА!!! 0 - НЕТ!!! ");
            System.out.print("ДА(1)/НЕТ(0)  -   ");
            g = sc.nextInt();

        }


    }
}