import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class appmain {

    static int[] Interchange (int a[]){
        if(a.length == 0 || a.length == 1) return a;
        for (int i = 0;  i < a.length - 1 ; i ++){
             for(int j = i + 1 ; j < a.length ; j ++){
                 if(a[i] > a[j]){
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
        }
        return a;
    }
    static void log(int a[]){

        for (int i : a){
            System.out.print( i + " ");
        }
        System.out.println(" ");
    }
    static int[] Bubble(int a[]){
        if(a.length == 0 || a.length == 1) return a;
        for (int i = 0 ; i < a.length - 1; i++){
            for (int j = a.length - 1 ; j < i ; j--){
                if(a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }

            }
        }
        return a;
    }
    static int [] Selection(int a[]){
        if(a.length == 0 || a.length == 1) return a;
        for (int i = 0 ; i < a.length - 1; i++){
            int indexmin = i;
            for (int j = i ; j < a.length; j++){
                if(a[j] < a[indexmin])
                    indexmin = j;
            }
            if(indexmin != i){
                int temp = a[i];
                a[i] = a[indexmin];
                a[indexmin] = temp;
            }
        }
        return  a;
    }
    static int[] InsertionSort(int a[]){
        if(a.length == 0 || a.length == 1) return a;
        int pos, x;
        for (int i = 1 ; i < a.length ; i ++){
             x = a[i];
             pos = i;
            while (pos > 0 && x < a[pos - 1]){
                a[pos] = a[pos - 1];
                pos--;
            }
            a[pos] = x;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] array = {4,3,2,10,12,5,6};
        int[] a ;
        System.out.println("Interchange  ");
        a = Interchange (array);
        log(a);
        System.out.println("Bubble  ");
        a = Bubble (array);
        log(a);
        System.out.println("InsertionSort  ");
        a = InsertionSort (array);
        log(a);
        System.out.println("Selection  ");
        a = Selection (array);
        log(a);
    }
}
