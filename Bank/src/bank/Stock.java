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
public class Stock {
    private int quantity;
    private float price;
    private int order_no;
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }

    public int getOrder_no() {
        return order_no;
    }
    
}
