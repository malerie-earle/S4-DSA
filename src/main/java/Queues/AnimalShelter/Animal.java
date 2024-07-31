package AnimalShelter;

public class Animal {
    private String name;
    private String type;
    private int arrivalTime;

    public Animal(String name, String type, int arrivalTime) {
        this.name = name;
        this.type = type;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}