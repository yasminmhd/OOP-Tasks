//https://youtu.be/dfhmTyRTCSQ?si=6Q_0vmI92zmSelEk
package calculator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{

	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	JPanel panel;
	
	Font myFont = new Font("Tahoma",Font.BOLD,24);
	
	double num1=0,num2=0,result=0;
	char operator;
        StringBuilder calculation = new StringBuilder();
        
	Calculator(){
		
		frame = new JFrame("Nur Yasmin");
                
                ImageIcon icon = new ImageIcon(getClass().getResource("/kuromi.png"));
                frame.setIconImage(icon.getImage());
                
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 550);
		frame.setLayout(null);
                frame.getContentPane().setBackground(new Color(247, 225, 245));
		
		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
                textfield.setBackground(new Color(219, 175, 216));
                textfield.setForeground(Color.BLACK);
                textfield.setBorder(new LineBorder(Color.BLACK, 2));

		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("×");
		divButton = new JButton("÷");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Del");
		clrButton = new JButton("Clr");
		negButton = new JButton("(-)");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		
		for(int i =0;i<9;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
                        functionButtons[i].setBackground(new Color(219, 175, 216));
                        functionButtons[i].setForeground(Color.BLACK);
                        functionButtons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

		}
		
		for(int i =9;i>=0;i--) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
                        numberButtons[i].setBackground(new Color(50, 50, 50));
                        numberButtons[i].setForeground(Color.WHITE);

		}
		
                negButton.setBounds(45, 100, 95, 50);
                delButton.setBounds(150, 100, 95, 50);
                clrButton.setBounds(255, 100, 95, 50);
		
		panel = new JPanel();
		panel.setBounds(50, 170, 300, 300);
		panel.setLayout(new GridLayout(4,4,10,10));
                panel.setBackground(new Color(247, 225, 245));

		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		frame.add(panel);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textfield);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
	}
	
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                calculation.append(i);
                textfield.setText(calculation.toString());
            }
        }
    
        if (e.getSource() == decButton) {
            if (!calculation.toString().contains(".")) {
                calculation.append(".");
                textfield.setText(calculation.toString());
            }
        }

        if (e.getSource() == addButton || e.getSource() == subButton || e.getSource() == mulButton || e.getSource() == divButton) {
            if (calculation.length() > 0) {
                char lastChar = calculation.charAt(calculation.length() - 1);
                if (lastChar != ' ' && lastChar != '+' && lastChar != '-' && lastChar != '×' && lastChar != '÷') {
                    num1 = Double.parseDouble(calculation.toString().trim());
                    operator = ((JButton) e.getSource()).getText().charAt(0);
                    calculation.append(" " + operator + " ");
                    textfield.setText(calculation.toString());
                } else {
                    calculation.setCharAt(calculation.length() - 1, operator);
                    textfield.setText(calculation.toString());
                }
            }
        }

        if (e.getSource() == equButton) {
            String[] tokens = calculation.toString().trim().split(" ");
            if (tokens.length < 3) return;

            num2 = Double.parseDouble(tokens[2]);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '×':
                    result = num1 * num2;
                    break;
                case '÷':
                    result = num1 / num2;
                    break;
            }

            textfield.setText((result % 1 == 0) ? String.valueOf((int) result) : String.valueOf(result));
            calculation.setLength(0);
        }

        if (e.getSource() == clrButton) {
            textfield.setText("");
            calculation.setLength(0);
        }

        if (e.getSource() == delButton) {
            if (calculation.length() > 0) {
                calculation.setLength(calculation.length() - 1);
                textfield.setText(calculation.toString());
            }
        }

        if (e.getSource() == negButton) {
            if (calculation.length() == 0) {
                calculation.append("-");
            } else {
                String currentInput = calculation.toString().trim();
                if (currentInput.startsWith("-")) {
                calculation.deleteCharAt(0);
                } else {
                    calculation.insert(0, '-');
                }
            }
            textfield.setText(calculation.toString());
        }    
    }
}
