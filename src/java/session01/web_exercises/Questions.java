package session01.web_exercises;
// Web Exercise 2,3,4,5
public class Questions {
    /*
    *2. Describe what happens if, in HelloWorld.java, you omit
    *   a. main
        b. String
        c. HelloWorld
        d. System.out
        e. println
    * Nếu khi viết chương trình HelloWorld.java mà bỏ qua main thì chương trình sẽ không biên dịch , nếu
    * bỏ qua String thì chương trình sẽ xảy ra lỗi - loại dữ liệu của kết quả , nếu không có HelloWorld
    * thì chương trình vẫn chạy và không in ra bất cứ thông tin gì , nếu thiếu System.in thì chương
    * trình sẽ lỗi và báo rằng bạn đang thiếu "System.in " , nếu không có println chương trình sẽ báo
    * "Method call expected"
    * */
    /*3.Describe what happens if, in HelloWorld.java, you omit
        a.the ;
        b.the first "
        c.the second "
        d.the first {
        e.the second {
        f.the first }
        g.the second }
    *Nếu khi viết chương trình HelloWorld.java mà bỏ qua ' ; ' thì chương trình sẽ báo rằng bạn thiếu
    * dấu ';' kết thúc câu lệnh. Bỏ qua " và " thì chương trình sẽ báo "cannot symbol".Thiếu
    * {} thì chương trình sẽ báo rằng bạn thiếu { or ;
    * */
    /*
    * 4.Describe what happens if, in HelloWorld.java, you misspell (by, say, omitting the second letter)
    *   a.main
        b.String
        c.HelloWorld
        d.System.out
        e.println
    * Khi viết sai chính tả các từ trên thì chương trình sẽ báo lỗi
    * */
    public static void main(String[] args)
    {
            System.out.println("Hello world ! ");
    }

}
