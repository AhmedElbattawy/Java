/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author MedOo
 */
public class Bank {
    private String B_name;
    private String B_address;
    private Customer customer;
    public  void setName(String name){
    B_name = name;
    }
    
    public  String getName(){
        return B_name;
    }
    public void setCustomerName(String name){
    customer.setCuName(name);}
    public String getCustomerName(){
     return customer.getCuName();}
    public void setCustomerAddress(String Address){
    customer.setCuAddress(Address);}
    public String getCustomerAddress(){
     return customer.getCuAddress();}
    
    
    
}