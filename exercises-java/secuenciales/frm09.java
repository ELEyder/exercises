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

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblInv , lblNum;
	JTextField txtSuma , txtNum;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 161);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		lblInv = new JLabel("Suma de cifras:");
		lblInv.setBounds(23 , 48, 105, 14);
		contentPane.add(lblInv);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtSuma = new JTextField();
		txtSuma.setEditable(false);
		txtSuma.setBounds(128, 45, 86, 20);
		contentPane.add(txtSuma);
		txtSuma.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(87,86,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		

	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText());
		int res = 0;
		int sum = 0;
		
		while (num>0) {
			res = num % 10;
			sum = sum + res;
			num = num/10;
		}
		
		DecimalFormat df = new DecimalFormat("##");
		txtSuma.setText(df.format(sum));

	}
}
