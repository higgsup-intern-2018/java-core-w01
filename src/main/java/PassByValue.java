public class PassByValue {
    int data = 50;

    void change(int data) {
        data = data + 100;
    }

    public static void main(String[] args) {
        PassByValue pbv = new PassByValue();

        System.out.println("Trước khi thay đổi: " + pbv.data);
        pbv.change(500);
        System.out.println("Sau khi thay đổi: " + pbv.data);

    }
    /* Truyền tham trị là chỉ truyền giá trị cho hàm, ví dụ này nó truyền giá trị 50 cho hàm , khi hàm được gọi nó sẽ tạo một ô nhớ
    khác̣(không phải là ô nhớ của data ) và gán giá trị bằng 50, sau đó tăng ô nhớ khác này lên 500.tuy nhiên khi kết thúc hàm
    ô nhớ vừa được tăng lại bị giải phóng. Chương trình quay lại giá trị của data vẫn bằng 50
     */
}
