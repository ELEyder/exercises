package condicionales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class frm30 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoras;
	private JTextField txtPago;
	private JTextField txtSbruto;
	private JTextField txtDescuento;
	private JTextField txtSneto;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm30 frame = new frm30();
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
	public frm30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Horas trabajadas:");
		lblNewLabel.setBounds(30, 30, 119, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblPago = new JLabel("Pago x hora:");
		lblPago.setBounds(30, 70, 119, 30);
		contentPane.add(lblPago);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sueldo bruto:");
		lblNewLabel_1_1.setBounds(30, 120, 80, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Descuento:");
		lblNewLabel_1_2.setBounds(30, 160, 80, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sueldo neto:");
		lblNewLabel_1_3.setBounds(30, 200, 80, 30);
		contentPane.add(lblNewLabel_1_3);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(140, 30, 80, 30);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		txtPago = new JTextField();
		txtPago.setColumns(10);
		txtPago.setBounds(130, 70, 80, 30);
		contentPane.add(txtPago);
		
		txtSbruto = new JTextField();
		txtSbruto.setColumns(10);
		txtSbruto.setBounds(110, 120, 80, 30);
		contentPane.add(txtSbruto);
		
		txtDescuento = new JTextField();
		txtDescuento.setColumns(10);
		txtDescuento.setBounds(110, 160, 80, 30);
		contentPane.add(txtDescuento);
		
		txtSneto = new JTextField();
		txtSneto.setColumns(10);
		txtSneto.setBounds(110, 200, 80, 30);
		contentPane.add(txtSneto);
		
		btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pago = Integer.parseInt(txtPago.getText());
				int horas = Integer.parseInt(txtHoras.getText());
				int sbruto = pago*horas;
				double descuento = sbruto>1500 ? 0.11*sbruto : 0;
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtSbruto.setText(df.format(sbruto));
				txtDescuento.setText(df.format(descuento));
				txtSneto.setText(df.format(sbruto - descuento));

			}
		});
		btnNewButton.setBounds(240, 30, 90, 30);
		contentPane.add(btnNewButton);
	}

}