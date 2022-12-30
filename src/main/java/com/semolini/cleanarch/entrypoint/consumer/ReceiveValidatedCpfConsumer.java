package com.semolini.cleanarch.entrypoint.consumer;

import com.semolini.cleanarch.core.domain.Customer;
import com.semolini.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.semolini.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.semolini.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "semolini")
    public void receive(CustomerMessage customerMessage) {
        Customer customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
