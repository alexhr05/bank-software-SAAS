
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleksandarpd
 */
public class Client extends Person{
    
    private double kredit;
    private double money;
    private String  pin;
    
    public void setKredit(double kredit){
        if(((double) Math.round(kredit*100.0)/100.0)>0.00){
            this.kredit = ((double) (Math.round(kredit*100.0)/100.0));
        }else{
            //JOptionPane.showMessageDialog(new JFrame(),"Get a real trust");  
            throw new NullPointerException("Kredit can't be a negative value");
        }
    }
    
    public void setMoney(double money){
        if(((double) Math.round(money*100.0)/100.0)>0.0){
            this.money = ((double) (Math.round(money*100.0)/100.0));
        }else{
            //JOptionPane.showMessageDialog(new JFrame(),"Get a real trust");  
            throw new NullPointerException("Money can't be a negative value");
        }
    }

    public void setPin(String pin){
        Pattern patt = Pattern.compile("^[0-9]{4}$");
        Matcher m = patt.matcher(""+pin);
        
        if(m.matches()){
            this.pin = pin;
        }else{
            //JOptionPane.showMessageDialog(new JFrame(),"Write pin with 4 digit");  
            throw new NullPointerException("Not a pin");
        }
    }
    
    public double getKredit(){
        return(this.kredit);
    }

    public double getMoney(){
        return(this.money);
    }
    public String getPin(){
        return ""+this.pin;
    }
    
    
    public Client(String name, String surName, double kredit, double money,String pin){
        setName(name);
        setSurName(surName);
        setKredit(kredit);
        setMoney(money);
        setPin(pin);
    }
    public Client(Client obj){
        this(obj.getName(), obj.getSurName(),obj.getKredit(),obj.getMoney(), obj.getPin());
        
    }
    
    
    public String toString(){
        return String.format("First name: %s, SurName: %s , Credit: %.2f, Money: %.2f, Pin: %s ",getName(),getSurName(),getKredit(),getMoney(),getPin());
    }



}
