package JavaCalculatorProject;

public class Calculator {
    
    public int add(int x, int y){
        return x + y;
    }
    
    // Método añadido para la resta
    public int subtract(int x, int y){
        return x - y;
    }

    // Método añadido para la multiplicación
    public int multiply(int x, int y){
        return x * y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        return x / y;
    }
}