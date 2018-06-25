package session05.part02.excercies07;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression ex1 = new Numeral(3);
        Expression ex2 = new Square(ex1);
        Expression ex3 = new Numeral(1);
        Expression ex4 = new Addtion(ex2, ex3);
        Expression ex5 = new Square(ex4);
        System.out.println("(3^2+1)^2 = " + ex5);
//subtraction
        System.out.println("- Subtraction");
        Expression ex6 = new Addtion(ex2, ex1);
        Expression ex7 = new Subtraction(ex6, ex3);
        System.out.println("(3^2+3-1) = " + ex7);
//Multiplication
        System.out.println("- Multiplication");
        Expression ex8 = new Numeral(15);
        Expression ex9 = new Multiplication(ex7, ex8);
        System.out.println("(3^2+3-1)*15 = " + ex9);
//Division
        System.out.println("- Division");
        Expression ex10 = new Numeral(11);
        Expression ex11 = new Division(ex9, ex10);
        System.out.println("(3^2+3-1)*15/11 = "+ ex11);
    }
}
