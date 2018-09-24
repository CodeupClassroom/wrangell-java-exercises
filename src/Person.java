public class Person {
    // what are the states for these objects?
    // what are the behaviors for objects of this type?

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // getters ask questions
    public String getName() {
        return name;
    }

    // setters are commands
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.out.println(person1);
        System.out.println(person2);

    }
}
