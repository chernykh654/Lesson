package Lesson.Lesson7;



/**
 * Java. Level 1. Lesson 7.  homework
 *
 * @author Sergey Chernykh
 * @version dated Aug 18, 2017
 */


import javax.swing.*;
import javax.swing.JFrame;

import java.util.Scanner;
public class Lesson7  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        //String a = new String("Hello");
        //String str = "Java";
        //a += " " + str;
        //System.out.println(a);
        //testString();
        //testStringBuilder();
        Cat cat1 = new Cat("Barsik1", 11);
        Cat cat2 = new Cat("Barsik2", 11);
        Cat cat3 = new Cat("Barsik3", 11);
        Cat cat4 = new Cat("Barsik4", 11);
        Cat cat5 = new Cat("Barsik5", 11);
        Cat cats[] = new Cat[]{cat1, cat2,cat3,cat4,cat5};
        Plate plate = new Plate(50);
        System.out.println(plate);
        for (int i = 0; i < cats.length;i++) {
            cats[i].eat(plate);
            System.out.println(plate);
        }
        System.out.println("Хотите добавить еды на тарелку ? если да то введите 1 нет 0");
        System.out.print("1-ДА/0-Нет : ");
        while (true) {
            a = sc.nextInt();
            if ((a == 0) || (a == 1)) break;
            System.out.println("Ой!!! ввели что то не то, попробуй снова");
        }
        if (a == 1) {
            System.out.println("Отлично сколько еды добавить");
            a=sc.nextInt();
            plate.additivi(a);
            System.out.println("На тарелке стало : " + plate);
        }

      for (int i = 0; i < cats.length;i++) {
          System.out.println("Name: " + cats[i].getName() );
          System.out.println("Satiety : " + (cats[i].getSatiety()  == true? "true": "false" ));
      }
      MyWindow myWindow = new MyWindow();
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    int getAppetite() {
        return appetite;
    }

    void eat(Plate plate) {
        //plate.setFood(plate.getFood() - appetite);
        if(plate.decreaseFood(appetite) == false) System.out.println(" В тарелке нет столько еды сколько необходимо Коту по кличке - " + getName());
        else {
            System.out.println("Кот по кличке - " + getName() + " Поел");
            setSatiety(true);
        }
    }

    String getName() {
        return name;
    }
    boolean getSatiety(){
        return satiety;
    }
    boolean setSatiety(boolean satiety) {
        return this.satiety = satiety;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int food) {
            if ((this.food -= food) < 0) {
            this.food += food;
              return false;
        }
        else return true;
    }

    int getFood() {
        return food;
    }
    void additivi (int food) {
        setFood(getFood()+food);
    }

    void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}
 class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);
    }
}


