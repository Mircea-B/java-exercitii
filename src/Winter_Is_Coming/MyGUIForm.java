package Winter_Is_Coming;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUIForm extends JFrame {
    private JButton mybutton1;
    private JTextArea text1;
    private JPanel rootPanel;

    public MyGUIForm() {
        //Asta apeleaza forma cu numele rootPanel
        add(rootPanel);
        setTitle("Titlul interfetei");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mybutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane,"cica mesaje ce apar cand apesi pe buton");
            }
        });
    }
}
