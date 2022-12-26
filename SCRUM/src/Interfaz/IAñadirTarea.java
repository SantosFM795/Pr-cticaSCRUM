package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Tarea;
import Clases.Trabajador;

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

public class IAñadirTarea extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IAñadirTarea frame = new IAñadirTarea();
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
	public IAñadirTarea() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de la tarea:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(59, 113, 144, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(253, 112, 303, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResponsableDeLa = new JLabel("Responsable de la tarea:");
		lblResponsableDeLa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResponsableDeLa.setBounds(59, 240, 171, 27);
		contentPane.add(lblResponsableDeLa);
		
		Choice choice = new Choice();
		choice.setBounds(253, 247, 144, 20);
		contentPane.add(choice);
		
		Button button = new Button("Aceptar");
		
		button.setBounds(568, 345, 70, 22);
		contentPane.add(button);
		ArrayList<Trabajador> t=new ArrayList<Trabajador>();
		for (int i = 0; i < t.size(); i++) {
			choice.add(t.get(i).getNombre());
		}
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText()=="") {
					
				}else {
					Tarea tareaAux=new Tarea(textField.getText(),0);
				}
			}
		});
	}
}
