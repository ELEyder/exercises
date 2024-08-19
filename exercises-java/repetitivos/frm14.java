package repetitivos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm14 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblPrim , lblPorMuj;
	JTextField txtNum, txtResiduo;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 145);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		lblPrim = new JLabel("Primo:");
		lblPrim.setBounds(23 , 46, 95, 14);
		contentPane.add(lblPrim);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtResiduo = new JTextField();
		txtResiduo.setEditable(false);
		txtResiduo.setBounds(128, 43, 86, 20);
		contentPane.add(txtResiduo);
		txtResiduo.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(74,71,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText() );
		int divisores = 0;
		String salida = "";
		for (int i = 1; i < num+1;++i) {
			if (num % i == 0) {
				divisores += 1;
			}
		}
		if (divisores == 2) {salida = "Es Primo";}
		else { salida = "No es primo";}
		txtResiduo.setText(salida);
	}
}