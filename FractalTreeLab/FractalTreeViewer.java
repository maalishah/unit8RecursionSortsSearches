import javax.swing.JPanel;
import javax.swing.JFrame;
public class FractalTreeViewer
{
    /**
     * Default constructor for objects of class FractalTreeViewer
     */
    public FractalTreeViewer() 
    {
        FractalTree tree = new FractalTree();
        JPanel panel = new JPanel();
        panel.add(tree);
        
        JFrame frame = new JFrame("Fractal Tree");
        frame.setBounds(100,100,800,600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
        tree.repaint();
    }

    public static void main(String[] args)
    {
        FractalTreeViewer view = new FractalTreeViewer();
    }

}
