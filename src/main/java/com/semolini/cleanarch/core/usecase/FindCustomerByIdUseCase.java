package com.semolini.cleanarch.core.usecase;

import com.semolini.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
    
    Customer find(final String id);
}
