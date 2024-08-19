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

public class frm20 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblB , lblA;
	JTextField txtB , txtA;
	JButton btnCalcular;
	private JLabel lblC;
	private JTextField txtC;
	private JTextField txtD;
	private JTextField txtE;
	private JLabel lblF;
	private JLabel lblG;
	private JLabel lblH;
	private JLabel lblI;
	private JTextField txtF;
	private JTextField txtG;
	private JTextField txtH;
	private JTextField txtI;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblA = new JLabel("Dinero:");
		lblA.setBounds(23 , 16, 125, 14);
		contentPane.add(lblA);
		
		lblB = new JLabel("Billetes de 200 soles:");
		lblB.setBounds(23 , 48, 145, 14);
		contentPane.add(lblB);
		
		txtA = new JTextField();
		txtA.setBounds(215, 13, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setEditable(false);
		txtB.setBounds(215, 45, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(120,319,95,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		lblC = new JLabel("Billetes de 100 soles:");
		lblC.setBounds(23, 79, 145, 14);
		contentPane.add(lblC);
		
		txtC = new JTextField();
		txtC.setEditable(false);
		txtC.setBounds(215, 76, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JLabel lblD = new JLabel("Billetes de 50 soles :");
		lblD.setBounds(23, 112, 159, 14);
		contentPane.add(lblD);
		
		JLabel lblE = new JLabel("Billetes de 20 soles :");
		lblE.setBounds(23, 150, 159, 14);
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
		
		lblF = new JLabel("Billetes de 10 soles :");
		lblF.setBounds(23, 191, 125, 14);
		contentPane.add(lblF);
		
		lblG = new JLabel("Monedas de 5 soles   :");
		lblG.setBounds(23, 227, 125, 14);
		contentPane.add(lblG);
		
		lblH = new JLabel("Billetes de 2 soles  :");
		lblH.setBounds(23, 252, 125, 14);
		contentPane.add(lblH);
		
		lblI = new JLabel("Billetes de 1 sol    :");
		lblI.setBounds(23, 291, 145, 14);
		contentPane.add(lblI);
		
		txtF = new JTextField();
		txtF.setEditable(false);
		txtF.setBounds(215, 188, 86, 20);
		contentPane.add(txtF);
		txtF.setColumns(10);
		
		txtG = new JTextField();
		txtG.setEditable(false);
		txtG.setBounds(215, 224, 86, 20);
		contentPane.add(txtG);
		txtG.setColumns(10);
		
		txtH = new JTextField();
		txtH.setEditable(false);
		txtH.setBounds(215, 249, 86, 20);
		contentPane.add(txtH);
		txtH.setColumns(10);
		
		txtI = new JTextField();
		txtI.setEditable(false);
		txtI.setBounds(215, 288, 86, 20);
		contentPane.add(txtI);
		txtI.setColumns(10);

	}
	private void btnCalcular_Click() {
		int dinero = Integer.parseInt(txtA.getText());
		
		double doscientos = dinero / 200;
		dinero %= 200;

		double cien = dinero / 100;
		dinero %= 100;

		double cincuenta = dinero / 50;
		dinero %= 50;

		double veinte = dinero / 20;
		dinero %= 20;

		double diez = dinero / 10;
		dinero %= 10;

		double cinco = dinero / 5;
		dinero %= 5;

		double dos = dinero / 2;
		dinero %= 2;

		double uno = dinero / 1;
		dinero %= 1;

		DecimalFormat df = new DecimalFormat("##");
		txtB.setText(df.format(doscientos));
		txtC.setText(df.format(cien));
		txtD.setText(df.format(cincuenta));
		txtE.setText(df.format(veinte));
		txtF.setText(df.format(diez));
		txtG.setText(df.format(cinco));
		txtH.setText(df.format(dos));
		txtI.setText(df.format(uno));

	}
}
