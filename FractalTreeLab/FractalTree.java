import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;
public class FractalTree extends JPanel
{
    private Random gen = new Random();
    public FractalTree() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(800,600));
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.setColor(rand());
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }
    
    public Color rand()
    {
        return new Color(gen.nextInt(256),gen.nextInt(256),gen.nextInt(256));
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        drawTree(g, 400, 500, -90, 9);
    }

}