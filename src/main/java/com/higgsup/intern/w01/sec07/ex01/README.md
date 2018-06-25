1. A sai vì List() là interface nên không khai báo được kiểu object là List
   B đúng
   C sai
   D, E, F sai vì List chỉ lấy 1 tham số

2. A sai do khi equals() trả về true thì hashCode() == sẽ phải trả về true
   B đúng vì khi equals() trả về false thì hashCode() == có thể trả về true hoặc false
   C sai vì khi hashCode() == trả về true thì equals() có thể trả về true hoặc false
   D đúng vì khi hashCode() == trả về true thì equals() có thể trả về true hoặc false
   E sai vì khi hashCode() != trả về true thì equals() sẽ phải trả về false
   
3. Kiểu TreeSet sắp xếp các phần tử theo thứ tự. Khi thêm các phần tử với kiểu các nhau => lỗi runtime khi so sánh các phần tử không cùng kiểu
   Chọn đáp án E
	
4. A sai do code compile bình thường
   B sai do kích thước của m đang là 3
   C đúng
   D đúng
   E sai do khi uncomment hashCode(), phương thức equals() chạy và t1 và t2 lặp nhau => kích thước của map chỉ là 2
   F sai do code compile bình thường
   
5. A sai do int là kiểu primitive, không thể làm argument của Map được
   B đúng
   C sai do String không có type parameter
   D sai do null không thể gán với biến kiểu int
   E đúng
   F sai 
   G đúng
   H sai do biến kiểu int không có phương thức intValue()
   
7. Chọn đáp án D
   A, B, E, F không cung cấp việc truy cập phần tử theo index
   C không phải là class

10. Chọn đáp án A, B, C, D, F do ngoại trừ TreeSet không cho phép chứa các phần tử có kiểu khác nhau, các Set còn lại đều có thể chứa
	các phần tử có kiểu khác nhau nên compile và runtime không có lỗi

11. A đúng do có phương thức hashCode nên phần tử 1 và 3 được equals cho là trùng nhau
	B sai do có 2 phần tử trùng nhau
	C sai
	D đúng do không có phương thức hashCode nên equals không xác nhận được hai phần tử có bằng nhau không => có 3 phần tử
	E, F sai do compile bình thường

15. Do class Dog chưa viết lại phương thức Comparable nên khi chạy TreeSet với kiểu Dog sẽ báo lỗi tại runtime
	Chọn đáp án G.