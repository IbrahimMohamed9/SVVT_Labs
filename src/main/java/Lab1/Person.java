package Lab1;

public class Person {
    private final int age;

    public Person(int age){
        this.age = age;
    }
 
    public boolean isAdults(){
        return age >= 18;
    }
}
