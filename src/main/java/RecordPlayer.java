public class RecordPlayer extends Stero implements IPlay{

    private int volume;
    private boolean onOff;
    private int speed;

    public RecordPlayer(int volume, boolean onOff, int speed){
        super(volume, onOff);
        this.speed = speed;
    }

    public
    int getSpeed() {
        return speed;
    }

    public
    void setSpeed(int speed) {
        this.speed = speed;
    }

    public String play() {
        return "Playing";
    }
}
