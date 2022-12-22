package com.semolini.cleanarch.config;

import com.semolini.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.semolini.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.semolini.cleanarch.dataprovider.repository.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
