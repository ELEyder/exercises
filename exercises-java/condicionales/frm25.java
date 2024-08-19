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

public class frm25 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	private JTextField txtTotal;
	private JTextField txtBonificacion;
	private JTextField txtHijos;
	private JTextField txtSueldo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm25 frame = new frm25();
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
	public frm25() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Sueldo:");
		lblNewLabel.setBounds(30, 30, 80, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblhijos = new JLabel("#Hijos:");
		lblhijos.setBounds(30, 70, 80, 30);
		contentPane.add(lblhijos);
		
		JLabel lblBonificacion = new JLabel("Bonificacion:");
		lblBonificacion.setBounds(30, 120, 80, 30);
		contentPane.add(lblBonificacion);
		
		JLabel lblSueldoTotal = new JLabel("Sueldo Total:");
		lblSueldoTotal.setBounds(30, 160, 80, 30);
		contentPane.add(lblSueldoTotal);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(110, 160, 80, 30);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		txtBonificacion = new JTextField();
		txtBonificacion.setColumns(10);
		txtBonificacion.setBounds(110, 120, 80, 30);
		contentPane.add(txtBonificacion);
		
		txtHijos = new JTextField();
		txtHijos.setColumns(10);
		txtHijos.setBounds(110, 70, 80, 30);
		contentPane.add(txtHijos);
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(110, 30, 80, 30);
		contentPane.add(txtSueldo);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int sueldo = Integer.parseInt(txtSueldo.getText());
				int hijos = Integer.parseInt(txtHijos.getText());

				double bonificacion = hijos==1 ? sueldo*0.1 : sueldo*0.125+(hijos-1)*40;
				double total = sueldo + bonificacion;
				
				
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtBonificacion.setText(df.format(bonificacion));
				txtTotal.setText(df.format(total));

				
				
			}
		});
		btnNewButton.setBounds(200, 30, 90, 30);
		contentPane.add(btnNewButton);

	}

}