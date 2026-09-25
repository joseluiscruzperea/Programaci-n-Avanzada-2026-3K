package JavaCalculatorProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcMain extends JFrame implements ActionListener {
    private JTextField txtX, txtY, txtResult;
    private JButton btnAdd, btnSubtract, btnMultiply, btnDivide;
    private Calculator calc;

    public CalcMain() {
        // Instanciar la clase lógica
        calc = new Calculator();

        // Configuración de la ventana principal
        setTitle("Java Calculator");
        setSize(320, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Campos de entrada y salida
        add(new JLabel("Valor X:", SwingConstants.CENTER));
        txtX = new JTextField();
        add(txtX);

        add(new JLabel("Valor Y:", SwingConstants.CENTER));
        txtY = new JTextField();
        add(txtY);

        add(new JLabel("Resultado:", SwingConstants.CENTER));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        add(txtResult);

        // Inicialización de botones
        btnAdd = new JButton("Sumar (+)");
        btnSubtract = new JButton("Restar (-)");
        btnMultiply = new JButton("Multiplicar (*)");
        btnDivide = new JButton("Dividir (/)");

        // Añadir el Action Listener a los botones
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);

        // Añadir botones a la ventana
        add(btnAdd);
        add(btnSubtract);
        add(btnMultiply);
        add(btnDivide);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Leer los valores ingresados
            int x = Integer.parseInt(txtX.getText());
            int y = Integer.parseInt(txtY.getText());
            double result = 0;

            // Determinar qué botón se presionó y llamar al método correspondiente
            if (e.getSource() == btnAdd) {
                result = calc.add(x, y);
            } else if (e.getSource() == btnSubtract) {
                result = calc.subtract(x, y);
            } else if (e.getSource() == btnMultiply) {
                result = calc.multiply(x, y);
            } else if (e.getSource() == btnDivide) {
                result = calc.divide(x, y);
            }

            // Mostrar el resultado
            txtResult.setText(String.valueOf(result));
            
        } catch (NumberFormatException ex) {
            txtResult.setText("Error: Solo números enteros");
        } catch (ArithmeticException ex) {
            txtResult.setText("Error: División por cero");
        }
    }

    public static void main(String[] args) {
        // Ejecutar el driver (interfaz gráfica)
        SwingUtilities.invokeLater(() -> {
            new CalcMain().setVisible(true);
        });
    }
}