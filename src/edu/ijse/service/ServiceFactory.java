/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service;

/**
 *
 * @author anjan
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        switch (serviceType) {
            case ITEM:
                return null;
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        ITEM
    }
}
