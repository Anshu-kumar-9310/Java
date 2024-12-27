package Question102;

public class TrafficLightThread extends Thread{

    // IMPORTANT: Make color variable from Class TrafficLightColor
    private final TrafficLightColor color;

    public TrafficLightThread(TrafficLightColor color) {
        this.color = color;
    }


    @Override
    public void run() {
        System.out.println("Traffic Light Color Active: "+color);
        try {
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Traffic Light Color Inactive: "+color);

    }
}
