package session02.exercises;

public class Question20 {
    /*
    * 20.Write a program SumOfTwoDice.java that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
    * Viết một chương trình SumOfTwoDice.java in tổng hai số nguyên ngẫu nhiên từ 1 ->6
    * (như bạn nhận được khi lăn xúc xắc)
    * */
    public static void main(String[] args)
    {
        int number =6;
        int a = (int) ( (Math.random()*number));
        System.out.println("Input number  a : "+a);
        int b = (int) ( (Math.random()*number));
        System.out.println("Input number  a : "+b);
        int sum = a+b;
        System.out.println("Sum a + b : "+sum);
    }
}
