public class Taxi extends Car{

    double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate,tollFee,passengers,electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi(){
        System.out.println("Vehicle License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee() );
        System.out.println("Number of Passengers: " + getPassengers());
        System.out.println("Eletrice: " + isElectric());
        System.out.println("Discount: " + isDiscountApplied());
        System.out.println("Fare Collected: $"  + fareCollected);
    }
}
