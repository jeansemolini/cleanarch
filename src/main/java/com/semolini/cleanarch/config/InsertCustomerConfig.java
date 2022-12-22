package com.semolini.cleanarch.config;

import com.semolini.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.semolini.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.semolini.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }
}
