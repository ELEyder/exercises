package secuenciales;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frm11 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum2 , lblNum1;
	JTextField txtNum2 , txtNum1;
	JButton btnCalcular;
	private JLabel lblNum3;
	private JTextField txtNum3;
	private JLabel lblNum4;
	private JTextField txtNum4;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum1 = new JLabel("Número 1:");
		lblNum1.setBounds(23 , 16, 86, 14);
		contentPane.add(lblNum1);
		
		lblNum2 = new JLabel("Número 2:");
		lblNum2.setBounds(23 , 48, 95, 14);
		contentPane.add(lblNum2);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(128, 45, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(87,138,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		lblNum3 = new JLabel("Número 3:");
		lblNum3.setBounds(23, 79, 86, 14);
		contentPane.add(lblNum3);
		
		txtNum3 = new JTextField();
		txtNum3.setEditable(false);
		txtNum3.setBounds(128, 76, 86, 20);
		contentPane.add(txtNum3);
		txtNum3.setColumns(10);
		
		lblNum4 = new JLabel("Número 4:");
		lblNum4.setBounds(23, 113, 71, 14);
		contentPane.add(lblNum4);
		
		txtNum4 = new JTextField();
		txtNum4.setEditable(false);
		txtNum4.setBounds(128, 107, 86, 20);
		contentPane.add(txtNum4);
		txtNum4.setColumns(10);

	}
	private void btnCalcular_Click() {
		int num1 = Integer.parseInt(txtNum1.getText());
		int num2 = Integer.parseInt(txtNum2.getText());
		String num11 = String.valueOf(num1);
		String num21 = String.valueOf(num2);
		char[] numa = num11.toCharArray();
		char[] numb = num21.toCharArray();
		
		String num3 = String.valueOf(numb[2]) + String.valueOf(numa[1]) + String.valueOf(numb[0]);
		String num4 = String.valueOf(numa[2]) + String.valueOf(numb[1]) + String.valueOf(numa[0]);
		
		txtNum3.setText(num3);
		txtNum4.setText(num4);
	}
}
