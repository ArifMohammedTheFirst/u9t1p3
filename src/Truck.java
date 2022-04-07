public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck(){
    System.out.println("Vehicle License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee() );
    System.out.println("Number of Passengers: " + getPassengers());
    System.out.println("Axles: " + axles);
    System.out.println("HasTrailer: " + hasTrailer);
  }
}