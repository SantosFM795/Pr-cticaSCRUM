package Interfaz;

import java.awt.EventQueue;
import java.util.ArrayList;

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
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class IActualizarEstado extends JFrame {

	private JPanel contentPane;
	private JTextField tHoras;
	private int posicionTarea;
	private int posicionDia;


	/**
	 * Create the frame.
	 */
	public IActualizarEstado(Proyecto p) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JLabel lError = new JLabel("*Este campo no puede estar vacío");
		lError.setForeground(Color.RED);
		lError.setBounds(199, 259, 189, 14);
		contentPane.add(lError);
		
		JButton bAplicar = new JButton("Aplicar");
		
		bAplicar.setBounds(455, 306, 89, 23);
		contentPane.add(bAplicar);
		lError.setVisible(false);
		
		for (int i = 0; i < p.getTareas().size(); i++) {
			cTarea.add(p.getTareas().get(i).getNombre());
		}
		
		
		posicionTarea=cTarea.getSelectedIndex();

		
		cTarea.getItemCount();
		if(p.getTareas().get(posicionTarea).getEsfuerzo().size()==p.getDuracion()*p.getSprint()) {
			cDia.add("Terminada");
		}else {
			for (int i = p.getTareas().get(posicionTarea).getEsfuerzo().size()+1; i <= p.getDuracion()*p.getSprint()  ; i++) {
				cDia.add(""+i);
			}
		}
			
		
		if(!cDia.getSelectedItem().equalsIgnoreCase("Terminada")) {
			posicionDia=Integer.parseInt(cDia.getSelectedItem());
		}
		
		
		
		cTarea.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				posicionTarea=cTarea.getSelectedIndex();
				cDia.removeAll();
				
				if(p.getTareas().get(posicionTarea).getEsfuerzo().size()==p.getDuracion()*p.getSprint()) {
					cDia.add("Terminada");
				}else {
					for (int i = p.getTareas().get(posicionTarea).getEsfuerzo().size()+1; i <= p.getDuracion()*p.getSprint()  ; i++) {
						cDia.add(""+i);
					}
				}
				
				if(!cDia.getSelectedItem().equalsIgnoreCase("Terminada")) {
					posicionDia=Integer.parseInt(cDia.getSelectedItem());
				}
			}
		});
		
		cDia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				posicionDia=Integer.parseInt(cDia.getSelectedItem());
			}
		});
		
		bAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tHoras.getText().equalsIgnoreCase("")) {
					lError.setVisible(true);
				}else {
					lError.setVisible(false);
					for(int i=p.getTareas().get(posicionTarea).getEsfuerzo().size(); i < posicionDia;i++) {
						if(i==posicionDia-1) {
							int valor=Integer.parseInt(tHoras.getText());
							p.getTareas().get(posicionTarea).getEsfuerzo().add(valor);
							if(valor==0) {
								p.getTareas().get(posicionTarea).setEstado("Terminado");
							}else {
								p.getTareas().get(posicionTarea).setEstado("En curso");
							}
						}else {
							p.getTareas().get(posicionTarea).getEsfuerzo().add(p.getTareas().get(posicionTarea).getEsfuerzo().get(i-1));
						}
					}
					dispose();//
				}
			}
		});
		
		
	}
}
