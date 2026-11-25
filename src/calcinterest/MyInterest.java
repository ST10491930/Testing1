/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcinterest;

/**
 *
 * @author emeris
 */
public class MyInterest {
    
    private double rate, initialAmount, years;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }
    
    public double principleInterest(){
        
        return initialAmount * (1 + (rate / 100) * years);
    }

    public String userInterest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
