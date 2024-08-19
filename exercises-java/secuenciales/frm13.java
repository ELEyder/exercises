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

public class frm13 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblB , lblA;
	JTextField txtB , txtA;
	JButton btnCalcular;
	private JLabel lblC;
	private JTextField txtC;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm13 frame = new frm13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblA = new JLabel("Cateto 1:");
		lblA.setBounds(23 , 16, 86, 14);
		contentPane.add(lblA);
		
		lblB = new JLabel("Cateto 2:");
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
		btnCalcular.setBounds(90,175,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		lblC = new JLabel("Hipotenusa:");
		lblC.setBounds(23, 79, 86, 14);
		contentPane.add(lblC);
		
		txtC = new JTextField();
		txtC.setBounds(128, 76, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);

	}
	private void btnCalcular_Click() {
		int a = Integer.parseInt(txtA.getText());
		int b = Integer.parseInt(txtB.getText());
		
		double c = Math.sqrt((a*a) + (b*b));
		DecimalFormat df = new DecimalFormat("##.00");
		txtC.setText(df.format(c));
	}
}
