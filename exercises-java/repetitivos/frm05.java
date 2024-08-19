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
import javax.swing.JTextArea;

public class frm05 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblPorMuj;
	JTextArea txtArea;
	JTextField txtNum;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
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
	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(81,308,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		txtArea = new JTextArea();
		txtArea.setBounds(54, 57, 156, 218);
		contentPane.add(txtArea);
		
		
	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText() );
		String a = "Tabla: \n";
		for (int i = 1; i < 13 ;i++) {
			a = a+ num + " x  " + i + " = " + num*i +"\n";	
		
		}
		txtArea.setText(a);
	}
}