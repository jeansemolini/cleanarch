package com.semolini.cleanarch.dataprovider;

import com.semolini.cleanarch.core.dataprovider.FindCustomerById;
import com.semolini.cleanarch.core.domain.Customer;
import com.semolini.cleanarch.dataprovider.repository.CustomerRepository;
import com.semolini.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
