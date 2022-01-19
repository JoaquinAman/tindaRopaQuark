package view;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Lamina_BotonesCheck extends JPanel {

	public Lamina_BotonesCheck(String titulo) {

		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		bot = new JCheckBox();

		add(bot);

	}

	private JCheckBox bot;

	public JCheckBox getBot() {
		return bot;
	}

	public void setBot(JCheckBox bot) {
		this.bot = bot;
	}
}