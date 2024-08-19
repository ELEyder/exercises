package repetitivos;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class frm12 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblPorMuj;
	JButton btnCalcular;
	JTextArea txtA;
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(131,277,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		txtA = new JTextArea();
		txtA.setEditable(false);
		txtA.setBounds(23, 22, 330, 218);
		contentPane.add(txtA);
		
	}
	
	private void btnCalcular_Click() {
		String salida = "  ";
		for (int i = 1; i < 101;i++){
			salida = salida+""+i+" ";
			if (i > 0 && i < 10) {
				salida+="  ";
			}
			if (i % 10 == 0 && i > 9) {
				salida+="\n";
			}

		}
		txtA.setText(salida);
	}
}