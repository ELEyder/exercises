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

public class frm18 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblDiv , lblCoc , lblPorMuj;
	JTextField txtNum , txtDivisor , txtCociente;
	JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm18 frame = new frm18();
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
	public frm18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Ltrim:");
		lblNum.setBounds(23 , 16, 71, 14);
		contentPane.add(lblNum);
		
		lblDiv = new JLabel("Rtrim:");
		lblDiv.setBounds(23 , 48, 60, 14);
		contentPane.add(lblDiv);
		
		lblCoc = new JLabel("Alltrim:");
		lblCoc.setBounds(23 , 85, 46, 14);
		contentPane.add(lblCoc);
		
		txtNum = new JTextField();
		txtNum.setEditable(false);
		txtNum.setBounds(128, 13, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtDivisor = new JTextField();
		txtDivisor.setEditable(false);
		txtDivisor.setBounds(128, 45, 86, 20);
		contentPane.add(txtDivisor);
		txtDivisor.setColumns(10);
		
		txtCociente = new JTextField();
		txtCociente.setEditable(false);
		txtCociente.setBounds(128, 82, 86, 20);
		contentPane.add(txtCociente);
		txtCociente.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(74,130,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		
	}
	private void btnCalcular_Click() {
		String txt1 = "Tabla Portatil";
		String txt2 = "Portatil";
		String txt3 = "nxaxaxa";
		String txt4 = "xa";
		String txt5 = "         H           ";
		
		//Ltrim
		String a = txt1.replace(txt2,"");;
		//Rtrim
		String b= txt3.replace(txt4,"");
		
		//Alltrim
		String c = txt5.trim();
		txtNum.setText(a);
		txtDivisor.setText(b);
		txtCociente.setText(c);
	}
}