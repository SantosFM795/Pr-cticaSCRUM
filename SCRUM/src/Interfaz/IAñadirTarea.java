package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Proyecto;
import Clases.Tarea;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JMenuItem;
import java.awt.Choice;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class IAñadirTarea extends JFrame {

	private JPanel contentPane;
	private JTextField tNombre;
	private JTextField tHoras;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public IAñadirTarea(Proyecto p) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de la tarea:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(59, 113, 144, 14);
		contentPane.add(lblNewLabel);
		
		tNombre = new JTextField();
		tNombre.setBounds(280, 113, 303, 27);
		contentPane.add(tNombre);
		tNombre.setColumns(10);
		
		JLabel lblResponsableDeLa = new JLabel("Responsable de la tarea:");
		lblResponsableDeLa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResponsableDeLa.setBounds(59, 290, 171, 27);
		contentPane.add(lblResponsableDeLa);
		
		Choice choice = new Choice();
		choice.setBounds(280, 297, 144, 20);
		contentPane.add(choice);
		
		Button button = new Button("Aceptar");
		
		button.setBounds(568, 345, 70, 22);
		contentPane.add(button);
		
		JLabel lblEsfuerzoInicial = new JLabel("Esfuerzo Inicial (en horas):");
		lblEsfuerzoInicial.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEsfuerzoInicial.setBounds(59, 202, 196, 27);
		contentPane.add(lblEsfuerzoInicial);
		
		tHoras = new JTextField();
		tHoras.setColumns(10);
		tHoras.setBounds(280, 204, 37, 27);
		contentPane.add(tHoras);
		
		JLabel lerror = new JLabel("*Rellene todos los campos");
		lerror.setForeground(Color.RED);
		lerror.setBounds(59, 353, 258, 14);
		contentPane.add(lerror);
		lerror.setVisible(false);
		ArrayList<String> t=new ArrayList<String>();
		t=p.getTrabajadores();
		for (int i = 0; i < t.size(); i++) {
			choice.add(t.get(i));
		}
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tNombre.getText().equalsIgnoreCase("") || tHoras.getText().equalsIgnoreCase("")) {
					lerror.setVisible(true);
				}else {
					Tarea tareaAux=new Tarea(tNombre.getText(),Integer.parseInt(tHoras.getText()),choice.getSelectedItem());
					p.añadirTarea(tareaAux);
					setVisible(false);
					dispose();
				}
			}
		});
	}
}
