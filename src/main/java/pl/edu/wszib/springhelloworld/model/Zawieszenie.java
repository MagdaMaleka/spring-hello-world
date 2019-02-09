package pl.edu.wszib.springhelloworld.model;

import org.springframework.stereotype.Component;

@Component
public class Zawieszenie {

    private Silnik silnik = new Silnik();
    private SkrzyniaBiegow skrzyniaBiegow = new SkrzyniaBiegow();
    private UkladSterowania ukladSterowania = new UkladSterowania();

}
