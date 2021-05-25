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
public class Saving extends Account{
    private float interest_rate;

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public float getInterest_rate() {
        return interest_rate;
    }
    
    
}
