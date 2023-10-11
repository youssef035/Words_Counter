import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        /* let's create a word counter . for that we ll need
        a frame, a label  ,a text area and a button for action
         */

        //let's start with the frame

        JFrame frame = new JFrame();

        frame.setTitle("Word Counter");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(100,100,800,800);

        //now let's add a label asking the user for inputting the text

        JLabel label = new JLabel();
        label.setText("PLEASE ENTER YOUR PARAGRAPH");
        label.setBounds(300,-40,210,200);

        //now let's add the text area
        JTextArea text = new JTextArea();

        text.setBounds(100,100,600,600);

        //let's add a button for counting
        JButton b = new JButton("Count");
        b.setBounds(350,710,100,50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String content = text.getText();
                String[] words = content.split("\\s+");

                int count = words.length;


                JOptionPane.showMessageDialog(null,count,"Word count",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        //let's add all the components to the frame
        frame.add(label);
        frame.add(text);
        frame.add(b);



    }
}