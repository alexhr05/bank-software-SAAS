/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.lang.model.element.Element;

/**
 *
 * @author momchil.ivanov
 */
public class DynamicArray{
    private Client arr[] = {new Client("Alea", "Lale", 1243, 3, "1234"),new Client("Alea", "Lale", 1243, 2, "1234"),new Client("Alea", "Lale", 1243, 4, "1234"),new Client("Alea", "Lale", 1243, 1, "1234")};
    int filled = arr.length;
    private MergeSort object;
    
    public void setArr(Client arr[]) {
        // O(n)
        filled = 0;
        this.arr = new Client[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
            filled++;
        }
    }

    public Client getElement(int index) {
        // O(1)
        return arr[index];
    }
        
    public void sortCreditsMoney(int caseField){
        // O(1)
        object = new MergeSort();
        if(caseField == 1){
           object.setCaseSort(1);
        }else if(caseField == 2){
           object.setCaseSort(2); 
        }
        
        System.out.println("--------------------");
        System.out.println("arr="+arr[0].getMoney());
        System.out.println("arr="+arr[1].getMoney());
        System.out.println("arr="+arr[2].getMoney());
        System.out.println("arr="+arr[3].getMoney());
        System.out.println("arr="+arr[4].getMoney());
        System.out.println("-----------");
        //LoginMenu obj = new LoginMenu();
        System.out.println("");
        System.out.println("Filled"+filled);
        
        object.sort(arr, 0, filled);
        
    }
    public void sortBubble(){
        
        for(Client el : arr){
            System.out.println("BBBBB="+el.toString());
        }
        
     /*   for(int i=0; i < filled; i++){  
            for(int j=1; j < (filled-i); j++){  
                Client temp;
                if(arr[j].getMoney()<arr[j+1].getMoney()){
                    System.out.println("Vliza");
                       //swap elements  
                       temp = arr[j-1];  
                       arr[j-1] = arr[j];  
                       arr[j] = temp;  
               }  

            }  
         }  */

        for(int i = 0;i<filled;i++){
            for(int j = 0;j<filled-1;j++){
                Client temp= new Client("Alea", "Lale", 1243, 53452, "1234");
                if(arr[j].getMoney()<arr[j+1].getMoney()){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(Client el : arr){
            System.out.println("el="+el.toString());
        }
    }
    public void replaceInOneDirect(int index, Client element){
        // O(1)
        System.out.println("  ");   
        System.out.println("REPLACEELEMENT");
        
        
        if(index >= 0 && index <= filled){
        //    System.out.println("BEFOREEEEEEelment="+arr[index]);
        
            
            arr[index] = element;    
//            System.out.println("index="+index);
//            System.out.println("AFTERelment="+arr[index]);
        }
    }
    public void add(int index, Client element) {
        //O(n)
        System.out.println("add element to position");
        if(filled == arr.length){
            Client newArr[] = new Client[arr.length*2];    
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            
            newArr[index] = element;
            
            for (int i = index + 1; i <= arr.length; i++) {
                newArr[i] = arr[i - 1];
            }
            
            arr = newArr;   
            filled++;
            System.out.println("filled="+filled);
        }else{
            Client newArr[] = new Client[arr.length*2];    
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            //System.out.println("Filled="+filled);
            newArr[index] = element;
            filled++;
            System.out.println("Add(index) newArr.length="+newArr.length);
            for (int i = index + 1; i < newArr.length-1; i++) { 
                System.out.println("i="+i);
                newArr[i] = arr[i - 1];
                System.out.println("newArr="+newArr[i]);
                System.out.println("arr="+arr[i]);
                if(arr[i] == null){
                    break;
                }
            }
            arr = newArr;
        }
 
    }    

    public void add(Client element){
        System.out.println("Add() filled="+filled);
       // System.out.println("Size="+arr.length);
        if(arr == null){
            arr = new Client[1];
            arr[filled] = element;
            filled++;
            return;
        }
        if(filled == arr.length){
            Client newArr[] = new Client[arr.length * 2];
            for(int i = 0; i < filled; i++){
                newArr[i] = arr[i];
            }
            newArr[filled] = element;
            filled++;
            this.arr = new Client[newArr.length];
            for(int i = 0; i < filled; i++){
                arr[i] = newArr[i];
            }
        }else{
            arr[filled] = element;
            filled++;
        }
    }
    
    public int getSize(){
        return filled;
    }    

    public void remove(int index) {
        //O(n)
        Client newArr[] = new Client[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        arr = newArr;
    }

    public void addAll(Client arr[]) {
        //O(n)
        Client newArr[] = new Client[this.arr.length + arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            newArr[i + this.arr.length] = arr[i];
        }
        this.arr = newArr;
    }

    public String toString() {
        //O(n)
        String str = "";
        for (int i = 0; i < filled; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

    
}
