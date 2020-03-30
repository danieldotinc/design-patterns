package com.codewithmosh.command.course;

import com.codewithmosh.command.course.fx.Command;

public class CallCustomerCommand implements Command {
    private CustomerService service;
    public CallCustomerCommand(CustomerService service) {
        this.service = service;
    }


    @Override
    public void execute() {
        service.callCustomer();
    }
}
