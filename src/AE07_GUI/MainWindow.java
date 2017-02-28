package AE07_GUI;

import javax.swing.*;

/**
 * Created by alexandra.cryns on 27.02.17.
 */
public class MainWindow extends JFrame {

    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JPanel tab2;
    private JPanel tab1;
    private JPanel tab3;
    private JPanel tab4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainWindow");
        frame.setContentPane(new MainWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainWindow() {

    }

}
