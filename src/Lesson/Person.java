package Lesson;

/**
 * Java. Level 1. Lesson 5.  homework
 *
 * @author Sergey Chernykh
 * @version dated Aug 11, 2017
 */
/*

* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

        * Конструктор класса должен заполнять эти поля при создании объекта;

        * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

        * Создать массив из 5 сотрудников

        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
        * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */
public class Person {
    String fio;
    String posicion;
    String email;
    String telephon;
    int salary;
    int age;
    public  Person( String fio, String posicion, String email, String telephon, int salary, int age ) {
        this.fio = fio;
        this.posicion = posicion;
        this.email = email;
        this.telephon = telephon;
        this.salary = salary;
        this.age = age;

    }
    public void printPerson() {
        System.out.println(fio);
        System.out.println(posicion);
        System.out.println(email);
        System.out.println(telephon);
        System.out.println(salary);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("0Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("1Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[2] = new Person("2Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 35);
        persArray[3] = new Person("3Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        persArray[4] = new Person("4Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        persArray[0].printPerson();
         for (int i = 0; i < 5; i++){
             if (persArray[i].age > 40) persArray[i].printPerson();
         }
    }
}
