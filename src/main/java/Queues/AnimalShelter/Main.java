import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        shelter.enqueue("Dalilah", "dog");
        shelter.enqueue("Meeko", "cat");
        shelter.enqueue("Austin", "dog");
        shelter.enqueue("Venom", "cat");
        shelter.enqueue("Sarah", "dog");
        shelter.enqueue("Ollie", "cat");
        System.out.println();
        System.out.println("Adopting oldest animal from Animal Shelter: ");
        System.out.println(shelter.dequeueAny().getName()); // expect Dalilah
        System.out.println("Adopting oldest dog from Animal Shelter: ");
        System.out.println(shelter.dequeueDog().getName()); // expect Austin
        System.out.println("Adopting oldest cat from Animal Shelter: ");
        System.out.println(shelter.dequeueCat().getName()); // expect Meeko
        System.out.println("Adopting oldest animal from Animal Shelter: ");
        System.out.println(shelter.dequeueAny().getName()); // expect Venom
        System.out.println(shelter.dequeueAny().getName()); // expect Sarah
        System.out.println(shelter.dequeueAny().getName()); // expect Ollie
        System.out.println();
    }
}