public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public void printCar(){
    System.out.println("Vehicle License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee() );
    System.out.println("Number of Passengers: " + getPassengers());
    System.out.println("Eletrice: " + electric);
    System.out.println("Discount: " + discountApplied);
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }
}