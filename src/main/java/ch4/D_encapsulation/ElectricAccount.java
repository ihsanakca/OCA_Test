package ch4.D_encapsulation;

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    //line1
    public void addKWh(double kWh) {
        if (kWh > 0) {
            this.kWh += kWh;
            this.bill = this.kWh * this.rate;
        }
    }

}
