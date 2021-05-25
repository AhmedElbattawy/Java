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
public class Customer {
    private String cu_name;
    private String cu_address;
    private Account account;
    protected  void setCuName(String name){
    cu_name = name;
    } 
    protected  String getCuName(){
        return cu_name;
    }
    protected  void setCuAddress(String address){
    cu_address = address;
    } 
    protected  String getCuAddress(){
        return cu_address;
    }
    protected  void setAccount(float balance){
    account.setBalance(balance);
    } 
    protected  float getAccount(){
        return account.getBalance();
    }
}
