package gradle;

import gradle.person.PersonSerializerImp;
import gradle.person.Person;

public class App {
    public static void main( String[] args ) {
        PersonSerializerImp personSerializer = new PersonSerializerImp(
                new Person("Stanislav", "Ivanov")
        );
        personSerializer.printPerson();
    }
}
