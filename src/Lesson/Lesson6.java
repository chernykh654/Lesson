package Lesson;


/**
 * Java. Level 1. Lesson 6.  homework
 *
 * @author Sergey Chernykh
 * @version dated Aug 14, 2017
 */
public class Lesson6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat1");
        Dog dog1 = new Dog("dog1");
        System.out.println( cat1.jump(5));
        System.out.println(cat1.run(150));
        System.out.println(cat1.swim(15));
        System.out.println(dog1.swim(150));
        System.out.println(dog1.jump(50));
        System.out.println(dog1.run(15));
    }

}

abstract class Animal {
    private String name;

    Animal (String name) {
        this.name = name;
    }

    abstract String run(int i) ;

     abstract String jump(double i) ;

    abstract String swim(int i);
}

 class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    String run(int i) {
        if ((i < 200) && (i > 1)) return "run: true";
        else
            return "run: false";
    }

     @Override
     String jump(double i) {
         if ((i < 3) && (i > 0)) return "jump: true";
         else
             return "jump: false";
     }
     String swim(int i) {
         return  "swim: Кошки не плавают";
     }
 }
 class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    String run(int i) {
        if ((i < 501) && (i > 1)) return "run: true";
        else
            return "run: false";
    }

    @Override
    String jump(double i) {
        if ((i < 0.5) && (i > 0)) return "jump: true";
        else
            return "jump: false";
    }

    @Override
    String swim(int i) {
        if ((i < 11) && (i>0)) return "swim: true";
            else
                return  "swim: false";
                }
    }
