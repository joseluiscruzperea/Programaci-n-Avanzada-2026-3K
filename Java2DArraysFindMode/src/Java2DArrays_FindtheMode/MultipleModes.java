package Java2DArrays_FindtheMode;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleModes {
    static ArrayList<Integer> mode(int a[], int n) {
        int maxCount = 0;
        ArrayList<Integer> modes = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (a[j] == a[i]) {
                    ++count;
                }
            }
            
            // Si encuentra una nueva frecuencia máxima, limpia la lista y añade el número
            if (count > maxCount) {
                maxCount = count;
                modes.clear();
                modes.add(a[i]);
            } 
            // Si empata con la frecuencia máxima y el número no está en la lista, lo añade
            else if (count == maxCount && !modes.contains(a[i])) {
                modes.add(a[i]);
            }
        }
        return modes;
    }

    public static void main(String args[]) {
        int a[] = {2, 3, 2, 3, 3, 4, 5, 2, 2, 5, 5, 5};
        int n = a.length;
        Arrays.sort(a);
        
        System.out.println("Modes: " + mode(a, n)); 
    }
}
