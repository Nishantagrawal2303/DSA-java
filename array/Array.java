package array;

import java.util.ArrayList;

public class Array {
    public static void main(){
        ArrayList<Integer> arr= new ArrayList<>();

        arr.add(20);
        arr.set(0,40);
        arr.remove(0);
        arr.set(0,10);
        System.out.println(arr+ " ");
    }
}
