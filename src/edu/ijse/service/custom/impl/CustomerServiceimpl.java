/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.CustomerDao;
import edu.ijse.dto.CustomerDto;
import edu.ijse.entity.CustomerEntity;
import edu.ijse.service.custom.CustomerService;

/**
 *
 * @author anjan
 */
public class CustomerServiceimpl implements CustomerService{
    
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public CustomerDto getCustomer(String custId) throws Exception {
        CustomerEntity entity = customerDao.get(custId);
        if(entity != null){
            CustomerDto dto = new CustomerDto(entity.getCustId(),
                    entity.getTitle(),
                    entity.getName(),
                    entity.getDob(),
                    entity.getSalary(),
                    entity.getAddress(),
                    entity.getCity(),
                    entity.getProvince(),
                    entity.getZip());
            return dto;
        }
        return null;
    }
    
}
