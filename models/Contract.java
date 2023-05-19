package Furama.models;

public class Contract {
    private int someContracts;

    private int idBooking;

    private double depositAmount;

    private double totalPayment;

    private int idCustomer;

    public Contract() {
    }

    public Contract(int someContracts, int idBooking, double depositAmount, double totalPayment, int idCustomer) {
        this.someContracts = someContracts;
        this.idBooking = idBooking;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public int getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(int someContracts) {
        this.someContracts = someContracts;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts=" + someContracts +
                ", idBooking=" + idBooking +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
