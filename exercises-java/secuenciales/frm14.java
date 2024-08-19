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
import java.util.Arrays;

public class frm14 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblN2 , lblN1;
	JTextField txtN2 , txtN1;
	JButton btnCalcular;
	private JLabel lblC;
	private JTextField txtN3;
	private JTextField txtN4;
	private JTextField txtN5;
	private JTextField txtMa;
	private JLabel lblNewLabel_3;
	private JTextField txtMe;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblN1 = new JLabel("Número 1:");
		lblN1.setBounds(23 , 16, 86, 14);
		contentPane.add(lblN1);
		
		lblN2 = new JLabel("Número 2:");
		lblN2.setBounds(23 , 48, 95, 14);
		contentPane.add(lblN2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(128, 13, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(128, 45, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(92,254,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		lblC = new JLabel("Números Mayores:");
		lblC.setBounds(23, 181, 95, 14);
		contentPane.add(lblC);
		
		txtN3 = new JTextField();
		txtN3.setBounds(128, 76, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);
		
		JLabel lblN3 = new JLabel("Número 3:");
		lblN3.setBounds(23, 79, 86, 14);
		contentPane.add(lblN3);
		
		JLabel lblN4 = new JLabel("Número 4:");
		lblN4.setBounds(23, 114, 86, 14);
		contentPane.add(lblN4);
		
		JLabel lblN5 = new JLabel("Número 5:");
		lblN5.setBounds(23, 150, 86, 14);
		contentPane.add(lblN5);
		
		txtN4 = new JTextField();
		txtN4.setBounds(128, 111, 86, 20);
		contentPane.add(txtN4);
		txtN4.setColumns(10);
		
		txtN5 = new JTextField();
		txtN5.setBounds(128, 147, 86, 20);
		contentPane.add(txtN5);
		txtN5.setColumns(10);
		
		txtMa = new JTextField();
		txtMa.setEditable(false);
		txtMa.setBounds(128, 178, 86, 20);
		contentPane.add(txtMa);
		txtMa.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Números Menores:");
		lblNewLabel_3.setBounds(23, 212, 95, 14);
		contentPane.add(lblNewLabel_3);
		
		txtMe = new JTextField();
		txtMe.setEnabled(true);
		txtMe.setEditable(false);
		txtMe.setText("");
		txtMe.setBounds(128, 209, 86, 20);
		contentPane.add(txtMe);
		txtMe.setColumns(10);

	}
	private void btnCalcular_Click() {
		int a = Integer.parseInt(txtN1.getText());
		int b = Integer.parseInt(txtN2.getText());
		int c = Integer.parseInt(txtN3.getText());
		int d = Integer.parseInt(txtN4.getText());
		int e = Integer.parseInt(txtN5.getText());
		
		int[] lista = {a,b,c,d,e};
		
		int[] arr = Arrays.stream(lista).sorted().toArray();
		String ma = +arr[4]+", "+arr[3]+", "+arr[2];
		String me = +arr[0]+", "+arr[1]+", "+arr[2];
		txtMa.setText(ma);
		txtMe.setText(me);
	}
}
