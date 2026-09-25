package ArrayListUtilitiesProject;

import java.util.ArrayList;

public class ArrayListUtilities {
    
    // Lista principal que almacenará los números enteros[cite: 4]
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    /**
     * Llena la lista con números aleatorios.
     * Genera 'size' cantidad de números enteros aleatorios entre 1 y 20 y los añade a la lista[cite: 4].
     */
    public void buildList(int size) {
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * 20 + 1)); //[cite: 4]
        }
    }
   
    /**
     * Elimina todos los números pares de la lista.
     * Itera sobre la lista; si un número es divisible por 2 (par), lo elimina[cite: 4]. 
     * Resta 1 a 'i' (i--) después de eliminar para no saltarse el siguiente elemento al reajustarse los índices[cite: 4].
     */
    public void removeEvens() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("Remove: " + list.get(i)); //[cite: 4]
                list.remove(i); //[cite: 4]
                i--; //[cite: 4]
            }
        }
    }
    
    /**
     * Calcula la suma total de los elementos.
     * Utiliza un bucle for-each para recorrer la lista y acumular el valor en la variable 'sum'[cite: 4].
     */
    public Integer getSum() {
        int sum = 0;
        for(Integer el: list) { //[cite: 4]
            sum += el; //[cite: 4]
        }
        return sum; //[cite: 4]
    }
    
    /**
     * Calcula el promedio de los valores de la lista.
     * Divide la suma total (obtenida con getSum()) entre el tamaño de la lista, forzando un resultado decimal (double)[cite: 4].
     */
    public double getAverage() {
        return (double)getSum() / list.size(); //[cite: 4]
    }
    
    /**
     * Método demostrativo para calcular la mediana.
     * Crea dos listas temporales independientes (una de tamaño par y otra impar) generadas con múltiplos de 5 desde el 60[cite: 4].
     * Calcula la mediana promediando los dos valores centrales para la lista par, y tomando el valor central directo para la lista impar[cite: 4].
     */
    public void getMedian() {
        System.out.println("\ngetMedian method"); //[cite: 4]
        
        ArrayList<Integer> evenCountList = new ArrayList<Integer>(); //[cite: 4]
        System.out.print("\t");
        for (int i = 60; i <= 100; i+= 5) {
            System.out.print(i + " ");
            evenCountList.add(i); //[cite: 4]
        }
        System.out.println("");

        ArrayList<Integer> oddCountList = new ArrayList<Integer>(); //[cite: 4]
        System.out.print("\t");
        for (int i = 60; i < 100; i+= 5) {
            System.out.print(i + " ");
            oddCountList.add(i); //[cite: 4]
        }
        System.out.println("");
        
        int evenListIndex = evenCountList.size() / 2; //[cite: 4]
        int oddListIndex = oddCountList.size() / 2; //[cite: 4]
        
        int evenMedian = (evenCountList.get(evenListIndex) + evenCountList.get(evenListIndex - 1)) / 2; //[cite: 4]
        int oddMedian = (oddCountList.get(oddListIndex)); //[cite: 4]
        
        System.out.println("\tEvenCountList Median: " + evenMedian); //[cite: 4]
        System.out.println("\tOddCountList Median: " + oddMedian); //[cite: 4]
    }
    
    /**
     * Cuenta cuántos elementos existen entre un límite inferior y uno superior (exclusivo).
     * Retorna la cantidad de elementos que cumplen la condición el > low y el < high[cite: 4].
     */
    public int valuesBetween(int low, int high) {
        int num = 0;
        for (Integer el: list) {
            if (el > low && el < high) { //[cite: 4]
                num++; //[cite: 4]
            }
        }  
        return num; //[cite: 4]
    }
    
    /**
     * Verifica si TODOS los elementos de la lista están dentro del rango proporcionado.
     * Si encuentra un solo elemento fuera del rango (<= low o >= high), retorna falso inmediatamente. Si termina de revisar, retorna verdadero[cite: 4].
     */
    public boolean allNumbersBetween(int low, int high) {
        for (Integer el: list) {
            if (el <= low || el >= high) { //[cite: 4]
                return false; //[cite: 4]
            }
        }  
        return true; //[cite: 4]
    }
    
    /**
     * Muestra pares de números consecutivos que son idénticos.
     * Compara el elemento actual list.get(i) con el siguiente list.get(i+1). Si son iguales, los imprime[cite: 4].
     */
    public void displayConsecutivePairs() {
        System.out.println("Display Consecutive Pairs"); //[cite: 4]
        int value = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i+1))) { //[cite: 4]
                System.out.println("\t" + list.get(i) + ", " + list.get(i+1)); //[cite: 4]
                value++; //[cite: 4]
            }
        }
        if (value == 0) {
            System.out.println("NO CONSECUTIVE PAIRS"); //[cite: 4]
        }
    }
    
    /**
     * Elimina elementos duplicados en toda la lista.
     * Compara cada elemento con el resto de la lista usando bucles anidados. Si encuentra una coincidencia, la elimina y ajusta el índice interno 'j'[cite: 4].
     */
    public void removeDuplicates() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) { //[cite: 4]
                    System.out.println("\tRemove: " + list.get(j)); //[cite: 4]
                    list.remove(j); //[cite: 4]
                    j--; //[cite: 4]
                }
            }
        }
    }
    
    /**
     * INTENCIONALMENTE DEFECTUOSO: Intenta eliminar un elemento mientras itera con un for-each[cite: 4].
     * Esto provocará una excepción 'ConcurrentModificationException' en Java porque altera la estructura subyacente durante la iteración[cite: 4].
     */
    public void removeElement_Bad(Integer value) {
        for (Integer obj: list) {
            if (obj.equals(value)) { //[cite: 4]
                list.remove(obj); //[cite: 4]
            }
        }
    }
   
    /**
     * Mueve un elemento específico al final de la lista.
     * Lo extrae guardándolo en una variable temporal y luego lo inserta de nuevo (lo que lo manda al final por defecto)[cite: 4].
     */
    public void moveToEnd(int index) {
        Integer valueToBeMoved = list.remove(index); //[cite: 4]
        list.add(valueToBeMoved); //[cite: 4]
    }

    /**
     * Mueve un elemento específico al inicio de la lista.
     * Lo extrae y usa list.add(0, valor) para colocarlo en la primera posición[cite: 4].
     */
    public void moveToBegining(int index) {
        Integer valueToBeMoved = list.remove(index); //[cite: 4]
        list.add(0, valueToBeMoved); //[cite: 4]
    }

    /**
     * Invierte completamente el orden de la lista.
     * Crea una lista temporal, y extrae sistemáticamente los elementos del final de la lista original para añadirlos a la temporal. Finalmente, reemplaza la referencia[cite: 4].
     */
    public void reverseList() {
        ArrayList<Integer> temp = new ArrayList<Integer>(); //[cite: 4]
        
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.add(list.remove(i)); //[cite: 4]
        }
        list = temp; //[cite: 4]
    }
   
    /**
     * Convierte la lista en una cadena de texto para su fácil visualización.
     */
    public String toString() {
        String str = "";
        for (Integer num: list) { //[cite: 4]
            str += (num + "  "); //[cite: 4]
        }
        return str; //[cite: 4]
    }
}