/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.CustomerDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author anjan
 */
public interface CustomerService extends SuperService{
    public CustomerDto getCustomer(String custId) throws Exception;
}
