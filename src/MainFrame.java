import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JSlider slider;
    private JPanel canvas;
    private JLabel label; 
    private MonteCarloPiCalculator calculator;

    public MainFrame() {
        calculator = new MonteCarloPiCalculator(50, 50, 550, 550);
        initialize();
    }

    private void initialize() {
        canvas = new CanvasPanel(calculator);
        slider = createSlider();
        label = new JLabel("Valor actual: 0 Puntos Dentro: 0 valor Pi: 0");

        slider.addChangeListener(e -> sliderChanged());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(slider, BorderLayout.NORTH);
        mainPanel.add(label, BorderLayout.SOUTH);
        mainPanel.add(canvas, BorderLayout.CENTER);

        setTitle("El Método Monte Carlito");
        setSize(600, 700);
        setMinimumSize(new Dimension(600, 650));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setVisible(true);

        // Inicializar el cálculo de puntos
        calculator.calcularPuntos(slider.getValue());
        canvas.repaint();
    }

    private JSlider createSlider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100000, 0);
        slider.setMajorTickSpacing(10000);
        slider.setMinorTickSpacing(1000);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        return slider;
    }

    private void sliderChanged() {
        int currentValue = slider.getValue();
        calculator.calcularPuntos(currentValue);
        label.setText("Valor actual: " + currentValue + " Puntos Dentro: " + calculator.getNumPuntosDentro() + " valor Pi: " + calculator.getValorPi());
        canvas.repaint(); 
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}