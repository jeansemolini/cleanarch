package com.semolini.cleanarch.core.usecase;

import com.semolini.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
