package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

		int columnas=(p.getDuracion()*p.getSprint())+3;
		int filas=p.getTareas().size();
		
		String[] f1=new String[columnas];
		for (int i = 0; i < f1.length; i++) {
			if(i==0)
				f1[i]="";
			else if(i==1)
				f1[i]="Estado";
			else if(i==2)
				f1[i]="Trabajador";
			else
				f1[i]=""+(i-2);
		}
		String [][] t=new String[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for(int j=0;j<columnas;j++) {
				if(j==0) {
					t[i][j]=p.getTareas().get(i).getNombre();
				}else if(j==1) {
					t[i][j]=p.getTareas().get(i).getEstado();
				}else if(j==2) {
					t[i][j]=p.getTareas().get(i).getTrabajador();
				}else if(p.getTareas().get(i).getEsfuerzo().size()<j-2){
						t[i][j]="";
				}else{
					System.out.println(j);
					t[i][j]=""+p.getTareas().get(i).getEsfuerzo().get(j-3);	
				}
			}
		}
		
		
		JTable tabla=new JTable(t,f1);
		add(new JScrollPane(tabla),BorderLayout.CENTER);
		
		
		
		
	}
}
