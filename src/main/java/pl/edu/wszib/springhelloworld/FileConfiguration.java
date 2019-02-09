package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("file")
@Configuration
public class FileConfiguration {

    @Bean
    public BazaDanych bazaDanych(){
        return new FileBazaDanych();
    }
}
