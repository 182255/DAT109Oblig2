package no.hvl.dat109.oblig2;

public class Spiller {
    private String navn;
    private Integer verdi;

    public Spiller(String navn) {
        this.navn = navn;
        verdi = 0;
    }

    public void spill(Kopp kopp){
        kopp.trill();
        verdi = kopp.getSum();
    }

    public Integer getVerdi() {
        return verdi;
    }

    public void setVerdi(Integer verdi) {
        this.verdi = verdi;
    }

    @Override
    public String toString() {
        return "Spiller{" +
                "navn='" + navn + '\'' +
                ", verdi=" + verdi +
                '}';
    }
}
