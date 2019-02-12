package no.hvl.dat109.oblig2;

import java.util.ArrayList;
import java.util.List;

public class Kopp {
    private Integer id;
    private Integer sum;
    private List<Terning> dices;

    public Kopp(Integer id) {
        this.id = id;
        dices = new ArrayList<Terning>();
        sum = 0;
        int i = 0;
        while (i < 2){
            dices.add(new Terning(id));
            i++;
        }
    }

    public void trill(){
        sum = 0;
        for(Terning t : dices){
            t.trill();
            sum += t.getVerdi();
        }
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
