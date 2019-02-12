package no.hvl.dat109.oblig2;

import java.util.Random;

public class Terning {
    private Integer id;
    private Integer verdi;
    private Random rand;

    public Terning(Integer id) {
        this.id = id;
        verdi = 0;
        rand = new Random();
    }

    public void trill(){
        verdi = rand.nextInt(6) + 1;
    }

    public Integer getVerdi() {
        return verdi;
    }

    public void setVerdi(Integer verdi) {
        this.verdi = verdi;
    }
}
