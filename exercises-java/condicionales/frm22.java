package condicionales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm22 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtImporte;
	private JTextField txtDescuento;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm22 frame = new frm22();
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
	public frm22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Producto A:");
		lblNewLabel.setBounds(30, 30, 80, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblProductoB = new JLabel("Producto B:");
		lblProductoB.setBounds(30, 70, 80, 30);
		contentPane.add(lblProductoB);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(30, 200, 80, 30);
		contentPane.add(lblTotal);
		
		JLabel lblDescuento = new JLabel("Descuento:");
		lblDescuento.setBounds(30, 160, 80, 30);
		contentPane.add(lblDescuento);
		
		JLabel lblImporte = new JLabel("Importe:");
		lblImporte.setBounds(30, 120, 80, 30);
		contentPane.add(lblImporte);
		
		txtA = new JTextField();
		txtA.setBounds(100, 30, 80, 30);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(100, 70, 80, 30);
		contentPane.add(txtB);
		
		txtImporte = new JTextField();
		txtImporte.setColumns(10);
		txtImporte.setBounds(100, 120, 80, 30);
		contentPane.add(txtImporte);
		
		txtDescuento = new JTextField();
		txtDescuento.setColumns(10);
		txtDescuento.setBounds(100, 160, 80, 30);
		contentPane.add(txtDescuento);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(100, 200, 80, 30);
		contentPane.add(txtTotal);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				double da =  a>50 ? 0.15*a*25 : 0 ;
				double db =  b>60 ? 0.1*b*30 : 0;
				
				
				
				
				
				txtImporte.setText(""+(a*25+b*30));
				txtDescuento.setText(da+db+"");
				txtTotal.setText( (a*25-da) + (b*30-db) + "");


				
				
			}
		});
		btnNewButton.setBounds(190, 30, 85, 30);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	}

}