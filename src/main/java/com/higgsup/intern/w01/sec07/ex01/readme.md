### 7. Generics and Collections ###
7.1 General
Exercise 01: Given:
             public static void main(String[] args) {
             // INSERT DECLARATION HERE
             for (int i = 0; i <= 10; i++) {
             List<Integer> row = new ArrayList<Integer>();
             for (int j = 0; j <= 10; j++)
             row.add(i * j);
             table.add(row);
             }
             for (List<Integer> row : table)
             System.out.println(row);
             }
             Which statements could be inserted at // INSERT DECLARATION HERE to allow this code to
             compile and run? (Choose all that apply.)
A. List<List<Integer>> table = new List<List<Integer>>();
B. List<List<Integer>> table = new ArrayList<List<Integer>>();
C. List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
D. List<List, Integer> table = new List<List, Integer>();
E. List<List, Integer> table = new ArrayList<List, Integer>();
F. List<List, Integer> table = new ArrayList<ArrayList, Integer>();
G. None of the above
 Answer:

- B đúng
- A sai do List là 1 interface, nên ta không thể khởi tạo với từ khóa new
- C sai do loại argument List<Integer> ở vế vế trái không trùng với loại argument bên phải ArrayList<Integer>
- D, E, F sai do bên trong list chỉ có 1 tham số.

Exercise 02: Which statements are true about comparing two instances of the same class, given that the
             equals() and hashCode() methods have been properly overridden? (Choose all that apply.)
             A. If the equals() method returns true, the hashCode() comparison == might return false
             B. If the equals() method returns false, the hashCode() comparison == might return true
             C. If the hashCode() comparison == returns true, the equals() method must return true
             D. If the hashCode() comparison == returns true, the equals() method might return true
             E. If the hashCode() comparison != returns true, the equals() method might return true
 Answer:
 - A sai do nếu equals() trả về true thì bắt buộc phải có hashCode()
 - B đúng do nếu equals() trả về false thì hashCode() có thẻ có hoặc không.
 - C sai, D đúng do khi hashCode () trả về true thì equal() không
 - E sai do khi hashCode() comparison != returns true thì equalS() bắt buộc phải trả về false
 
 Exercise 03: Given:
              public static void before() {
              Set set = new TreeSet();
              set.add("2");
              set.add(3);
              set.add("1");
              Iterator it = set.iterator();
              while (it.hasNext())
              System.out.print(it.next() + " ");
              }
              Which statements are true?
              A. The before() method will print 1 2
              B. The before() method will print 1 2 3
              C. The before() method will print three numbers, but the order cannot be determined
              D. The before() method will not compile
              E. The before() method will throw an exception at runtime
              
  Answer: E đúng do không sử dụng Generics nên chưa khai báo loại tham số truyền vào nên trình biên dịch sẽ báo lỗi 
  
  Exercise 04: import java.util.*;
               class MapEQ {
               public static void main(String[] args) {
               Map<ToDos, String> m = new HashMap<ToDos, String>();
               ToDos t1 = new ToDos("Monday");
               ToDos t2 = new ToDos("Monday");
               ToDos t3 = new ToDos("Tuesday");
               m.put(t1, "doLaundry");
               m.put(t2, "payBills");
               m.put(t3, "cleanAttic");
               System.out.println(m.size());
               }
               }
               class ToDos{
               String day;
               ToDos(String d) { day = d; }
               public boolean equals(Object o) {
               return ((ToDos)o).day == this.day;
               }
               // public int hashCode() { return 9; }
               }
               Which is correct? (Choose all that apply.)
               A. As the code stands it will not compile
               B. As the code stands the output will be 2
               C. As the code stands the output will be 3
               D. If the hashCode() method is uncommented the output will be 2
               E. If the hashCode() method is uncommented the output will be 3
               F. If the hashCode() method is uncommented the code will not compile
   Answer:
   - C đúng do m có 3 cặp giá trị key, value. nên output = 3;
   - D đúng do khi hashCode() được uncommment nên phương thức equals sẽ so sánh địa chỉ ô nhớ của key, m có 2 địa chỉ ô nhớ có giá trị "Monday" và "Tuesday"
   nên output = 2;
   
   Exercise 05:         
   Answer: 
   - B, E, G đúng
   - A sai do không được sử dụng kiểu primitive (int)
   - C sai do 2 loại tham số được truyền vào Map phải cách nhau bởi dấu ,
   - D sai do nếu khai báo total kiểu int thì trong mệnh đề if không thể so sách total với null
   - F sai do null không thể tự động gán bằng 0;
   - H sai do amount thuộc kiểu int nên không thể gọi được hàm, chỉ có wrapper classes mới gọi được hàm.
   
   Exercise 07: Which collection class(es) allows you to grow or shrink its size and provides indexed access to
               its elements, but whose methods are not synchronized? (Choose all that apply.)
               A. java.util.HashSet
               B. java.util.LinkedHashSet
               C. java.util.List
               D. java.util.ArrayList
               E. java.util.Vector
               F. java.util.PriorityQueue 
   Answer:
   - D đúng vì tất cả các lớp Collection đều cho phép mở rộng và co lại kích cỡ. ArrayList có thể lấy phần tử trong ArrayList
    theo giá trị index
   
   Exercise 10: When fragments I, II, or III are inserted, independently, at line 7, which are true?
                (Choose all that apply.)
                A. Fragment I compiles
                B. Fragment II compiles
                C. Fragment III compiles
                D. Fragment I executes without exception
                E. Fragment II executes without exception
                F. Fragment III executes without exception
    Answer:
    - A, B, C, D, F đúng
    - E sai do các phần tử trong TreeSet phải implements Comparable
    
   Exercise 11: If fragment I or II is inserted, independently, at line 8, which are true? (Choose all that apply.)
                A. If fragment I is inserted, the output is 2
                B. If fragment I is inserted, the output is 3
                C. If fragment II is inserted, the output is 2
                D. If fragment II is inserted, the output is 3
                E. If fragment I is inserted, compilation fails
                F. If fragment II is inserted, compilation fails
   Answer:
   - A đúng, do nếu ta không override hashCode() thì mặc định hashCode() sẽ được tạo ra cho mỗi đối tượng với những giá trị
   duy nhất nên size sẽ = 3.
   Còn khi ta override lại hashCode() thì các đối tượng sẽ có cùng giá trị trả về từ hashCode(), thì lúc này hàm equals() 
   được gọi để kiểm tra, do 2 đối tượng có cùng giá trị nên size = 2;
   
   Exercise 15:
   Given:
   3. import java.util.*;
   4. class Dog { int size; Dog(int s) { size = s; } }
   5. public class FirstGrade {
   6. public static void main(String[] args) {
   7. TreeSet<Integer> i = new TreeSet<Integer>();
   8. TreeSet<Dog> d = new TreeSet<Dog>();
   9.
   10. d.add(new Dog(1)); d.add(new Dog(2)); d.add(new Dog(1));
   11. i.add(1); i.add(2); i.add(1);
   12. System.out.println(d.size() + " " + i.size());
   13. }
   14. }
   What is the result?
   A. 1 2
   B. 2 2
   C. 2 3
   D. 3 2
   E. 3 3
   F. Compilation fails
   G. An exception is thrown at runtime
   
   Answer: G đúng, vì lớp Dog cần phải implement Comparable. Nên trình biên dịch sẽ throw ra Exception.