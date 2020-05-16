
import javax.swing.*;

public class Triangle extends JFrame
{
    Canvas canvas;

    public Triangle(int width, int height)
    {
        super();
        canvas = new Canvas(width, height);
        add(canvas);
        pack();
        setVisible(true);
        setTitle("TRIANGLE GENERATOR");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(canvas);
    }

    public static void main(String[] args)
    {
        Triangle okno = new Triangle(800, 800);
    }
}
