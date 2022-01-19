package view;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lamina_JLabel extends JPanel {

	public Lamina_JLabel(String titulo, String[] opciones) {

		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JLabel labNombreTienda = new JLabel("Nombre: " + opciones[0]);
		JLabel espacio = new JLabel("\n");
		JLabel espacio1 = new JLabel("\n");
		JLabel espacio2 = new JLabel("\n");

		JLabel labDirecTienda = new JLabel("Direccion: " + opciones[1]);
		JLabel labNomApellido = new JLabel("Vendedor: " + opciones[2]);
		JLabel labCodVendedor = new JLabel("Codigo: " + opciones[3]);

		add(labNombreTienda);
		add(espacio);
		add(labDirecTienda);
		add(espacio1);
		add(labNomApellido);
		add(espacio2);
		add(labCodVendedor);

	}

}