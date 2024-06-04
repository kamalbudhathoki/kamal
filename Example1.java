import java.awt.event.*;
import javax.swing.*;

public class Example1 extends JFrame implements ActionListener  {
    JTextField first,second,ans;
    JButton plus, minus;
    public Example1() {
        setSize(400,400);
        first = new JTextField();
        second = new JTextField();
        ans = new JTextField();
        first.setBounds(50,100,100,70);
        second.setBounds(200,100,100,70);
        ans.setBounds(300,100,100,70);


        add(first);
        add(second);
        add(ans);
        ans.setEditable(false);


        add(plus);
        add(minus);




        plus = new JButton("+");
        minus = new JButton("-");

        plus.setBounds(100,250,70,70);
        minus.setBounds(250,250,70,70);
        plus.addActionListener(this);
        minus.addActionListener(this);
        setLayout(null);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(first.getText());
        int b=Integer.parseInt(second.getText());
        int c=Integer.parseInt(ans.getText());
        int result;
        if(e.getSource()==plus)
        {
            result=a+b;
        }
        else
        {
            result=a-b;
        }
        ans.setText(" " +(result));
    }
    public static void main(String[] args) {
        new Example1();
    }
}
