
import javax.swing.*;

public class CalculadoraGUI {

    // la interfaz contene la clase main, que es el punto de entrada de la
    // aplicación
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Patr1");
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JButton sumarButton = new JButton("Sumar");
        JButton restarButton = new JButton("Restar");
        JButton multiplicaButton = new JButton("Multiplicar");
        JButton divideButton = new JButton("Dividir");

        JLabel resultadoLabel = new JLabel("Resultado: ");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Número 1"));
        panel.add(num1Field);

        panel.add(new JLabel("Número 2"));
        panel.add(num2Field);

        panel.add(sumarButton);
        panel.add(restarButton);
        panel.add(multiplicaButton);
        panel.add(divideButton);
        panel.add(resultadoLabel);

        sumarButton.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                double resultado = Calculadora.sumar(n1, n2);
                resultadoLabel.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Por favor, ingrese números válidos.");
            }
        });

        restarButton.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());

                double resultado = Calculadora.restar(n1, n2);

                resultadoLabel.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex) {
                resultadoLabel.setText("Por favor, ingrese números válidos.");
            }

        });
        multiplicaButton.addActionListener(e -> {
            try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());

            double resultado = Calculadora.multiplicar(n1, n2);

            resultadoLabel.setText("Resultado: " + resultado);}
            catch (NumberFormatException ex) {
                resultadoLabel.setText("Por favor, ingrese números válidos.");
            }
        });

        divideButton.addActionListener(e -> {

            try{
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());

            if (n2 == 0) {
                resultadoLabel.setText("No se puede dividir por cero.");
            } else {
                
                    double resultado = Calculadora.dividir(n1, n2);
                    resultadoLabel.setText("Resultado: " + resultado);
                }      }catch (NumberFormatException ex) {
                    resultadoLabel.setText("Por favor, ingrese números válidos.");
            
            }catch (IllegalArgumentException ex) {
                    resultadoLabel.setText(ex.getMessage());
          

        }  });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
