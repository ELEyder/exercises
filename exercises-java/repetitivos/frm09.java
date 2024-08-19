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

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblAlt , lblPorMuj;
	JTextField txtNum;
	JButton btnCalcular;
	JTextArea txta;
	/**
	 * Launch the application.
	 */
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

	/** Aqui pense que se podia crear el rectangulo asignando el ancho y el alto
	 */
	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAlt = new JLabel("Altura:");
		lblAlt.setBounds(23 , 16, 71, 14);
		contentPane.add(lblAlt);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(226,7,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		txta = new JTextArea();
		txta.setBounds(23, 67, 428, 293);
		contentPane.add(txta);
		
		
		
	}
	private void btnCalcular_Click() {
		double alt = Integer.parseInt(txtNum.getText() );
		double anc = alt*2;
		
		String a = "";
		String c = "";
		String fin ="";
		for (int i =0;i < anc;i++){a += "*  ";}
		for (int x =0;x < alt-2;x++){c +=a+"\n";}
		
		fin = a+"\n"+c+a;
		txta.setText(fin);
	}
}