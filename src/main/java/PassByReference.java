public class PassByReference {
    int data = 50;

    void change(PassByReference pbr) {
        pbr.data = pbr.data + 100;
    }
    public static void main(String[] args) {
        PassByReference pbr = new PassByReference();

        System.out.println("Trước khi thay đổi: " + pbr.data);
        pbr.change(pbr); // truyền đối tượng
        System.out.println("Sau khi thay đổi: " + pbr.data);
    }
}
/*thì hàm tác động trực tiếp lên ô nhớ chứa giá trị của biến data, tăng giá trị của nó lên100*/