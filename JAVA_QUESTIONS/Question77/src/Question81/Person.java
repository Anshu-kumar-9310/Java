package Question81;

import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public String Id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        Id = id;
    }

    // NOTE IF HASHCODE OF TWO OBJECT IS EQUAL THEN THEY CAN AND CANNOT BE EQUAL
    // BUT IF TWO OBJECTS ARE EQUAL THEN THERE HASHCODE ALWAYS EQUALS.
    // THEREFORE FOR CHECKING EQUALS CONDITION :
    // FIRST CHECK HASHCODE() METHOD OF OBJECT IF HASHCODE() METHOD RETURNS TRUE
    // THEN ONLY CHECK EQUALS() METHOD;
    // WHY WE CHECK HASHCODE() FIRSTLY
    // BECAUSE IT IS FAST IN COMPARING FROM EQUALS METHOD WHEN DATA IS LARGE
    @Override
    public boolean equals(Object o) {
        // if reference is same then object always equal
        if(this == o) return true;
        // if object is null OR object is not a child of Same class (in this case Person class) then object never equal
        if (o == null || getClass() != o.getClass()) return false;

        // cast object back in same class (in this case Person class)
        Person person = (Person) o;
        //now compare all variables
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(Id, person.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Id);
    }

    public static void main(String[] args) {
        System.out.println("Welcome in the world of equals() and hashcode().");
        Person p1 = new Person("Anshu",20,"001");
        Person p2 = new Person("Anshu",20,"001");

        // case 1
        if(p1 == p2){
            System.out.println("Equals from case 1");
        }else {
            System.out.println("Not Equals from case 1");
        }

        // case 2
        if(p1.hashCode() == p2.hashCode()){
            System.out.println("hashcode equals.");
            if(p1.equals(p2)){
                System.out.println("Equals from case 2");
            }else {
                System.out.println("Equals from case 2");
            }
        }else {
            System.out.println("Not Equals from case 2");
        }
    }
}
