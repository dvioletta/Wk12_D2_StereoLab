public class Radio extends Stero{

    private int volume;
    private boolean onOff;
    private String tune;

    public Radio(int volume, boolean onOff, String tune){
        super(volume,onOff);
        this.tune = tune;
    }

    public
    String getTune() {
        return tune;
    }

    public
    void setTune(String tune) {
        this.tune = tune;
    }


}
