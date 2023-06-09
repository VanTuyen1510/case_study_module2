package Furama.models;

public abstract class Facility {
    private String serviceName;

    private int usableArea;

    private String rentalCosts;

    private int numberOfPeople;

    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, String rentalCosts, int numberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
