package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KsiegowaConfiguration {


    @Bean
    public Księgowa dajKsiegowa(BazaDanych bazaDanych){
        return new Księgowa(bazaDanych);
    }
}
