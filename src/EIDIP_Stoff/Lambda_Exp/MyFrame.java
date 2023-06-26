package EIDIP_Stoff.Lambda_Exp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    JButton myButton = new JButton("MY BUTTON");
    JButton myButton2 = new JButton("MY BUTTON 2");

    MyFrame() {
        
        myButton.setBounds(100, 100, 200, 100);
        myButton.addActionListener(
            
            //"Normal, non-Lambda Implementation"

            //new ActionListener() {
            //
            //@Override
            //public void actionPerformed(ActionEvent e) {
            //    System.out.println("You clicked a Button");
            //}
            //});
            
            //Lambda Implementation:
                (e) -> System.out.println("You clicked a Button")
        );

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(
             (e) -> System.out.println("You clicked the second Button")
        );

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
