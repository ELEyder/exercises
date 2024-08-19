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
import java.text.DecimalFormat;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblInv , lblNum;
	JTextField txtInv , txtNum;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 16, 86, 14);
		contentPane.add(lblNum);
		
		lblInv = new JLabel("Invertido:");
		lblInv.setBounds(23 , 48, 95, 14);
		contentPane.add(lblInv);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtInv = new JTextField();
		txtInv.setEditable(false);
		txtInv.setBounds(128, 45, 86, 20);
		contentPane.add(txtInv);
		txtInv.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(87,86,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		

	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText());
		int reverse = Integer.parseInt((new StringBuilder(num+"")).reverse().toString());
		
		DecimalFormat df = new DecimalFormat("##");
		txtInv.setText(df.format(reverse));

	}
}
