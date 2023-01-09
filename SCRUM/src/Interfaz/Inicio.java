
package Interfaz;
import java.awt.EventQueue;
import org.math.plot.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Proyecto;

import javax.swing.JButton;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private Proyecto p;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		p=new Proyecto();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton bCrear = new JButton("Crear Proyecto");
		
		bCrear.setBounds(271, 213, 141, 47);
		contentPane.add(bCrear);
		
		JButton bTarea = new JButton("Añadir Tarea");
		
		bTarea.setBounds(64, 94, 111, 39);
		contentPane.add(bTarea);
		
		JButton bTrabajador = new JButton("Añadir Trabajador");
		
		bTrabajador.setBounds(282, 94, 130, 39);
		contentPane.add(bTrabajador);
		
		JButton bActualizar = new JButton("Actualizar Estado");
		
		bActualizar.setBounds(481, 94, 141, 39);
		contentPane.add(bActualizar);
		
		JButton bVer = new JButton("Ver Estado");
		bVer.setBounds(155, 339, 141, 39);
		contentPane.add(bVer);
		
		JButton bGrafica = new JButton("Generar gráfica");
		bGrafica.setBounds(407, 339, 141, 39);
		contentPane.add(bGrafica);
		bVer.setVisible(false);
		bActualizar.setVisible(false);
		bGrafica.setVisible(false);
		bTarea.setVisible(false);
		bTrabajador.setVisible(false);
		
		bCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ICreacionProyecto creacion = new ICreacionProyecto(p);
				creacion.setVisible(true);
				bTrabajador.setVisible(true);
				bCrear.setVisible(false);
			}
		});
		
		bTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IAñadirTarea tarea=new IAñadirTarea(p);
				tarea.setVisible(true);
				bVer.setVisible(true);
				bActualizar.setVisible(true);
				bGrafica.setVisible(true);
			}
		});
		
		bTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IAñadirEquipo equipo=new IAñadirEquipo(p);
				equipo.setVisible(true);
				bTarea.setVisible(true);
			}
		});
		
		bGrafica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] x = null;
				double[] y = null;
				
				Plot2DPanel plot = new Plot2DPanel();
				
				for(int i=0; i < (p.getDuracion()*p.getSprint());i++) {
					x[i] = i;
					y[i] = p.esfuerzoTotal(i);
				}
				plot.addLinePlot("Grafica Esfuerzo",x,y);
				JFrame jframe = new JFrame("Grafica esfuerzo");
				jframe.setContentPane(plot);
				jframe.setVisible(true);
			}
		});
		bActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IActualizarEstado actualizar=new IActualizarEstado(p);
				actualizar.setVisible(true);
				
			}
		});

	}
}
