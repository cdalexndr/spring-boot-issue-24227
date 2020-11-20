package example;

import example.service.BaseService;
import example.service.FallbackService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public BaseService fallbackService() {
        return new FallbackService();
    }
}
