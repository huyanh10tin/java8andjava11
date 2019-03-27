package java8.innerclass;

public class Vehicle2 {
    private int weight;
    private int power;
    public Vehicle2(int weight, int power){
        this.weight = weight;
        this.power = power;
    }
    public double getSpeed(double time) {
        class Engine {
            private int power;
            private Engine(int power) {
                this.power = power;
            }
            private double getSpeed(double time) {
                var result = 2.0 * this.power * time / getWeight();
                return result;
            }
        }
        Engine engine = new Engine(this.power);
        return engine.getSpeed(time);
    }
    private int getWeight(){
        return this.weight;
    }
}
