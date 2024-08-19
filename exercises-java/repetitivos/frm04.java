package repetitivos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm04 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblCan , lblPorMuj;
	JTextField txtNum, txtCantidad;
	JButton btnCalcular;
	private JTextField txtLista;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
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
	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Número:");
		lblNum.setBounds(23 , 33, 71, 14);
		contentPane.add(lblNum);
		
		lblCan = new JLabel("Cantidad:");
		lblCan.setBounds(23 , 77, 95, 14);
		contentPane.add(lblCan);
		
		txtNum = new JTextField();
		txtNum.setBounds(128, 30, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(128, 74, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(69,163,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		JLabel lblLista = new JLabel("Lista:");
		lblLista.setBounds(26, 116, 46, 14);
		contentPane.add(lblLista);
		
		txtLista = new JTextField();
		txtLista.setBounds(128, 113, 147, 20);
		contentPane.add(txtLista);
		txtLista.setColumns(10);
		
		
		
	}
	private void btnCalcular_Click() {
		int num = Integer.parseInt(txtNum.getText() );
		int mul = Integer.parseInt(txtCantidad.getText());
		int[] lista = new int[mul];
		for (int i = 0; i < mul;i++) {
			int a = num*i;
			lista[i] = a;
			
		}
		txtLista.setText(Arrays.toString(lista));
	}
}