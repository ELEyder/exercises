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

public class frm08 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblRadio , lblAltura , lblAreaB , lblAreaL, lblAreaT;
	JTextField txtRadio , txtAltura , txtAreaB , txtAreaL, txtAreaT;
	JButton btnCalcular;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(23 , 16, 46, 14);
		contentPane.add(lblAltura);
		
		lblRadio = new JLabel("Radio:");
		lblRadio.setBounds(23 , 48, 46, 14);
		contentPane.add(lblRadio);
		
		lblAreaB = new JLabel("Area de la base:");
		lblAreaB.setBounds(23 , 85, 86, 14);
		contentPane.add(lblAreaB);
		
		lblAreaL = new JLabel("Area Lateral:");
		lblAreaL.setBounds(23 , 123, 95, 14);
		contentPane.add(lblAreaL);
		
		lblAreaT = new JLabel("Área Total:");
		lblAreaT.setBounds(23, 159, 95, 14);
		contentPane.add(lblAreaT);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(128, 13, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtRadio = new JTextField();
		txtRadio.setBounds(128, 45, 86, 20);
		contentPane.add(txtRadio);
		txtRadio.setColumns(10);
		
		txtAreaB = new JTextField();
		txtAreaB.setEditable(false);
		txtAreaB.setBounds(128, 82, 86, 20);
		contentPane.add(txtAreaB);
		txtAreaB.setColumns(10);
		
		txtAreaL = new JTextField();
		txtAreaL.setEditable(false);
		txtAreaL.setBounds(128, 120, 86, 20);
		contentPane.add(txtAreaL);
		txtAreaL.setColumns(10);
		
		txtAreaT= new JTextField();
		txtAreaT.setEditable(false);
		txtAreaT.setBounds(128, 156, 86, 20);
		contentPane.add(txtAreaT);
		txtAreaT.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(85,199,71,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		

	}
	private void btnCalcular_Click() {
		int radio = Integer.parseInt(txtRadio.getText() );
		int altura = Integer.parseInt(txtAltura.getText() );
		double areaB = 3.14 * (radio * radio);
		double areaL = 2 * 3.14 * radio * altura;
		double areaT = areaB + areaL;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtAreaB.setText(df.format(areaB));
		txtAreaL.setText(df.format(areaL));
		txtAreaL.setText(df.format(areaT));
	}
}
