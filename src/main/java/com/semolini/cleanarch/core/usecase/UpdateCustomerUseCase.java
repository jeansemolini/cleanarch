package com.semolini.cleanarch.core.usecase;

import com.semolini.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
