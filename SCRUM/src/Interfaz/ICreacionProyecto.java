package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Proyecto;

import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ICreacionProyecto extends JFrame {

	private JPanel contentPane;
	private JTextField CampoNombre;
	private JTextField CampoSprint;
	private JTextField CampoDias;
		
	/**
	 * Create the frame.
	 */
	public ICreacionProyecto(Proyecto p) {
		setVisible(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo = new JLabel("Creación de Proyecto");
		Titulo.setBounds(257, 11, 103, 14);
		Titulo.setFocusTraversalPolicyProvider(true);
		Titulo.setName("");
		contentPane.add(Titulo);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(360, 60, 207, 20);
		contentPane.add(CampoNombre);
		CampoNombre.setColumns(10);
		
		CampoSprint = new JTextField();
		CampoSprint.setColumns(10);
		CampoSprint.setBounds(360, 107, 207, 20);
		contentPane.add(CampoSprint);
		
		CampoDias = new JTextField();
		CampoDias.setColumns(10);
		CampoDias.setBounds(360, 154, 207, 20);
		contentPane.add(CampoDias);
		
		JLabel Nombre = new JLabel("Nombre Proyecto");
		Nombre.setBounds(120, 63, 230, 14);
		contentPane.add(Nombre);
		
		JLabel Sprint = new JLabel("Número de sprints");
		Sprint.setBounds(120, 110, 230, 14);
		contentPane.add(Sprint);
		
		JLabel Dias = new JLabel("Días de duración sprint");
		Dias.setBounds(120, 157, 230, 14);
		contentPane.add(Dias);
		
		JButton CrearProyecto = new JButton("Crear proyecto");

		CrearProyecto.setBounds(245, 214, 125, 23);
		contentPane.add(CrearProyecto);
		
		JLabel MensajeError = new JLabel("Todos los campos deben rellenarse");
		MensajeError.setVisible(false);
		MensajeError.setBounds(226, 248, 274, 14);
		
		contentPane.add(MensajeError);
		CrearProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CampoSprint.getText().equalsIgnoreCase("") | CampoDias.getText().equalsIgnoreCase("") | CampoNombre.getText().equalsIgnoreCase("")) {
					MensajeError.setVisible(true);
				}
				else {
					p.setNombre(CampoNombre.getText());
					p.setDuracion(Integer.parseInt(CampoDias.getText()));
					p.setSprint(Integer.parseInt(CampoSprint.getText()));
					dispose();
				}
			}
		});
	}
}
