package sec07.Excercies06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyList {
    private List<Integer> numbers;

    public MyList(){
        numbers = new ArrayList<>();
    }

    public void setData(List<Integer> numbers)
    {
        this.numbers = numbers;
    }

    public void setData(int[] numbers)
    {
    }

    public void sort()
    {
        Collections.sort(numbers);
    }

    public void add(int number)
    {
        numbers.add(number);
    }

    public void add(int index, int number)
    {
        numbers.add(index, number);
    }

    public void add(int[] numbers)
    {
        //this.numbers.add(numbers);
    }

    public void removeIndex(int index)
    {
        numbers.remove(index);
    }

    public void removeElements(Integer element)
    {
        numbers.remove(element);
    }

    public void removeRange(int from, int to)
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            if(from <= numbers.get(i) && numbers.get(i) <= to)
            {
                removeIndex(i);
            }
        }
    }

    //reverse list
    public void reverse()
    {
        Collections.reverse(numbers);
    }

    public void print()
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + " ");
        }
    }

    public void print2()
    {
        for(Integer x: numbers)
        {
            System.out.print(x + " ");
        }
    }

    public void print3()
    {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext())
        {
            int x = iterator.next();
            System.out.print(x + " ");
        }
    }
}
