
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
public class MonteCarloPiCalculator {

    private int x1, y1, x2, y2;
    private int numPuntosDentro;
    private float valorPi;
    private BufferedImage buffer;

    public MonteCarloPiCalculator(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean dentroDelOval(int x, int y) {
        double cx = (x1 + x2) / 2.0;
        double cy = (y1 + y2) / 2.0;
        double a = (x2 - x1) / 2.0;
        double b = (y2 - y1) / 2.0;
        return ((x - cx) * (x - cx)) / (a * a) + ((y - cy) * (y - cy)) / (b * b) <= 1;
    }

    public void calcularPuntos(int currentValue) {
        numPuntosDentro = 0;
        Random random = new Random();
        buffer = new BufferedImage(600, 700, BufferedImage.TYPE_INT_ARGB);
        Graphics g = buffer.getGraphics();
        
        // Dibuja el óvalo
        g.setColor(Color.BLUE);
        g.drawOval(x1, y1, x2 - x1, y2 - y1);

        for (int i = 0; i < currentValue; i++) {
            int x = random.nextInt(x2 - x1) + x1;
            int y = random.nextInt(y2 - y1) + y1;

            if (dentroDelOval(x, y)) {
                g.setColor(Color.RED);
                numPuntosDentro++;
            } else {
                g.setColor(Color.BLUE);
            }
            g.fillOval(x - 2, y - 2, 4, 4); 
        }
        
        g.dispose(); // Liberar recursos del gráfico
        if (currentValue > 0) {
            valorPi = (float) (((double) numPuntosDentro / currentValue) * 4);
        } else {
            valorPi = 0;
        }
    }

    public int getNumPuntosDentro() {
        return numPuntosDentro;
    }

    public float getValorPi() {
        return valorPi;
    }

    public BufferedImage getBuffer() {
        return buffer;
    }
}

