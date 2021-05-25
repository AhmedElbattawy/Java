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
public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.setCustomerAddress("cairo");
        bank.setCustomerName("Ahmed");
        bank.setName("Ahly");
        
        System.out.println(bank.getCustomerAddress());
                
                
               
           
        
        // TODO code application logic here
    }
}
