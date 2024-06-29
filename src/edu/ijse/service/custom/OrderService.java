/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.OrderDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author anjan
 */
public interface OrderService extends SuperService{
    public String placeOrder(OrderDto orderDto) throws Exception;
}
