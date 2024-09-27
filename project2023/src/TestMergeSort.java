/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class TestMergeSort {
    public static void main(String[] args) {
     //   int[] numbers = {53,10,6,5,4,3};
        MergeSortTest obj = new MergeSortTest();
        LoginMenu object = new LoginMenu();
        
        obj.printArray(object.clients);
        DynamicArray objects = new DynamicArray();
        //objects.sortBubble();
        obj.sort(object.clients, 0, object.clients.getSize());
        
        obj.printArray(object.clients);
        
    }
   
}
