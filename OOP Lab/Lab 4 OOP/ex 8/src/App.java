import javax.swing.JFrame;
public class App {
    public static void main(String[] args) {
        
        BarChart ex1 = new BarChart();
        
        JFrame application1 = new JFrame();
        application1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application1.add(ex1); // add the panel to the frame
        application1.setSize(750, 750); // set the size of the frame
        application1.setVisible(true); // make the frame visible

    }
}
