import java.util.LinkedList;
import java.util.Queue;

public class Shelter {
    private Queue<Animal> dogs;
    private Queue<Animal> cats;
    private int arrivalTime;

    public Shelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        arrivalTime = 0;
    }

    public void enqueue(String name, String type) {
        arrivalTime++;
        Animal animal = new Animal(name, type, arrivalTime);
        if (type.equals("dog")) {
            dogs.add(animal);
        } else if (type.equals("cat")) {
            cats.add(animal);
        } else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        }
        if (dogs.peek().getArrivalTime() < cats.peek().getArrivalTime()) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    public Animal dequeueDog() {
        if (dogs.isEmpty()) {
            return null;
        }
        return dogs.poll();
    }

    public Animal dequeueCat() {
        if (cats.isEmpty()) {
            return null;
        }
        return cats.poll();
    }
}