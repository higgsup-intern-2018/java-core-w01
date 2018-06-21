package session02.exercises;

public class Quesions {
    /*
    *1. Suppose that a and b are int values. What does the following sequence of statements do?
    * int t = a;
    * b = t;
    * a = b;
    * Đoạn code trên nói rằng t = a, t = b ,a = b
    * */

    /*
    * 4 . Suppose that a and b are int values. Simplify the following expression: (!(a < b) && !(a > b))
    * Đơn giản hóa : (!(a<b) && !(a>b)) là (a==b)
    * */
    /*
    *6. Why does 10/3 give 3 and not 3.33333333?
    * Tại sao khi 10/3 lại ra 3 mà không ra 3,333333. Bởi vì trong java khi chia 2 số nguyên hoặc
    * 1 trong 2 số là số nguyên thì kết quả sẽ là 1 số nguyên.
    * */
    /*
    *7.What do each of the following print?
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2+3) + "bc");
        System.out.println("bc" + (2+3));
        System.out.println("bc" + 2 + 3);
    * Answers :
    * - Dòng đầu tiên in ra : 2bc
    * - Dòng thứ hai in ra : 5bc
    * - Dòng thứ ba in ra : 5bc
    * - Dòng thứ tư in ra : bc5
    * - Dòng thứ năm in ra :bc23
    * Lý giải : Cộng chuỗi cũng giống như cộng số trong toán học, sẽ cộng từ trái sang phải, trong
    * ngoặc trước, ngoài ngoặc sau. Vì vậy dòng cuối có kết quả bc23 là vì bc + 2 = bc2 , sau đó
    * bc2+3 = bc23
    * */

}
