package PC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PC_Config {
    @Bean
    public PC pc(){
        return new PC(videoCard());
    }
    @Bean
    public Processor processor(){
        return new Processor();
    }
    @Bean
    public VideoCard videoCard(){
        return new VideoCard(processor());
    }

}
