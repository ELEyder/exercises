package condicionales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm28 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoras;
	private JTextField txtMinutos;
	private JTextField txtNuevo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm28 frame = new frm28();
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
	public frm28() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Horas:");
		lblNewLabel.setBounds(30, 30, 80, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblMinutos = new JLabel("Minutos:");
		lblMinutos.setBounds(30, 70, 80, 30);
		contentPane.add(lblMinutos);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(85, 30, 80, 30);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		txtMinutos = new JTextField();
		txtMinutos.setColumns(10);
		txtMinutos.setBounds(85, 70, 80, 30);
		contentPane.add(txtMinutos);
		
		txtNuevo = new JTextField();
		txtNuevo.setColumns(10);
		txtNuevo.setBounds(85, 120, 80, 30);
		contentPane.add(txtNuevo);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int horas = Integer.parseInt(txtHoras.getText());
				int minutos = Integer.parseInt(txtMinutos.getText());

				if (12<horas && horas<=24 && 0<=minutos && minutos<60)
				    horas-=12;
				    txtNuevo.setText( horas + ":" + minutos+"pm");
				if  (0<horas && horas<=12 && 0<=minutos && minutos<60)
				    txtNuevo.setText( horas + ":" + minutos);
				else  txtNuevo.setText("error");
				
			}
		});
		btnNewButton.setBounds(180, 30, 85, 30);
		contentPane.add(btnNewButton);

	}

}