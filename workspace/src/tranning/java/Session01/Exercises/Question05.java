package tranning.java.Session01.Exercises;


public class Question05 {
/*
*5. Modify UseArgument.java to make a program UseThree.java that takes three names and prints out a proper sentence with the names in the reverse of the order given, so that for example,
* "java UseThree Alice Bob Carol" gives "Hi Carol, Bob, and Alice.".
* */
    public static void main(String[] args){
    String[] arr ={"Carol","Bod","Alice"};
        System.out.println("Hi "+arr[0]+", "+arr[1]+", "+arr[2]);
        System.out.println("--------------------------------------");
        System.out.println("Hi "+arr[2]+", "+arr[1]+", "+arr[0]);
    }
}
