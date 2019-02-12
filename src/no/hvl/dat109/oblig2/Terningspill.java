package no.hvl.dat109.oblig2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Terningspill {
    private Integer id;
    private List<Spiller> players;
    private Kopp k;
    public Terningspill(Integer id) {
        this.id = id;
        players = new ArrayList<Spiller>();
        k = new Kopp(id);
    }

    public void leggTilSpiller(String navn){
        Spiller s = new Spiller(navn);
        players.add(s);
    }

    public void spill(){
        for(Spiller s : players){
            s.spill(k);
        }
    }

    public void finnVinner(){
        Spiller winner = players.stream()
                .max(Comparator.comparing(Spiller::getVerdi)).orElse(null);
        System.out.println("Vinneren er : " + winner);
    }

}
