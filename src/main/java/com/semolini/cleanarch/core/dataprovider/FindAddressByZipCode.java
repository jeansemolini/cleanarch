package com.semolini.cleanarch.core.dataprovider;

import com.semolini.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(String zipCode);
}
