package com.ewertonilima.notificationhex.adapters.configs;


import com.ewertonilima.notificationhex.NotificationHexApplication;
import com.ewertonilima.notificationhex.core.ports.NotificationPersistencePort;
import com.ewertonilima.notificationhex.core.services.NotificationServicePortImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = NotificationHexApplication.class)
public class BeanConfiguration {

    @Bean
    NotificationServicePortImpl notificationServicePortImpl(NotificationPersistencePort persistencePort) {
        return new NotificationServicePortImpl(persistencePort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
