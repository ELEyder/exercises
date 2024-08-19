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

public class frm18 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblB , lblA;
	JTextField txtB , txtA;
	JButton btnCalcular;
	private JLabel lblC;
	private JTextField txtC;
	private JTextField txtD;
	private JTextField txtE;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblA = new JLabel("Cantidad a comprar:");
		lblA.setBounds(23 , 16, 156, 14);
		contentPane.add(lblA);
		
		lblB = new JLabel("Precio:");
		lblB.setBounds(23 , 48, 115, 14);
		contentPane.add(lblB);
		
		txtA = new JTextField();
		txtA.setBounds(215, 13, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(215, 45, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(110,201,95,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		lblC = new JLabel("Importe de Compra:");
		lblC.setBounds(23, 79, 115, 14);
		contentPane.add(lblC);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setBounds(215, 76, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JLabel lblD = new JLabel("Descuento:");
		lblD.setBounds(23, 112, 101, 14);
		contentPane.add(lblD);
		
		JLabel lblE = new JLabel("Importe a Pagar:");
		lblE.setBounds(23, 150, 115, 14);
		contentPane.add(lblE);
		
		txtD = new JTextField();
		txtD.setEditable(false);
		txtD.setBounds(215, 109, 86, 20);
		contentPane.add(txtD);
		txtD.setColumns(10);
		
		txtE = new JTextField();
		txtE.setEditable(false);
		txtE.setBounds(215, 147, 86, 20);
		contentPane.add(txtE);
		txtE.setColumns(10);

	}
	private void btnCalcular_Click() {
		int a = Integer.parseInt(txtA.getText());
		int b = Integer.parseInt(txtB.getText());
		
		double c = a * b;
		double d = (c * 0.85) * 0.85;
		double e = c - d;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtC.setText(df.format(c));
		txtD.setText(df.format(e));
		txtE.setText(df.format(d));

	}
}
