public abstract class Car {

    private int yearOfRelease;
    private String transmissionType;
    private String model;
    private int energyCapacity;
    private int maxSpeed;
    private String color;

    public Car(int yearOfRelease, String transmissionType, String model, int energyCapacity, int maxSpeed, String color) {
        this.yearOfRelease = yearOfRelease;
        this.transmissionType = transmissionType;
        this.model = model;
        this.energyCapacity = energyCapacity;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEnergyCapacity(int energyCapacity) {
        this.energyCapacity = energyCapacity;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getModel() {
        return model;
    }

    public int getEnergyCapacity() {
        return energyCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    //По идее это будет являться методом вывода инфы о машине
    @Override
    public String toString() {
        return "Car{" +
                "yearOfRelease=" + yearOfRelease +
                ", transmissionType='" + transmissionType + '\'' +
                ", model='" + model + '\'' +
                ", energyCapacity=" + energyCapacity +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}
