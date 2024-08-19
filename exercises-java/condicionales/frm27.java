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

public class frm27 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMonto;
	private JTextField txtSbruto;
	private JTextField txtDescuento;
	private JTextField txtSneto;
	private JTextField txtObsequio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm27 frame = new frm27();
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
	public frm27() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Monto vendido:");
		lblNewLabel.setBounds(30, 30, 89, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
		lblSueldoBruto.setBounds(30, 80, 80, 30);
		contentPane.add(lblSueldoBruto);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descuento:");
		lblNewLabel_1_1.setBounds(30, 120, 80, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sueldo neto:");
		lblNewLabel_1_2.setBounds(30, 160, 80, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Obsequio:");
		lblNewLabel_1_3.setBounds(30, 200, 80, 30);
		contentPane.add(lblNewLabel_1_3);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(125, 30, 80, 30);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		txtSbruto = new JTextField();
		txtSbruto.setColumns(10);
		txtSbruto.setBounds(110, 80, 80, 30);
		contentPane.add(txtSbruto);
		
		txtDescuento = new JTextField();
		txtDescuento.setColumns(10);
		txtDescuento.setBounds(110, 120, 80, 30);
		contentPane.add(txtDescuento);
		
		txtSneto = new JTextField();
		txtSneto.setColumns(10);
		txtSneto.setBounds(110, 160, 80, 30);
		contentPane.add(txtSneto);
		
		txtObsequio = new JTextField();
		txtObsequio.setColumns(10);
		txtObsequio.setBounds(110, 200, 80, 30);
		contentPane.add(txtObsequio);
		
		JButton btnNewButton = new JButton("Calcular\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int monto = Integer.parseInt(txtMonto.getText());
				double sbruto = 600 + monto*0.15;
				double descuento = sbruto>1800 ? 0.1*sbruto : sbruto*0.05;
				
				DecimalFormat df = new DecimalFormat("##.00");
				txtSbruto.setText(df.format(sbruto));
				txtDescuento.setText(df.format(descuento));
				txtSneto.setText(df.format(sbruto - descuento));
				txtObsequio.setText( monto>100 ? "3" : "1" );



			}
		});
		btnNewButton.setBounds(225, 30, 90, 30);
		contentPane.add(btnNewButton);

	}

}