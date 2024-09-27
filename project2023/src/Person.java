
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
public abstract class Person {
    
    Pattern name_pattern = Pattern.compile("^[A-Z][a-z]+"); 
    
    String name;
    String surName;
    
    @Override
    public abstract String toString();
    
    public void setName(String name){
        Matcher matcher = name_pattern.matcher(name.trim());
        if(matcher.matches()){
            this.name = name.trim();
        }else{
            //JOptionPane.showMessageDialog(new JFrame(),"Write a real name pleace.(Don't forget to write in English)");  
//            throw new NullPointerException("Not a real name");
        }

    }
    
    public String getName(){
        return(this.name);
    }
    
    public void setSurName(String surName){
        Matcher matcher = name_pattern.matcher(surName.trim());
        if(matcher.matches()){
            this.surName = surName.trim();
        }else{
            //JOptionPane.showMessageDialog(new JFrame(),"Write a real surname pleace.(Don't forget to write in English)");  
            throw new NullPointerException("Not a real surname");
        }

    }
    
    public String getSurName(){
        return(this.surName);
    }
    
}
