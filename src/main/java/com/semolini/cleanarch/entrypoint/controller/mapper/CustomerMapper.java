package com.semolini.cleanarch.entrypoint.controller.mapper;

import com.semolini.cleanarch.core.domain.Customer;
import com.semolini.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.semolini.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
            @Mapping( target = "id", ignore = true),
            @Mapping( target = "address", ignore = true),
            @Mapping( target = "isValidCpf", ignore = true)
    })
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
