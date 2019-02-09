package pl.edu.wszib.springhelloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dziecko {

   // @Autowired
    private Ciastko ciastko;
  //  @Autowired
    private Kot kot;

    @Autowired
    public void setCiastko(Ciastko ciastko) {
        this.ciastko = ciastko;
    }

    @Autowired
    public void setKot(Kot kot) {
        this.kot = kot;
    }

    /*    public Dziecko(Ciastko ciastko, Kot kot) {

        this.ciastko = ciastko;
        this.kot = kot;
    }*/

    public void ugryz() {
        if(!this.ciastko.ugryzione()) {
            this.ciastko.ugryz();
            System.out.println("Yum");
        } else {
            System.out.println("Juz ugryzione");
        }
    }

}
