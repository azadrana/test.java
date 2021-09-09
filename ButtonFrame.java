//action listener programme using swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 class ButtonFrame extends JFrame implements ActionListener
{
    static JButton b;
	 ButtonFrame()
	{
		this.setTitle("my first frame");
		this.setSize(600,500);
		this.setLayout(null);
		b=new JButton("click me");
		b.setBounds(200,200,200,60);
		//b.setFont(new Font("candara",Font.Bold,25));
		b.addActionListener(this);
		this.add(b);
	   this.setVisible(true);
	}
	public void actionperformed(ActionEvent ae)
	{
	    System.out.println("buttton clicked");
	}
	public static void main(String[] args )
	{
	   new ButtonFrame();
	}
}