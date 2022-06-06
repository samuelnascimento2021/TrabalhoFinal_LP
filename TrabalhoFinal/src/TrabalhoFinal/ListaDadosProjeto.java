package TrabalhoFinal;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListaDadosProjeto extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListaDadosProjeto() {
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		table = new JTable();
		add(table);

	}

}
