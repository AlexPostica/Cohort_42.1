package lesson31;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, #31
 * @author Alexandru Postica
 * @version 25.Mar
 */

public class Lesson31 extends JFrame {
    private Random random;
    private final Color[] COLORS = {Color.red, Color.green, Color.blue, Color.pink, Color.magenta, Color.yellow};
    private int CITCLE_COUNT = 100;
    public static void main(String[] args) {
        new Lesson31();
    }

    public Lesson31() {
        setTitle("Hello, Swing!");  // заголовок окна
        setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии
        setSize(500, 300); // размеры окна
        setLocationRelativeTo(null); // позиция на экране

        random = new Random();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX() + ", " +e.getX());
                canvas.repaint();
            }
        });

        JButton btnDraw = new JButton("Draw");
        JButton btnExit = new JButton("Exit");

        btnDraw.addActionListener(e -> canvas.repaint());

        btnExit.addActionListener(e -> System.exit(0));

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnDraw);
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true); // сделать видимым
    }

    private class Canvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < CITCLE_COUNT; i++) {
                int d = random.nextInt(20) + 60;
                int x = random.nextInt(getWidth() - d);
                int y = random.nextInt(getHeight() - d);
                Color color = COLORS[random.nextInt(COLORS.length)];
                g.setColor(color);
                g.fillOval(x, y, d, d);
                g.setColor(Color.black);
                g.drawOval(x, y, d, d);
            }
        }
    }
}
