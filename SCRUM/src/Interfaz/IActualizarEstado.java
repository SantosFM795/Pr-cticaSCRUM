package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Proyecto;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Choice;
import javax.swing.JTextField;

public class IActualizarEstado extends JFrame {

	private JPanel contentPane;
	private JTextField tHoras;


	/**
	 * Create the frame.
	 */
	public IActualizarEstado(Proyecto p) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tarea a actualizar:");
		lblNewLabel.setBounds(39, 52, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Día:");
		lblNewLabel_1.setBounds(39, 150, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Esfuerzo pendiente(en horas):");
		lblNewLabel_2.setBounds(39, 231, 150, 14);
		contentPane.add(lblNewLabel_2);
		
		Choice cTarea = new Choice();
		cTarea.setBounds(199, 46, 237, 20);
		contentPane.add(cTarea);
		
		Choice cDia = new Choice();
		cDia.setBounds(199, 150, 97, 20);
		contentPane.add(cDia);
		
		tHoras = new JTextField();
		tHoras.setBounds(199, 228, 46, 20);
		contentPane.add(tHoras);
		tHoras.setColumns(10);
		
		
	}
}
