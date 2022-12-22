package com.semolini.cleanarch.config;

import com.semolini.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.semolini.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
