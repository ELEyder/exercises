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

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblB , lblA;
	JTextField txtB , txtA;
	JButton btnCalcular;
	private JLabel lblC;
	private JTextField txtC;
	private JLabel lblNum1;
	private JTextField txtNum1;
	private JLabel lblNewLabel;
	private JTextField txtNum2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblA = new JLabel("A:");
		lblA.setBounds(23 , 16, 86, 14);
		contentPane.add(lblA);
		
		lblB = new JLabel("B:");
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
		
		lblC = new JLabel("C:");
		lblC.setBounds(23, 79, 86, 14);
		contentPane.add(lblC);
		
		txtC = new JTextField();
		txtC.setBounds(128, 76, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		lblNum1 = new JLabel("Solución 1:");
		lblNum1.setBounds(23, 113, 71, 14);
		contentPane.add(lblNum1);
		
		txtNum1 = new JTextField();
		txtNum1.setEditable(false);
		txtNum1.setBounds(128, 107, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		lblNewLabel = new JLabel("Solución 2:");
		lblNewLabel.setBounds(23, 145, 86, 14);
		contentPane.add(lblNewLabel);
		
		txtNum2 = new JTextField();
		txtNum2.setEditable(false);
		txtNum2.setBounds(128, 144, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);

	}
	private void btnCalcular_Click() {
		int a = Integer.parseInt(txtA.getText());
		int b = Integer.parseInt(txtB.getText());
		int c = Integer.parseInt(txtC.getText());
		
		double x = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
		double y = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtNum1.setText(df.format(x));
		txtNum2.setText(df.format(y));
	}
}
