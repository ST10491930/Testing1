/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interestrate;
import calcinterest.MyInterest;
import java.util.Scanner;
/**
 *
 * @author emeris
 */
public class CalcResults {
    
    MyInterest mi = new MyInterest();
    Scanner sc = new Scanner(source: System.in);
    
    
    public void interestData(){
        
        System.out.print(s: "What is the Principle Amount: R");
        mi.setAmount(pAmount:sc.nextDouble());
        
        System.out.print(s:" and the amount of years: ");
        mi.setYears(years:sc.nextInt());
        
        System.out.print("What is the rate (in %): ");
        mi.setRate(rate:sc.nextDouble());
    }
    
    
    
    public void displayInterest(){
        System.out.println("-----Investment Details-----");
        System.out.print("\nPrinciple Amount: $" + mi.getInitialAmount() + "\n Interest Rate: " + mi.getRate() + "%" + "\nYears Of Investment: " + mi.getYears() + "\nAccumulated Amount: $" + mi.userInterest() + );
    }
}
