package session01.exercises;


public class Question05 {
/*
*5. Modify UseArgument.java to make a program UseThree.java that takes three names and prints out a proper sentence with the names in the reverse of the order given, so that for example,
* "java UseThree Alice Bob Carol" gives "Hi Carol, Bob, and Alice.".
* */
    public static void main(String[] args){
        System.out.println("Hi "+args[0]+", "+args[1]+", "+args[2]);
        System.out.println("--------------------------------------");
        System.out.println("Hi "+args[2]+", "+args[1]+", "+args[0]);
    }
}
