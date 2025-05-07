// car.java

public class Car extends Vehicle {
    private int doors;
    private int passengers;

    public Car(String make, String model, String plate, int doors, int passengers) {
        super(make, model, plate);
        this.doors = doors;
        this.passengers = passengers;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getPassengers() {
        return this.passengers;
    }

    @Override
    public String toString() {
        return doors + "-door " + getMake() + " " + getModel() + " with license " + getPlate();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Car)) {
        	return false;
        }
        
        Car c = (Car) other;
        if (this.doors == c.doors) {
        	if (this.passengers == c.passengers) {
        		return super.equals(c);
        	}
        }
    }

    public Car copy() {
        return new Car(getMake(), getModel(), getPlate(), this.doors, this.passengers);
    }
}
