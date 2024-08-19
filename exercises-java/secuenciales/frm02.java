package secuenciales;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm02 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblMetro, lblCm, lblPulgada, lblPie, lblYarda;
	JTextField txtMetro, txtCm, txtPulgada, txtPie, txtYarda;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm02 frame = new frm02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.  1 metro = 100 cm, 1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm
	 */
	public frm02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMetro = new JLabel("Medida en metros:");
		lblMetro.setBounds(25, 25, 113, 14);
		contentPane.add(lblMetro);
		
		lblCm = new JLabel("Centímetros:");
		lblCm .setBounds(25, 70, 86, 14);
		contentPane.add(lblCm );
		
		lblPulgada = new JLabel("Pulgadas:");
		lblPulgada.setBounds(25, 110, 71, 14);
		contentPane.add(lblPulgada);
		
		lblPie = new JLabel("Pies:");
		lblPie.setBounds(25, 150, 46, 14);
		contentPane.add(lblPie);
		
		lblYarda = new JLabel("Yardas:");
		lblYarda.setBounds(25, 190, 46, 14);
		contentPane.add(lblYarda);
		
		txtMetro = new JTextField();
		txtMetro.setBounds(162, 22, 86, 20);
		contentPane.add(txtMetro);
		txtMetro.setColumns(10);
		
		txtCm = new JTextField();
		txtCm.setEditable(false);
		txtCm.setBounds(162, 67, 86, 20);
		contentPane.add(txtCm);
		txtCm.setColumns(10);
		
		txtPulgada = new JTextField();
		txtPulgada.setEditable(false);
		txtPulgada.setBounds(162, 107, 86, 20);
		contentPane.add(txtPulgada);
		txtPulgada.setColumns(10);
		
		txtPie = new JTextField();
		txtPie.setEditable(false);
		txtPie.setBounds(162, 147, 86, 20);
		contentPane.add(txtPie);
		txtPie.setColumns(10);
		
		txtYarda = new JTextField();
		txtYarda.setEditable(false);
		txtYarda.setBounds(162, 187, 86, 20);
		contentPane.add(txtYarda);
		txtYarda.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(177,227,94,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
	}
	private void btnCalcular_Click() {
		int metro = Integer.parseInt(txtMetro.getText() );
		double cm = 100 * metro;
		double pulgada = cm / 2.54;
		double pie = pulgada / 12;
		double yarda = pie / 3;
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCm.setText(df.format(cm));
		txtPulgada.setText(df.format(pulgada));
		txtPie.setText(df.format(pie));
		txtYarda.setText(df.format(yarda));
	}
}