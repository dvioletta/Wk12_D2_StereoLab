import java.util.ArrayList;

public class CDPlayer extends Stero {

    private int volume;
    private boolean onOff;
    private ArrayList<String> cdCollection;

    public CDPlayer(int volume, boolean onOff){
        super(volume,onOff);
        this.cdCollection = new ArrayList<>();
    }

    public ArrayList<String> getCdCollection() {
        return cdCollection;
    }

    public void addCd(String cd){
        this.cdCollection.add(cd);
    }

    public int countCds(){
        return this.cdCollection.size();
    }

    public void eject(){
        this.cdCollection.remove(0);
    }


}
