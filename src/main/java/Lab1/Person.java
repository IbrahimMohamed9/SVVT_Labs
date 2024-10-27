package Lab1;

public class Person {
    private final int age;

    public Person(int age){
        if (age < 0)  throw new IllegalArgumentException("A person’s age cannot be less than 0");
        this.age = age;
    }
 
    public boolean isAdults(){
        return age >= 18;
    }

    public boolean canGoToSchool(){
        return age >= 6;
    }
}
