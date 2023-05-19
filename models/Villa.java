package Furama.models;

public class Villa extends Facility {
    private String roomStandard;

    private long poolArea;

    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, long poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, int usableArea, String rentalCosts, int numberOfPeople, String rentalType, String roomStandard, long poolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public long getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(long poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
