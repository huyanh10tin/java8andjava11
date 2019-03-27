package java8.innerclass;

public class Vehicle {
        private int weight;
        private Engine engine;
        public Vehicle(int weight, int power){
            this.weight = weight;
            this.engine = new Engine(power);
        }
        public double getSpeed(double time) {
            return this.engine.getSpeed(time);
        }
        private int getWeight(){
            return this.weight;
        }
        public class Engine {
            private int power;
            private Engine(int power) {
                this.power = power;
            }
            private double getSpeed(double time) {
                var result = 2.0 * this.power * time / getWeight();
                return result;
            }
        }
}
