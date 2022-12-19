package com.semolini.cleanarch.dataprovider.repository.mapper;

import com.semolini.cleanarch.core.domain.Customer;
import com.semolini.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
