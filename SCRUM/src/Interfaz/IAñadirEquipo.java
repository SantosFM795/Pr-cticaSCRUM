package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Proyecto;
import Clases.Trabajador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;

public class IAñadirEquipo extends JFrame {

	private JPanel contentPane;
	private JTextField CampoNombre;

	
	/**
	 * Create the frame.
	 */
	public IAñadirEquipo(Proyecto p) {
		setTitle("Añadir Equipo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bAtras = new JButton("Atrás");
		
		bAtras.setBounds(10, 207, 89, 23);
		contentPane.add(bAtras);
		
		JLabel Nombre = new JLabel("Nombre de la persona a añadir");
		Nombre.setBounds(55, 85, 164, 14);
		contentPane.add(Nombre);
		
		JButton bGuardar = new JButton("Guardar");
		
		bGuardar.setBounds(172, 134, 89, 23);
		contentPane.add(bGuardar);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(232, 82, 180, 20);
		contentPane.add(CampoNombre);
		CampoNombre.setColumns(10);
		
		JLabel Mensaje = new JLabel("Esa persona ya está registrada en el equipo");
		Mensaje.setVisible(false);
		Mensaje.setBounds(114, 168, 266, 14);
		contentPane.add(Mensaje);
		
		JLabel Rellene = new JLabel("Rellene el campo");
		Rellene.setVisible(false);
		Rellene.setBounds(277, 113, 116, 14);
		contentPane.add(Rellene);
		
		bGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CampoNombre.getText().equalsIgnoreCase("")) {
					Rellene.setVisible(true);
				}
				else {
					boolean añadir = p.añadirTrabajador(CampoNombre.getText());
					if(añadir==true) {
						Mensaje.setText("Trabajador guardado");
					}
					else if(añadir==false){
						Mensaje.setText("Esa persona ya está registrada en el equipo");
					}
					Mensaje.setVisible(true);
				}
			}
		});
		
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
