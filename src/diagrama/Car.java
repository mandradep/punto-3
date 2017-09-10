package diagrama;

public class Car {
    private CarModel carModel;
    private int traveled;

    public Car(CarModel carModel, int traveled) {
        this.carModel = carModel;
        this.traveled = traveled;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public int getTraveled() {
        return traveled;
    }

    public void setTraveled(int traveled) {
        this.traveled = traveled;
    }
        
    
}