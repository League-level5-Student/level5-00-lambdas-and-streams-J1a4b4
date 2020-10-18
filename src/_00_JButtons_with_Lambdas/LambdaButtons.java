package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 NUMBERS");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	Random rand;
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		rand = new Random();

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener((e) -> {
			int i1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number."));
			int i2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number."));
			JOptionPane.showMessageDialog(null, i1+i2);
			});
		randNumber.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, rand.nextInt());
		});
		tellAJoke.addActionListener((e) -> {
			String joke = "";
			int i = rand.nextInt(3);
			if (i == 0) {
				joke = "Need joke: add in Post";
			}else if (i == 1) {
				joke = "People of varied ethnicities walk into a bar.";
			}else {
				joke = "You thought it was a joke, but it was me, Clichéd Reference!";
			}
			JOptionPane.showMessageDialog(null, joke);
		});
		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}
}
