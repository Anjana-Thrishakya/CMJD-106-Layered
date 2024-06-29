/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.CustomerDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.CustomerService;

/**
 *
 * @author anjan
 */
public class CustomerController {
   
    private CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public CustomerDto getCustomer(String custId) throws Exception{
        return customerService.getCustomer(custId);
    }
}
