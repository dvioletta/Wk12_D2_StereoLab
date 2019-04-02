public abstract class Stero {

    protected int volume;
    protected boolean onOff;

    public Stero(int volume, boolean onOff){
        this.volume = volume;
        this.onOff = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean state(){
        return this.onOff;
    }

    public void setToOn(){
        this.onOff = true;
    }

    public void setToOff(){
        this.onOff = false;
    }
}
