import javax.swing.JFrame;

public class LifeFrame extends JFrame{
    public LifeFrame() {
        
        add(new LifePanel());

        setSize(1920, 1200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        new LifeFrame();
    }
}