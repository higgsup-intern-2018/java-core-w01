package com.higgsup.intern.w01.sec02;

public class Exercise07 {
    public static void main(String[] args) {
        System.out.println(2 + "bc"); // In ra chuỗi "2bc"
        System.out.println(2 + 3 + "bc"); //Thực hiện phép tính 2+3=5 và ghép chuỗi thành "5bc"
        System.out.println((2+3) + "bc"); //Kết quả tương tự như trên "5bc"
        System.out.println("bc" + (2+3)); //Ghép chuỗi "bc" với 2+3=5 thành "bc5"
        System.out.println("bc" + 2 + 3); //Do không có ngoặc đơn như vd trên nên "bc" + 2 + 3 sẽ ghép "bc23"
    }
}
