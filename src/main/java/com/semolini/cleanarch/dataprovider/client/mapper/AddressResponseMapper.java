package com.semolini.cleanarch.dataprovider.client.mapper;

import com.semolini.cleanarch.core.domain.Address;
import com.semolini.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
