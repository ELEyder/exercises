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

public class frm26 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPagar;
	private JTextField txtPrestamo;
	private JTextField txtMonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm26 frame = new frm26();
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
	public frm26() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monto total:");
		lblNewLabel.setBounds(30, 30, 80, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblDieneroAPagar = new JLabel("Dienero a pagar:");
		lblDieneroAPagar.setBounds(30, 80, 96, 30);
		contentPane.add(lblDieneroAPagar);
		
		JLabel lblPrestamo = new JLabel("Prestamo:");
		lblPrestamo.setBounds(30, 120, 80, 30);
		contentPane.add(lblPrestamo);
		
		txtPagar = new JTextField();
		txtPagar.setBounds(130, 80, 80, 30);
		contentPane.add(txtPagar);
		txtPagar.setColumns(10);
		
		txtPrestamo = new JTextField();
		txtPrestamo.setColumns(10);
		txtPrestamo.setBounds(120, 121, 80, 30);
		contentPane.add(txtPrestamo);
		
		txtMonto = new JTextField();
		txtMonto.setColumns(10);
		txtMonto.setBounds(110, 30, 80, 30);
		contentPane.add(txtMonto);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				int monto = Integer.parseInt(txtMonto.getText());
				double prestamo = monto>5000 ? 0.3*monto*1.1 : 0.2*monto*1.1;
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtPrestamo.setText(df.format(prestamo));
				txtPagar.setText(df.format(monto - prestamo));
				
				
				
				
			}
		});
		btnNewButton.setBounds(215, 30, 90, 30);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	}

}