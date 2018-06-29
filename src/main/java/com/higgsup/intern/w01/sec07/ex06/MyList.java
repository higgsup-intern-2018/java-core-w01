/* , trong đó có cung cấp các method để làm việc với nó:

setData(List<Integer> numbers): gán giá trị cho numbers
setData(int[] numbers): gán giá trị cho numbers
sort(): sắp xếp lại list theo thứ tự tăng dần. Khuyến khích sử dụng nhiều cách sắp xếp (nếu có thì viết thêm method mới với tên sort1, sort2, ...)
add(int number): add thêm phần tử vào trong numbers
add(int index, int number): add thêm phần tử vào trong numbers tại vị trí index
add(int[] numbers): add thêm 1 list vào trong numbers
removeIndex(int index): xóa phần tử ở vị trí index
removeElement(int element): xóa phần tử có giá trị element
removeRange(int from, int to): xóa các phần tử có giá trị nằm trong đoạn [from,to]. Thực hiện ít nhất 2 cách
fillRange(int from, int to): fill thêm dữ liệu vào trong đoạn [from,to] bằng các số nguyên liên tiếp. Ví dụ: list: 1,3,5,8,9,12,13; input là [4,11] -> output=1,3,5,6,7,8,9,12,13
reverse(): đảo lộn list. Thực hiện ít nhất 2 cách
print: in ra giống method printArray trong exercise 1, thực hiện theo 3 cách: fori, foreach, iterator */

package com.higgsup.intern.w01.sec07.ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyList {
    private List<Integer> numbers;

    public MyList(){
        numbers = new ArrayList<>();
    }

    public void setData(List<Integer> numbers){
        this.numbers = numbers;
    }

    public void setData(int[] numbers){

    }

    public void  sort(){
        Collections.sort(numbers);
    }

    public void add(int number){
        numbers.add(number);
    }

    public void add(int index , int number){
        if(index < numbers.size()-1){
            numbers.add(index, number);
        }else {
            System.out.println("Bị thừa ra ngoài");
        }
    }

    public void add(int[] numbers){
        for(int n: numbers){
            this.numbers.add(n);
        }
    }

    public void removeIndex(int index){
        if(index < numbers.size()-1){
            numbers.remove(index);
        }else {
            System.out.println("bị thừa ra ngoài");
        }
    }

    public void removeElement(int element){
       Integer it = element;
       numbers.remove(it);
    }

    public void removeRange(int from , int to){
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            int x = iterator.next();
            if(from < x && x < to){
                iterator.remove();
            }
        }
    }

    public void fillRange(int from , int to){
        int start = 0;
        int end   = 0;
        for(int i=0 ; i<numbers.size(); i++){
            if(numbers.get(i) >= from){
                start = i;
                break;
            }
        }

        for(int i=start ; i<numbers.size() ; i++){
            if(numbers.get(i) > to){
                end = i-1;
                break;
            }
        }

        int value = numbers.get(start);
        while (value <numbers.get(end)- 1){
            value++;
            if(!numbers.contains(value)){
                numbers.add(value);
            }
        }
        sort();
    }

    public void reverse(){
        Collections.reverse(numbers);
    }

    public void reverse1(){
        List<Integer> list = new ArrayList<>();
        for(int i = numbers.size()-1; i > -1; i--)
        {
            list.add(numbers.get(i));
        }
        numbers = list;
    }

}
