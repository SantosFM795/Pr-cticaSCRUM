package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JTable;

public class ICreacionProyecto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ICreacionProyecto frame = new ICreacionProyecto();
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
	public ICreacionProyecto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Creación de Proyecto");
		lblNewLabel.setBounds(257, 11, 103, 14);
		lblNewLabel.setFocusTraversalPolicyProvider(true);
		lblNewLabel.setName("");
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(360, 60, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(360, 107, 207, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(360, 154, 207, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(360, 199, 207, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(360, 243, 207, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Proyecto");
		lblNewLabel_1.setBounds(120, 63, 230, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número de sprints");
		lblNewLabel_1_1.setBounds(120, 110, 230, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Días de duración sprint");
		lblNewLabel_1_2.setBounds(120, 157, 230, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Número de jornadas");
		lblNewLabel_1_3.setBounds(120, 202, 230, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Número días festivos");
		lblNewLabel_1_4.setBounds(120, 246, 230, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Fecha inicio del Proyecto");
		lblNewLabel_1_4_1.setBounds(120, 297, 230, 14);
		contentPane.add(lblNewLabel_1_4_1);
	}
}
