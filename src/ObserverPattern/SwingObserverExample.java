package ObserverPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {  // Simple Swing application that just creates a frame
                                    // and throws a button in it.
    JFrame frame ;
    public static void main(String[] args) {
    SwingObserverExample example = new SwingObserverExample();
    example.go();
    }
    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener()); // Makes the angel object listener(observer) of the button.
        button.addActionListener(new DevilListener()); // Makes the devil object listener(observer) of the button.
        // using lambda expressions
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event ->
                System.out.println("Come on, do it!"));

        // Set frame properties here. (Code to set up the frame goes here.)
    }
    // Here are 2 class definitions for the observers, defined as inner classes (but they don't have to be).
    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }
    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) { // Rather than update(), actionPerformed() method gets called
                                                    // when the state in the subject (in this case button) changes.
            System.out.println("Come on, do it!");
        }
    }
}
