/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author aleksph
 */
public class MergeSort<T> {
    private int caseSort;
    DynamicArray obj = new DynamicArray();
    public void setCaseSort(int caseSort){
        this.caseSort = caseSort;
    }
    public int getCaseSort(){
        return this.caseSort;
    }
    
    public void merge(Client[] arr, int l, int r, int m){
        System.out.println("Vhod MERGE IN");
        
        System.out.println("VUV MERGE : Filled="+obj.filled);
        System.out.println("lef="+l);
        System.out.println("rig="+r);
        System.out.println("mid="+m);
        System.out.println("arr.length="+arr.length);
        int n1 = m-l+1; 
        int n2 = r-m; 
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);
        
        double[] L = new double[n1];
        double[] R = new double[n2];

        for(int i = 0;i < n1; i++){
            if(getCaseSort() == 1){
                
                L[i] = arr[l+i].getKredit();   
                
            }else if(getCaseSort() == 2){
                System.out.println("merge Sort Lefttt Half index======"+(l+i));
                L[i] = arr[l+i].getMoney();    
                System.out.println("L["+i+"]="+L[i]);
            }
            
        }
        /*for(int j = 0; j < n1;j++){
            System.out.println("Sort Left - L[j]"+L[j]);
        }*/
        
        for(int j = 0;j < n2; j++){
            if(getCaseSort() == 1){
                R[j] = arr[m+j].getKredit();  
                
            }else if(getCaseSort() == 2){
                System.out.println("merge Sort Right Half index======"+(m+j+1));
                
                R[j] = arr[m+j+1].getMoney();    
                System.out.println("R["+j+"]="+R[j]);
            }
        }
        /*for(int j = 0; j < n1;j++){
            System.out.println("Sort Right - R[j]"+R[j]);
        }*/
        int i = 0, j = 0;
        int k = l;
        
        while(i < n1 && j < n2){
            if(getCaseSort() == 1){
                if(L[i] <= R[j]){
                    arr[k].setKredit(L[i]);
                    i++;
                }else{
                    arr[k].setKredit(R[j]);
                    j++;
                }
            }else if(getCaseSort() == 2){
                if(L[i] <= R[j]){
                    arr[k].setMoney(L[i]);
                    i++;
                }else{
                    arr[k].setMoney(R[j]);
                    j++;
                }
            }
            
            k++;
        }
        
        while(i < n1){
            if(getCaseSort() == 1){
                arr[k].setKredit(L[i]);
            }else if(getCaseSort() == 2){
                arr[k].setMoney(L[i]);
            }
            i++;
            k++;
        }
        
        while(j < n2){
            if(getCaseSort() == 1){
                arr[k].setKredit(R[j]);
            }else if(getCaseSort() == 2){
                arr[k].setMoney(R[j]);
            }
            j++;
            k++;
        }
        System.out.println("Vhod MERGE OOOUT");
    }
    
    public void sort(Client[] arr, int l, int r){
        System.out.println("Vhod SORT IN");
        System.out.println("VUV SORT : Filled"+obj.filled);
        //DynamicArray obj = new DynamicArray();
        //System.out.println("arr="+arr[2].getMoney());
        System.out.println("--------------------------------------");
        if(l < r){
            int m = (l+r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            for(int i = 0;i<obj.filled;i++){
                System.out.println("From Sort - arr="+arr[i].getMoney());
            }    
            merge(arr, l, r, m);
        }
        System.out.println("Vhod SORT OUT");
    }
    
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0;i < n; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
    
    
}
