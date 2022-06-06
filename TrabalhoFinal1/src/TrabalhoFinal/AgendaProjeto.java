package TrabalhoFinal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AgendaProjeto extends JPanel {
	private JTextField tfData;
	private JTextField tfHora;
	private JTextField tfDescricao;
	private JTextField tfAcao;

	/**
	 * Create the panel.
	 */
	public AgendaProjeto() {
		setLayout(null);
		
		JLabel lblData = new JLabel("Data");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblData.setBounds(24, 31, 46, 14);
		add(lblData);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHora.setBounds(236, 31, 46, 14);
		add(lblHora);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescricao.setBounds(24, 101, 66, 14);
		add(lblDescricao);
		
		JLabel lblAcao = new JLabel("A\u00E7\u00E3o");
		lblAcao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAcao.setBounds(24, 191, 46, 14);
		add(lblAcao);
		
		tfData = new JTextField();
		tfData.setBounds(100, 28, 100, 20);
		add(tfData);
		tfData.setColumns(10);
		
		tfHora = new JTextField();
		tfHora.setBounds(292, 28, 94, 20);
		add(tfHora);
		tfHora.setColumns(10);
		
		tfDescricao = new JTextField();
		tfDescricao.setBounds(100, 73, 286, 71);
		add(tfDescricao);
		tfDescricao.setColumns(10);
		
		tfAcao = new JTextField();
		tfAcao.setBounds(100, 188, 153, 20);
		add(tfAcao);
		tfAcao.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(111, 244, 89, 23);
		add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(269, 244, 89, 23);
		add(btnLimpar);

	}
}
