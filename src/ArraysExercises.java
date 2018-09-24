import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = Arrays.copyOf(people, people.length+1);
        newPeople[newPeople.length-1] = newPerson;

//                new Person[people.length + 1];
        return newPeople;
    }


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] threePeople = new Person[3];
        threePeople[0] = new Person("Royce");
        threePeople[1] = new Person("Ludell");
        threePeople[2] = new Person("Audryanne");
//        for (Person person: threePeople) {
//            System.out.println(person.getName());
//        }
        Person benjamin = new Person("Benjamin");
        Person[] fourPeople = addPerson(threePeople, benjamin);
        for (Person person: fourPeople) {
            System.out.println(person.getName());
        }
    }
}
