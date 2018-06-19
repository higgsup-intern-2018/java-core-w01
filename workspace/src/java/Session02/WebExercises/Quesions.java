package java.Session02.WebExercises;

public class Quesions {
    /*
    *14. What does the compiler do if you try to write the following expression:
    * int a = 27 * "three";
    * Chương trình sẽ báo rằng toán tử * không thể áp dụng cho kiểu số nguyên và chuỗi
    * */
    /*
    *15. What does the compiler do if you try to write the following expression:
    *   double x;
        System.out.println(x);
     *  Chương trình sẽ báo rằng biến x chưa được khởi tạo, biến x không được tự động khởi tạo
     * */
    /*
    * 23.emperature conversion. What is wrong with the following code fragment to convert from Fahrenheit (F) to Celsius (C)?
    *    double C = (F - 32) * (5 / 9);
    * Công thức chuyển từ độ F sang độ C là C = (F-32)/(1,8)
    * Vậy dòng code trên sai ở dấu " * " và 5/9
    * */
    /*
    *25. What of the following statements is legal?
        boolean b = 1;
        boolean b = true;
        boolean b = "true";
        boolean b = True;
    * */
    public static void main(String[] args) {
        //16
        int threeInt = 3;
        int fourInt  = 4;
        double threeDouble = 3.0;
        double fourDouble  = 4.0;
        System.out.println(threeInt / fourInt);//Input :0 -- int/int kết quả sẽ trả về kiểu int
        System.out.println(threeInt / fourDouble);//Input :0,75 -- int/double kết quả sẽ trả về kiểu double
        System.out.println(threeDouble / fourInt);//Input :0,75 -- double / int kết quả sẽ trả về kiểu double
        System.out.println(threeDouble / fourDouble);//Input :0,75 -- double / double kết quả trả vè kiểu double
    }
}
