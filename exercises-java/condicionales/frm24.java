package condicionales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class frm24 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	private JTextField txtMonto;
	private JTextField txtSueldo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm24 frame = new frm24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frm24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Monto tatal vendido:");
		lblNewLabel.setBounds(30, 30, 118, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setBounds(30, 90, 80, 30);
		contentPane.add(lblSueldo);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(150, 30, 80, 30);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(80, 90, 80, 30);
		contentPane.add(txtSueldo);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			double sueldo;
			int bonus;
			public void actionPerformed(ActionEvent e) {
				
			int monto = Integer.parseInt(txtMonto.getText());
				
			if(monto>=5500) {
				bonus = (monto - 5000)/500;
				sueldo = monto*0.1 + bonus*25;}
			else {sueldo = 0.1*monto;} 
			DecimalFormat df = new DecimalFormat("##.00");
			txtSueldo.setText(df.format(sueldo));
				 
			}
		});
		btnNewButton.setBounds(80, 130, 80, 30);
		contentPane.add(btnNewButton);

		
		
	}

}