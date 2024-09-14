import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private MonteCarloPiCalculator calculator;

    public CanvasPanel(MonteCarloPiCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (calculator.getBuffer() != null) {
            g.drawImage(calculator.getBuffer(), 0, 0, null);
        }
    }

}
