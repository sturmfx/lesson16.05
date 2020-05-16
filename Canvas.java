
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Canvas extends JPanel implements MouseListener
{
    Random random;

    int width;
    int height;

    int x1;
    int y1;

    int x2;
    int y2;

    int x3;
    int y3;

    Color triangle = Color.RED;
    Color text = Color.BLUE;

    public Canvas(int w, int h)
    {
        super();
        random = new Random();
        this.width = w;
        this.height = h;
        setPreferredSize(new Dimension(this.width, this.height));
    }

    private void doDraw(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;

        g2d.clearRect(0, 0, width, height);

        g2d.setColor(triangle);

        int[] x = {x1, x2, x3};
        int[] y = {y1, y2, y3};

        g2d.fillPolygon(x, y, 3);

        double S = 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));

        g2d.setColor(text);

        g2d.drawString(String.valueOf(S), (x1 + x2 + x3) / 3, (y1 + y2 + y3) / 3);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        doDraw(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        x1 = random.nextInt(width);
        x2 = random.nextInt(width);
        x3 = random.nextInt(width);

        y1 = random.nextInt(height);
        y2 = random.nextInt(height);
        y3 = random.nextInt(height);

        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
