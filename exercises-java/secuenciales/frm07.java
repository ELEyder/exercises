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

public class frm07 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblBase , lblAltura , lblArea , lblPerimetro;
	JTextField txtBase , txtAltura , txtArea , txtPerimetro;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(23 , 16, 46, 14);
		contentPane.add(lblAltura);
		
		lblBase = new JLabel("Base");
		lblBase.setBounds(23 , 48, 46, 14);
		contentPane.add(lblBase);
		
		lblArea = new JLabel("Area");
		lblArea.setBounds(23 , 85, 46, 14);
		contentPane.add(lblArea);
		
		lblPerimetro = new JLabel("Perimetro");
		lblPerimetro.setBounds(23 , 123, 58, 14);
		contentPane.add(lblPerimetro);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(128, 13, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtBase = new JTextField();
		txtBase.setBounds(128, 45, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setBounds(128, 82, 86, 20);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setEditable(false);
		txtPerimetro.setBounds(128, 120, 86, 20);
		contentPane.add(txtPerimetro);
		txtPerimetro.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(178,199,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		
		

	}
	private void btnCalcular_Click() {
		int base = Integer.parseInt(txtBase.getText() );
		int altura = Integer.parseInt(txtAltura.getText() );
		double area = base * altura;
		double perimetro = base * 2 + altura * 2;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtArea.setText(df.format(area));
		txtPerimetro.setText(df.format(perimetro));
		
	}
}
