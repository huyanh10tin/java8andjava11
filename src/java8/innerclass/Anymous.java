package java8.innerclass;

public class Anymous {

    private Vehicle3 vh ;

    public  void main2() {
        double time = 10.0;
        int power = 100;
        int weight = 10;
        vh = new Vehicle3(power, weight) {
          public double getSpeed(double time) {
              return 1.0;
          }
        };

        vh = new Vehicle3(power, weight) {
            public double getSpeed(double time) {
                return 2.0;
            }
        };

        System.out.println(vh.getSpeed(10.3)); // print 1.0  not 2.0

    }

    public static void main(String[] args) {
        Anymous a = new Anymous();
        a.main2();
    }

}
