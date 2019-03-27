package java8.innerclass;
public class StaticInnerClass {
    private Engine engine;
    public StaticInnerClass(int weightPounds, int horsePower) {
        this.engine = new Engine(horsePower, weightPounds);
    }
    public double getSpeedMph(double timeSec){
        return this.engine.getSpeedMph(timeSec);
    }
    private static class Engine {
        private int horsePower;
        private int weightPounds;
        private Engine(int horsePower, int weightPounds) {
            this.horsePower = horsePower;
            this.weightPounds = weightPounds;
        }
        private double getSpeedMph(double timeSec){
            double v = this.horsePower* timeSec/ this.weightPounds;
            return v;
        }
    }
}