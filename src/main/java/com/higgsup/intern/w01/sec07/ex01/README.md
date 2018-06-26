1. A sai vì List() là interface nên không khai báo được kiểu object là List <br/>
   B đúng<br/>
   C sai<br/>
   D, E, F sai vì List chỉ lấy 1 tham số<br/>

2. A sai do khi equals() trả về true thì hashCode() == sẽ phải trả về true<br/>
   B đúng vì khi equals() trả về false thì hashCode() == có thể trả về true hoặc false<br/>
   C sai vì khi hashCode() == trả về true thì equals() có thể trả về true hoặc false<br/>
   D đúng vì khi hashCode() == trả về true thì equals() có thể trả về true hoặc false<br/>
   E sai vì khi hashCode() != trả về true thì equals() sẽ phải trả về false<br/>
   
3. Kiểu TreeSet sắp xếp các phần tử theo thứ tự. Khi thêm các phần tử với kiểu các nhau => lỗi runtime khi so sánh các phần tử không cùng kiểu<br/>
   Chọn đáp án E<br/>
	
4. A sai do code compile bình thường<br/>
   B sai do kích thước của m đang là 3<br/>
   C đúng<br/>
   D đúng<br/>
   E sai do khi uncomment hashCode(), phương thức equals() chạy và t1 và t2 lặp nhau => kích thước của map chỉ là 2<br/>
   F sai do code compile bình thường<br/>
   
5. A sai do int là kiểu primitive, không thể làm argument của Map được<br/>
   B đúng<br/>
   C sai do String không có type parameter<br/>
   D sai do null không thể gán với biến kiểu int<br/>
   E đúng<br/>
   F sai <br/>
   G đúng<br/>
   H sai do biến kiểu int không có phương thức intValue()<br/>
   
7. Chọn đáp án D<br/>
   A, B, E, F không cung cấp việc truy cập phần tử theo index<br/>
   C không phải là class<br/>

10. Chọn đáp án A, B, C, D, F do ngoại trừ TreeSet không cho phép chứa các phần tử có kiểu khác nhau, các Set còn lại đều có thể chứa
	các phần tử có kiểu khác nhau nên compile và runtime không có lỗi<br/>

11. A đúng do có phương thức hashCode nên phần tử 1 và 3 được equals cho là trùng nhau<br/>
	B sai do có 2 phần tử trùng nhau<br/>
	C sai<br/>
	D đúng do không có phương thức hashCode nên equals không xác nhận được hai phần tử có bằng nhau không => có 3 phần tử<br/>
	E, F sai do compile bình thường<br/>

15. Do class Dog chưa viết lại phương thức Comparable nên khi chạy TreeSet với kiểu Dog sẽ báo lỗi tại runtime<br/>
	Chọn đáp án G.
