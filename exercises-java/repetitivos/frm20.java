package repetitivos;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class frm20 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblN1 , lblMenor , lblMayor , lblProm , lblPorMuj;
	JTextField txtNum1 , txtMayor, txtPromedio;
	JButton btnCalcular;
	private JTextField txtMenor;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;
	private JTextField txtNum6;
	private JTextField txtNum7;
	private JTextField txtNum8;
	private JTextField txtNum9;
	private JTextField txtNum10;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
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
	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblN1 = new JLabel("Numero 1:");
		lblN1.setBounds(23 , 16, 86, 14);
		contentPane.add(lblN1);
		
		lblMenor = new JLabel("Numero Menor:");
		lblMenor.setBounds(23 , 304, 95, 14);
		contentPane.add(lblMenor);
		
		lblMayor = new JLabel("Numero Mayor:");
		lblMayor.setBounds(23 , 341, 95, 14);
		contentPane.add(lblMayor);
		
		lblProm = new JLabel("Promedio:");
		lblProm.setBounds(23 , 379, 95, 14);
		contentPane.add(lblProm);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(158, 13, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtMayor = new JTextField();
		txtMayor.setEditable(false);
		txtMayor.setBounds(158, 338, 86, 20);
		contentPane.add(txtMayor);
		txtMayor.setColumns(10);
		
		txtPromedio = new JTextField();
		txtPromedio.setEditable(false);
		txtPromedio.setBounds(158, 376, 86, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(94,407,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		txtMenor = new JTextField();
		txtMenor.setEditable(false);
		txtMenor.setColumns(10);
		txtMenor.setBounds(158, 301, 86, 20);
		contentPane.add(txtMenor);
		
		JLabel lblN2 = new JLabel("Numero 2:");
		lblN2.setBounds(23, 45, 86, 14);
		contentPane.add(lblN2);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(158, 42, 86, 20);
		contentPane.add(txtNum2);
		
		JLabel lblN3 = new JLabel("Numero 3:");
		lblN3.setBounds(23, 73, 86, 14);
		contentPane.add(lblN3);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(10);
		txtNum3.setBounds(158, 70, 86, 20);
		contentPane.add(txtNum3);
		
		JLabel lblN4 = new JLabel("Numero 4:");
		lblN4.setBounds(23, 101, 86, 14);
		contentPane.add(lblN4);
		
		txtNum4 = new JTextField();
		txtNum4.setColumns(10);
		txtNum4.setBounds(158, 98, 86, 20);
		contentPane.add(txtNum4);
		
		JLabel lblN5 = new JLabel("Numero 5:");
		lblN5.setBounds(23, 129, 86, 14);
		contentPane.add(lblN5);
		
		txtNum5 = new JTextField();
		txtNum5.setColumns(10);
		txtNum5.setBounds(158, 126, 86, 20);
		contentPane.add(txtNum5);
		
		JLabel lblN6 = new JLabel("Numero 6:");
		lblN6.setBounds(23, 157, 86, 14);
		contentPane.add(lblN6);
		
		txtNum6 = new JTextField();
		txtNum6.setColumns(10);
		txtNum6.setBounds(158, 154, 86, 20);
		contentPane.add(txtNum6);
		
		JLabel lblN7 = new JLabel("Numero 7:");
		lblN7.setBounds(23, 185, 86, 14);
		contentPane.add(lblN7);
		
		txtNum7 = new JTextField();
		txtNum7.setColumns(10);
		txtNum7.setBounds(158, 182, 86, 20);
		contentPane.add(txtNum7);
		
		JLabel lblN8 = new JLabel("Numero 8:");
		lblN8.setBounds(23, 213, 86, 14);
		contentPane.add(lblN8);
		
		txtNum8 = new JTextField();
		txtNum8.setColumns(10);
		txtNum8.setBounds(158, 210, 86, 20);
		contentPane.add(txtNum8);
		
		JLabel lblN9 = new JLabel("Numero 9:");
		lblN9.setBounds(23, 241, 86, 14);
		contentPane.add(lblN9);
		
		txtNum9 = new JTextField();
		txtNum9.setColumns(10);
		txtNum9.setBounds(158, 238, 86, 20);
		contentPane.add(txtNum9);
		
		JLabel lblN10 = new JLabel("Numero 10:");
		lblN10.setBounds(23, 273, 86, 14);
		contentPane.add(lblN10);
		
		txtNum10 = new JTextField();
		txtNum10.setColumns(10);
		txtNum10.setBounds(158, 270, 86, 20);
		contentPane.add(txtNum10);
		
		
		
	}
	private void btnCalcular_Click() {
		int num1 = Integer.parseInt(txtNum1.getText());
		int num2 = Integer.parseInt(txtNum2.getText());
		int num3 = Integer.parseInt(txtNum3.getText());
		int num4 = Integer.parseInt(txtNum4.getText());
		int num5 = Integer.parseInt(txtNum5.getText());
		int num6 = Integer.parseInt(txtNum6.getText());
		int num7 = Integer.parseInt(txtNum7.getText());
		int num8 = Integer.parseInt(txtNum8.getText());
		int num9 = Integer.parseInt(txtNum9.getText());
		int num10 = Integer.parseInt(txtNum10.getText());
		int promedio = 0;
		List<Integer> list = Arrays.asList(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10);
		Collections.sort(list);
		System.out.print(list);
		
		for(int i = 0;i<10;i++) {
			promedio+=list.get(i);
		}
		promedio = promedio /10;
		DecimalFormat df = new DecimalFormat("##");
		txtMayor.setText(df.format(list.get(9)));
		txtMenor.setText(df.format(list.get(0)));
		txtPromedio.setText(df.format(promedio));
	}
}