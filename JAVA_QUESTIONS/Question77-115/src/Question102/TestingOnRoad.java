package Question102;

public class TestingOnRoad {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome in the Traffic Light.");

        TrafficLightThread red = new TrafficLightThread(TrafficLightColor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficLightColor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficLightColor.GREEN);


        red.start();
        red.join();

        yellow.start();
        yellow.join();

        green.start();
        green.join();

        System.out.println("Traffic Light End.");
    }
}
