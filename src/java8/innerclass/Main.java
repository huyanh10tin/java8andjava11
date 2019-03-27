package java8.innerclass;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(1,2);
        double xx = vehicle.getSpeed(121);
        System.out.println(vehicle.getSpeed(1));
       Vehicle2 vehicle2 = new Vehicle2(22, 40);
       System.out.println(vehicle2.getSpeed(22)); // 80.0
      StaticInnerClass in = new StaticInnerClass(10,10);
      System.out.println(in.getSpeedMph(2.0));
    }
}
