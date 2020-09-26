package SerieConSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SerieFibonnaci extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerieFibonnaci frame = new SerieFibonnaci();
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
	public SerieFibonnaci() {
		setTitle("Serie Fibonnaci");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGenerar = new JButton("Generar Serie");
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int intVariable1, intVariable2, intIteraciones;
				intVariable1= Integer.parseInt(txtValor1.getText());
				
			}
		});
		btnGenerar.setBounds(35, 165, 155, 33);
		contentPane.add(btnGenerar);
		
		JLabel lblNewLabel = new JLabel("Valor 1:");
		lblNewLabel.setBounds(35, 50, 49, 14);
		contentPane.add(lblNewLabel);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(94, 50, 96, 20);
		contentPane.add(txtValor1);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setColumns(10);
		txtValor2.setBounds(94, 81, 96, 20);
		contentPane.add(txtValor2);
		
		JLabel lblValor = new JLabel("Valor 2:");
		lblValor.setBounds(35, 81, 49, 14);
		contentPane.add(lblValor);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setColumns(10);
		txtIteraciones.setBounds(115, 112, 96, 20);
		contentPane.add(txtIteraciones);
		
		JLabel lblIteraciones = new JLabel("Iteraciones:");
		lblIteraciones.setBounds(35, 109, 78, 14);
		contentPane.add(lblIteraciones);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Salir de la app
				System.out.print("Buen dia.");
				System.exit(0);
			}
		});
		btnSalir.setBounds(35, 209, 155, 33);
		contentPane.add(btnSalir);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
