package ru.netology.conditional_apps.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditional_apps.systemProfile.DevProfile;
import ru.netology.conditional_apps.systemProfile.ProductionProfile;
import ru.netology.conditional_apps.systemProfile.SystemProfile;
@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile(){
        return new DevProfile();
    }


    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false")
    public SystemProfile prodProfile(){
        return new ProductionProfile();
    }
}
