package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Clases.Proyecto;

import javax.swing.JTable;

public class IVerEstado extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public IVerEstado(Proyecto p) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		int columnas=p.getDuracion()+1;
		int filas=p.getTareas().size();
		
		String[] f=new String[columnas];
		for (int i = 0; i < f.length; i++) {
			if(i==0)
				f[i]="";
			else
				f[i]=""+i;
		}
		
		for(int i=0;i<columnas;i++) {
			
		}
		
		
		
		
	}
}
