package ArraysUtilitiesProject;

import java.util.Scanner;

public class ArraysUtilitiesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArraysUtilities utils = new ArraysUtilities();
        boolean isRunning = true;

        // i. Greet the user
        System.out.println("¡Bienvenido al panel de utilidades para Arreglos (Arrays)!");
        
        // Inicializar el arreglo por defecto para poder utilizar las opciones
        utils.buildList();
        System.out.println("Arreglo inicial generado: " + utils.toString());

        // ii. Give the user options to choose the methods
        while (isRunning) {
            System.out.println("\n--- MENÚ PRINCIPAL DE ARREGLOS ---");
            System.out.println("1. Reconstruir lista aleatoria (buildList)");
            System.out.println("2. Eliminar números pares (removeEvens)");
            System.out.println("3. Calcular Suma y Promedio");
            System.out.println("4. Mostrar demostración de Mediana (getMedian)");
            System.out.println("5. Mostrar pares consecutivos (displayConsecutivePairs)");
            System.out.println("6. Eliminar duplicados (removeDuplicates)");
            System.out.println("7. Mover elemento al inicio");
            System.out.println("8. Mover elemento al final");
            System.out.println("9. Invertir arreglo (reverseList)");
            System.out.println("10. Validar números en rango (valuesBetween / allNumbersBetween)");
            System.out.println("11. Salir");
            System.out.print("Elige una opción: ");
            
            int choice = input.nextInt();

            // iii. Call each method as required
            switch (choice) {
                case 1:
                    utils = new ArraysUtilities(); // Reiniciar el objeto para evitar desbordamiento del count
                    utils.buildList();
                    // iv. Use the toString() method to print the array at appropriate times
                    System.out.println("Nuevo arreglo: " + utils.toString());
                    break;
                case 2:
                    utils.removeEvens();
                    System.out.println("Arreglo sin pares: " + utils.toString());
                    break;
                case 3:
                    System.out.println("Suma de elementos: " + utils.getSum());
                    System.out.println("Promedio: " + utils.getAverage());
                    break;
                case 4:
                    utils.getMedian();
                    break;
                case 5:
                    utils.displayConsecutivePairs();
                    break;
                case 6:
                    utils.removeDuplicates();
                    System.out.println("Arreglo sin duplicados: " + utils.toString());
                    break;
                case 7:
                    System.out.print("Ingresa el índice a mover al inicio: ");
                    int startIdx = input.nextInt();
                    utils.moveToBeginning(startIdx);
                    System.out.println("Arreglo modificado: " + utils.toString());
                    break;
                case 8:
                    System.out.print("Ingresa el índice a mover al final: ");
                    int endIdx = input.nextInt();
                    utils.moveToEnd(endIdx);
                    System.out.println("Arreglo modificado: " + utils.toString());
                    break;
                case 9:
                    utils.reverseList();
                    System.out.println("Arreglo invertido: " + utils.toString());
                    break;
                case 10:
                    System.out.print("Ingresa el límite inferior (low): ");
                    int low = input.nextInt();
                    System.out.print("Ingresa el límite superior (high): ");
                    int high = input.nextInt();
                    System.out.println("Cantidad de valores en rango: " + utils.valuesBetween(low, high));
                    System.out.println("¿Todos los valores están en rango?: " + utils.allNumbersBetween(low, high));
                    break;
                case 11:
                    isRunning = false;
                    System.out.println("Cerrando programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        }
        input.close();
    }
}