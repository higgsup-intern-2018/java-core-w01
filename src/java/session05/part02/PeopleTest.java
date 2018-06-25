package session05.part02;

import session05.part02.people.Employee;

import java.util.Date;

public class PeopleTest {
    public static void main(String[] args) {
        Employee newbie = new Employee ("Newbie", new Date("2/10/1989"), 1000000);
        Manager boss = new Manager("Boss", new Date("2/23/1986"), 4000000);
        boss.setAssistant(newbie);
        Manager biggerBoss = new Manager("Big Boss", new Date("3/12/1969"), 10000000);
        biggerBoss.setAssistant(boss);
        System.out.println(newbie);
        System.out.println(boss);
        System.out.println(biggerBoss);
        //Yêu cầu của bài 03- tạo mảng person và dùng vòng lặp để in ra thông tin từng người
        System.out.println("-------------------------------------------------------------------------");
        Employee[] employees = {newbie,boss,biggerBoss};
        for (Employee item:employees) {
            System.out.println(item);
        }
    }
}
