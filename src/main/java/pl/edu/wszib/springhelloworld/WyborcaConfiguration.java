package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.Glos;
import pl.edu.wszib.springhelloworld.model.KartaDoGlosowania;
import pl.edu.wszib.springhelloworld.model.Urna;
import pl.edu.wszib.springhelloworld.model.Wyborca;

@Configuration
public class WyborcaConfiguration {

    @Bean
    @Scope("prototype")
    public KartaDoGlosowania kartaDoGlosowania(){
        return new KartaDoGlosowania();
    }

    @Bean
    public Urna urna(){
        return new Urna();
    }

    @Bean
    public Wyborca Adam (){
        return new Wyborca(kartaDoGlosowania());
    }

    @Bean
    public Wyborca Alina(){
        return new Wyborca(kartaDoGlosowania());
    }

    @Bean
    public String execute (Wyborca Adam, Wyborca Alina, Urna urna){
        Adam.oddajGlos(urna);
        Alina.oddajGlos(urna);
        urna.zlicz();

        return "";
    }

}
