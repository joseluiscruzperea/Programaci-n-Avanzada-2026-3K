package ArraysUtilitiesProject;

public class ArraysUtilities {
    
    // Arreglo primitivo de tamaño fijo a 20 elementos y contador de elementos activos[cite: 5]
    private int[] ary = new int[20];
    private int count = 0;
    
    /**
     * Llena el arreglo con números aleatorios.
     * Itera sobre toda la longitud del arreglo y asigna a cada posición un valor aleatorio entre 1 y 20, 
     * incrementando el contador 'count' en cada iteración[cite: 5].
     */
    public void buildList() {
        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int)(Math.random() * 20 + 1); //[cite: 5]
            count++; //[cite: 5]
        }
    }
    
    /**
     * Elimina todos los números pares del arreglo activo.
     * Itera hasta 'count'; si el residuo de dividir el número entre 2 es 0, llama al método removeElement(i) 
     * y decrementa la variable 'i' para evitar saltarse el elemento que se desplazó a esta posición[cite: 5].
     */
    public void removeEvens() {
        for (int i = 0; i < count; i++) {
            if (ary[i] % 2 == 0) { //[cite: 5]
                removeElement(i); //[cite: 5]
                i--; //[cite: 5]
            }
        }
    }
    
    /**
     * Elimina un elemento en un índice específico y compacta el arreglo.
     * Imprime el valor a eliminar, desplaza todos los elementos a la derecha del índice una posición a la izquierda, 
     * y reduce el tamaño de 'count' en 1[cite: 5].
     */
    public void removeElement(int index) {
        System.out.println("remove: " + ary[index]); //[cite: 5]
        for (int i = index; i < count - 1; i++) {
            ary[i] = ary[i + 1]; //[cite: 5]
        }
        count--; //[cite: 5]
    }
    
    /**
     * Calcula la suma de todos los elementos almacenados.
     * Utiliza un bucle for-each iterando sobre todo el arreglo 'ary' para acumular los valores en la variable 'sum'[cite: 5].
     */
    public int getSum() {
        int sum = 0;
        for(int el: ary) { //[cite: 5]
            sum += el; //[cite: 5]
        }
        return sum; //[cite: 5]
    }
    
    /**
     * Calcula el promedio de los valores activos.
     * Divide la suma total (obtenida con getSum()) entre la cantidad de elementos activos ('count')[cite: 5].
     */
    public double getAverage() {
        return (double)getSum() / count; //[cite: 5]
    }
    
    /**
     * Método demostrativo para calcular la mediana de arreglos fijos.
     * Define internamente dos arreglos de prueba (uno de longitud par y otro impar), y calcula sus medianas 
     * ubicando los índices centrales para imprimirlas en consola[cite: 5].
     */
    public void getMedian() {
        int[] evenCountList = {60, 65, 70, 75, 80, 85, 90, 95}; //[cite: 5]
        int[] oddCountList = {60, 65, 70, 75, 80, 85, 90, 95, 100}; //[cite: 5]
        
        int oddIndex = oddCountList.length / 2; //[cite: 5]
        int oddMedian = oddCountList[oddIndex]; //[cite: 5]
        
        int evenIndex = evenCountList.length / 2; //[cite: 5]
        int evenMedian = (evenCountList[evenIndex] + evenCountList[evenIndex - 1]) / 2; //[cite: 5]
        
        System.out.println("EvenCountList Median: " + evenMedian); //[cite: 5]
        System.out.println("OddCountList Median: " + oddMedian); //[cite: 5]
    }
    
    /**
     * Cuenta la cantidad de valores que están dentro de un rango excluyente.
     * Itera el arreglo y aumenta el contador 'num' si el elemento es mayor que 'low' y menor que 'high'[cite: 5].
     */
    public int valuesBetween(int low, int high) {
        int num = 0;
        for (int el: ary) {
            if (el > low && el < high) { //[cite: 5]
                num++; //[cite: 5]
            }
        }
        return num; //[cite: 5]
    }
     
    /**
     * Evalúa si absolutamente todos los números están dentro de un rango excluyente.
     * Retorna 'false' si encuentra cualquier elemento menor o igual a 'low', o mayor o igual a 'high'[cite: 5].
     */
    public boolean allNumbersBetween(int low, int high) {
        for (int el: ary) {
            if (el <= low || el >= high) { //[cite: 5]
                return false; //[cite: 5]
            }
        }
        return true; //[cite: 5]
    }
    
    /**
     * Muestra pares consecutivos que sean idénticos.
     * Itera hasta 'count - 1' comparando la posición actual con la siguiente y lleva registro con la variable 'value'[cite: 5].
     */
    public void displayConsecutivePairs() {
        System.out.println("Display Consecutive Pairs"); //[cite: 5]
        int value = 0;
        for (int i = 0; i < count - 1; i++) {
            if (ary[i] == ary[i+1]) { //[cite: 5]
                System.out.println("\t" + ary[i] + ", " + ary[i+1]); //[cite: 5]
                value++; //[cite: 5]
            }
        }
        if (value == 0) {
            System.out.println("NO CONSECUTIVE PAIRS"); //[cite: 5]
        }
    }
    
    /**
     * Elimina elementos duplicados usando bucles anidados.
     * Compara cada elemento con el resto del arreglo activo; si son iguales, remueve el segundo y ajusta el índice interno[cite: 5].
     */
    public void removeDuplicates() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (ary[i] == ary[j]) { //[cite: 5]
                    removeElement(j); //[cite: 5]
                    j--; //[cite: 5]
                }
            }
        }
    }

    /**
     * Mueve el elemento de la posición indicada al final del arreglo activo.
     * Extrae el valor, desplaza a la izquierda todos los elementos posteriores y reasigna el valor extraído a la última posición activa 'count - 1'[cite: 5].
     */
    public void moveToEnd(int index) {
        int valueToBeMoved = ary[index]; //[cite: 5]
        for (int i = index; i < count - 1; i++) {
            ary[i] = ary[i + 1]; //[cite: 5]
        }
        ary[count - 1] = valueToBeMoved; //[cite: 5]
    }

    /**
     * Mueve el elemento de la posición indicada al inicio del arreglo.
     * Extrae el valor, desplaza a la derecha todos los elementos anteriores al índice, y coloca el valor en la posición 0[cite: 5].
     */
    public void moveToBeginning(int index) {
        int valueToBeMoved = ary[index]; //[cite: 5]
        for (int i = index; i > 0; i--) {
            ary[i] = ary[i-1]; //[cite: 5]
        }
        ary[0] = valueToBeMoved; //[cite: 5]
    }

    /**
     * Invierte el orden lógico de los elementos.
     * Crea un arreglo temporal, copia los elementos del arreglo original en orden inverso basándose en 'count', y reasigna la referencia[cite: 5].
     */
    public void reverseList() {
        int[] temp = new int[ary.length]; //[cite: 5]
        int current = 0;
        for (int i = count - 1; i >= 0; i--) {
            temp[current] = ary[i]; //[cite: 5]
            current++; //[cite: 5]
        }
        ary = temp; //[cite: 5]
    }
    
    /**
     * Genera un String con los elementos actualmente activos en el arreglo separados por un espacio, recorriendo desde 0 hasta 'count'[cite: 5].
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += (ary[i] + "  "); //[cite: 5]
        }
        return str; //[cite: 5]
    }
}