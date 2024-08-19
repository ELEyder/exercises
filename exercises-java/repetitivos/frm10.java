package repetitivos;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class frm10 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel contentPane;
	JLabel lblNum , lblPorMuj;
	JTextField txtNum;
	JButton btnCalcular;
	JTextArea txtA;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
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
	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNum = new JLabel("Se encontraron:");
		lblNum.setBounds(32 , 411, 86, 14);
		contentPane.add(lblNum);
		
		txtNum = new JTextField();
		txtNum.setEditable(false);
		txtNum.setBounds(128, 408, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {btnCalcular_Click();}});
		btnCalcular.setBounds(291,411,86,23);
		btnCalcular.setMnemonic('a');
		contentPane.add(btnCalcular);
		
		txtA = new JTextArea();
		txtA.setEditable(false);
		txtA.setBounds(32, 11, 640, 389);
		contentPane.add(txtA);
		
		
		
	}
	private void btnCalcular_Click() {
		int par=0;
		int impar=0;
		int count = 0;
		String salida ="";
		
		for (int i=1000;i < 10000;i++) {
		    String l = i + "" ;
		    for (int x=0;x <4;x++) {
		        char a2 = l.charAt(x);
		        
		        int a = Character.getNumericValue(a2);
		        
		        if (a % 2 == 0) {
		            par += a;
		    	}
		        else {
		            impar += a;
		        }
		        
		    }
		    if (par == impar) {
		        salida = salida+l+" ";
		        //System.out.print(salida+"\n");
		        count += 1;
		        if (count % 20 == 0) {salida +="\n";}
		    }
		    par = 0;
		    impar = 0;
		}
		DecimalFormat df = new DecimalFormat("##");
		txtA.setText(salida);
		txtNum.setText(df.format(count));
	}
}
		