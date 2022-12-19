package com.semolini.cleanarch.core.dataprovider;

import com.semolini.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
