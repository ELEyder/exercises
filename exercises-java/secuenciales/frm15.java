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

public class frm15 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblB , lblA;
	JTextField txtB , txtA;
	JButton btnCalcular;
	private JLabel lblC;
	private JTextField txtC;
	private JTextField txtD;
	private JTextField txtE;
	private JTextField txtF;
	private JTextField txtG;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblA = new JLabel("Juan:");
		lblA.setBounds(23 , 16, 86, 14);
		contentPane.add(lblA);
		
		lblB = new JLabel("Rosa:");
		lblB.setBounds(23 , 48, 95, 14);
		contentPane.add(lblB);
		
		txtA = new JTextField();
		txtA.setBounds(128, 13, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(128, 45, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(86,299,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		lblC = new JLabel("Daniel:");
		lblC.setBounds(23, 79, 86, 14);
		contentPane.add(lblC);
		
		txtC = new JTextField();
		txtC.setBounds(128, 76, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JLabel lblD = new JLabel("Total:");
		lblD.setBounds(23, 112, 46, 14);
		contentPane.add(lblD);
		
		JLabel lblE = new JLabel("Juan %:");
		lblE.setBounds(23, 150, 46, 14);
		contentPane.add(lblE);
		
		JLabel lblF = new JLabel("Rosa %:");
		lblF.setBounds(23, 188, 46, 14);
		contentPane.add(lblF);
		
		JLabel lblG = new JLabel("Daniel %:");
		lblG.setBounds(23, 227, 71, 14);
		contentPane.add(lblG);
		
		txtD = new JTextField();
		txtD.setEnabled(false);
		txtD.setBounds(128, 109, 86, 20);
		contentPane.add(txtD);
		txtD.setColumns(10);
		
		txtE = new JTextField();
		txtE.setEnabled(false);
		txtE.setBounds(128, 147, 86, 20);
		contentPane.add(txtE);
		txtE.setColumns(10);
		
		txtF = new JTextField();
		txtF.setEnabled(false);
		txtF.setBounds(128, 185, 86, 20);
		contentPane.add(txtF);
		txtF.setColumns(10);
		
		txtG = new JTextField();
		txtG.setEnabled(false);
		txtG.setBounds(128, 224, 86, 20);
		contentPane.add(txtG);
		txtG.setColumns(10);

	}
	private void btnCalcular_Click() {
		int a = Integer.parseInt(txtA.getText());
		int b = Integer.parseInt(txtB.getText());
		int c = Integer.parseInt(txtC.getText());
		c = c / 3;
		double total = a + b + c;
		double e = 100 * a / total;
		double f = 100 * b / total;
		double g = 100 * c / total;
		DecimalFormat df = new DecimalFormat("##.00");
		txtD.setText(df.format(total));
		txtE.setText(df.format(e));
		txtF.setText(df.format(f));
		txtG.setText(df.format(g));
	}
}
