package com.semolini.cleanarch.config;

import com.semolini.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.semolini.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.semolini.cleanarch.dataprovider.InsertCustomerImpl;
import com.semolini.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
