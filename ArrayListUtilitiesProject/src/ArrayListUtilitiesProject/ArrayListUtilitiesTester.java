package ArrayListUtilitiesProject;

import java.util.Scanner;

public class ArrayListUtilitiesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayListUtilities utils = new ArrayListUtilities();
        boolean running = true;

        // i. Greet the user
        System.out.println("¡Bienvenido al sistema de pruebas de ArrayList Utilities!");

        // ii. Give the user options to choose the methods
        while (running) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Construir lista aleatoria (buildList)");
            System.out.println("2. Eliminar números pares (removeEvens)");
            System.out.println("3. Mostrar Suma y Promedio (getSum / getAverage)");
            System.out.println("4. Demostrar Mediana (getMedian)");
            System.out.println("5. Mostrar pares consecutivos (displayConsecutivePairs)");
            System.out.println("6. Eliminar duplicados (removeDuplicates)");
            System.out.println("7. Mover índice al inicio (moveToBegining)");
            System.out.println("8. Mover índice al final (moveToEnd)");
            System.out.println("9. Invertir lista (reverseList)");
            System.out.println("10. Salir");
            System.out.print("Elige una opción: ");
            
            int choice = input.nextInt();

            // iii. Call each method as required
            switch (choice) {
                case 1:
                    System.out.print("Ingresa el tamaño de la lista a generar: ");
                    int size = input.nextInt();
                    utils.buildList(size);
                    // iv. Use the toString() method to print the array at appropriate times
                    System.out.println("Lista generada: " + utils.toString());
                    break;
                case 2:
                    utils.removeEvens();
                    System.out.println("Lista sin pares: " + utils.toString());
                    break;
                case 3:
                    System.out.println("Suma total: " + utils.getSum());
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
                    System.out.println("Lista sin duplicados: " + utils.toString());
                    break;
                case 7:
                    System.out.print("Ingresa el índice a mover al inicio: ");
                    int indexStart = input.nextInt();
                    utils.moveToBegining(indexStart);
                    System.out.println("Lista actualizada: " + utils.toString());
                    break;
                case 8:
                    System.out.print("Ingresa el índice a mover al final: ");
                    int indexEnd = input.nextInt();
                    utils.moveToEnd(indexEnd);
                    System.out.println("Lista actualizada: " + utils.toString());
                    break;
                case 9:
                    utils.reverseList();
                    System.out.println("Lista invertida: " + utils.toString());
                    break;
                case 10:
                    running = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        input.close();
    }
}	