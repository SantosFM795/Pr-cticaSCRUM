package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class IAñadirEquipo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IAñadirEquipo frame = new IAñadirEquipo();
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
	public IAñadirEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 277, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nombre de la persona a añadir");
		lblNewLabel.setBounds(100, 70, 164, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPersonasYaAadidas = new JLabel("Personas ya añadidas");
		lblPersonasYaAadidas.setBounds(100, 158, 121, 14);
		contentPane.add(lblPersonasYaAadidas);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(330, 66, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(429, 223, -185, -86);
		contentPane.add(list);
	}
}
