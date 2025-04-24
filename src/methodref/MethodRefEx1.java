package methodref;

import java.util.function.Supplier;

public class MethodRefEx1 {

    public static void main(String[] args) {
        Supplier<String> staticMethod1 = () -> Person.greeting();
        System.out.println("staticMethod1 = " + staticMethod1.get());

        Supplier<String> staticMethod2 = Person::greeting;
        System.out.println("staticMethod2 = " + staticMethod2.get());

        Person person = new Person("Oh");
        Supplier<String> instanceWithNumber1 = () -> person.introduce();
        System.out.println("instanceWithNumber1 = " + instanceWithNumber1.get());

        Supplier<String> instanceWithNumber2 = person::introduce;
        System.out.println("instanceWithNumber2 = " + instanceWithNumber2.get());

        Supplier<Person> newPerson1 = () -> new Person();
        System.out.println("newPerson1 = " + newPerson1.get());

        Supplier<Person> newPerson2 = Person::new;
        System.out.println("newPerson2 = " + newPerson2.get());
    }
}
