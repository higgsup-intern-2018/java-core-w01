package sec07.Excercies05;

public class PrinterArray <T> {
    public void printArray(T[] array)
    {
        System.out.print( array.length );
        for(int i = 0; i < array.length-1; i++)
        {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1] + ";");
    }
}
