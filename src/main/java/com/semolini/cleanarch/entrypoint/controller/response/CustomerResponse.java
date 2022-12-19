package com.semolini.cleanarch.entrypoint.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private String cpf;
    private Boolean isValid;
    private AddressResponse addressResponse;
}
