/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class MergeSortTest {
    private int caseSort = 1;
    private double leftValue,rightValue;
    public void setCaseSort(int caseSort) {
        this.caseSort = caseSort;
    }

    public void sort(DynamicArray arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            sort(arr, low, mid);
            sort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }
   

    private void merge(DynamicArray arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        DynamicArray leftArr = new DynamicArray();
        DynamicArray rightArr = new DynamicArray();

        for (int i = 0; i < n1; ++i) {
            leftArr.add(arr.getElement(left + i));
        }

        for (int j = 0; j < n2; ++j) {
            rightArr.add(arr.getElement(mid + 1 + j));
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            System.out.println("n1="+n1);
            System.out.println("n2="+n2);
            System.out.println("i="+i);
            System.out.println("j="+j);
            caseSort = 1;
            if( leftArr.getElement(i) != null && rightArr.getElement(j) != null && caseSort == 1){
                leftValue = leftArr.getElement(i).getMoney();
                rightValue = rightArr.getElement(j).getMoney();
            }
            //}else if( rightArr.getElement(j) != null && leftArr.getElement(i) != null &&  caseSort == 2){
//                leftValue = leftArr.getElement(i).getKredit();
//                rightValue = rightArr.getElement(j).getKredit();
//            }
            //double leftValue = (caseSort == 1 && leftArr.getElement(i) != null) ? leftArr.getElement(i).getMoney() : leftArr.getElement(i).getKredit();
            //double rightValue = (caseSort == 2 && rightArr.getElement(j) != null) ? rightArr.getElement(j).getMoney() : rightArr.getElement(j).getKredit();

            if (leftValue <= rightValue) {
                arr.replaceInOneDirect(k, leftArr.getElement(i));
                i++;
            } else {
                arr.replaceInOneDirect(k, rightArr.getElement(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.replaceInOneDirect(k, leftArr.getElement(i));
            i++;
            k++;
        }

        while (j < n2) {
            arr.replaceInOneDirect(k, rightArr.getElement(j));
            j++;
            k++;
        }
        System.out.println("size="+arr.getSize());
        System.out.println("-----------------------");
        System.out.println("");
    }
    
    public static void printArray(DynamicArray arr){
        int n = arr.getSize();
        for(int i = 0;i < n; i++){
            System.out.println(arr.getElement(i) + "");
        }
        System.out.println();
    }

    /* public void merge(DynamicArray arr, int l, int r, int m){
        System.out.println("--------------------------------- IN MERGE ------------------------------------");
        int n1 = m-l +  1; 
        int n2 = r-m; 
        
        
        double[] L = new double[n1];
        double[] R = new double[n2];
        System.out.println("n1="+n1);
        for(int i = 0;i < n1; i++){
            System.out.println("index="+(l+i));
            L[i] = arr.getElement(l+i).getMoney();   
            System.out.println("LEFT = arr.getElement("+(l+i)+").getMoney()="+arr.getElement(l+i).getMoney());
            System.out.println("--------");
        }
        System.out.println("");
        System.out.println("n2="+n2);
        System.out.println("");
        for(int j = 0;j < n2; j++){
            
            R[j] = arr.getElement(m+j+1).getMoney();
            
            
            System.out.println("RIGHT index="+(m+j+1));
            System.out.println("l="+l);
            System.out.println("r="+r);
            System.out.println("m="+m);
            System.out.println("j="+j);
        }
            
            
            
            
            //System.out.println("RIGHT = arr.getElement("+(m+j+1)+").getMoney()="+arr.getElement(m+j+1).getMoney());
        
        /*for(int j = 0; j < n1;j++){
            System.out.println("Sort Right - R[j]"+R[j]);
        }
        int i = 0, j = 0;
        int k = l;
        
        while(i < n1 && j < n2){
                if(L[i] <= R[j]){
                   
                    System.out.println("--------Get Before From LEft arr="+arr.getElement(k).getMoney());
                    arr.getElement(k).setMoney( L[i]);
                    System.out.println("L["+i+"]="+L[i]);
                    System.out.println("--------Get After From LEft arr="+arr.getElement(k).getMoney());
                    i++;
                }else{
                    
                    System.out.println("+++++++Get Before From RIGTH arr["+k+"]="+arr.getElement(k).getMoney());
                    System.out.println("R["+j+"]="+R[j]);
                    arr.getElement(k).setMoney(R[j]);
                    System.out.println("++++++++Get AFTER From Right arr["+k+"]="+arr.getElement(k).getMoney());
                    j++;
                }
            
            k++;
        }
        while(i < n1-1){
            arr.getElement(k).setMoney(L[i]);
            
            i++;
            k++;
        }
        
        while(j < n2){
            arr.getElement(k).setMoney(R[j]);
            j++;
            k++;
        }
        printArray(arr);
         System.out.println("--------------------------------- OUT MERGE");
    }
    
    public void sort(DynamicArray arr, int l, int r){
        
        if(l < r){
            int m = (l+r) / 2;
            
            sort(arr, l, m);
            sort(arr, m + 1, r);
            
            merge(arr, l, r, m);
        }
    }
    public void printArray(DynamicArray arr){
        for(int i = 0 ; i < arr.getSize();i++ ){
            System.out.println(arr.getElement(i).getMoney() + " "); 
        }
        System.out.println("");
    }*/
}
