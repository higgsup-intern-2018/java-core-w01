package session05.part02.people;

import java.util.Date;

public class Person {
    private  String name;
    private Date birthday;
public Person(String name,Date birthday){
    this.name=name;
    this.birthday=birthday;
}
    public String getName() {
        return name;
    }

    public String toString(){

       return (" Imformation person : \n"+"     Name : "+name+"\n     Birthday : "+birthday);
    }
}
