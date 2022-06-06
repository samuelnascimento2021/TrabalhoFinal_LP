package TrabalhoFinal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroDadosProjeto extends JPanel {
	private JTextField tfTitulo;
	private JTextField tfObjetivo;
	private JTextField tfEndereco;
	private JTextField tfDataInicio;
	private JTextField tfStatus;

	/**
	 * Create the panel.
	 * @param listaDadosProjeto 
	 */
	public CadastroDadosProjeto(ListaDadosProjeto listaDadosProjeto) {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(24, 31, 47, 14);
		add(lblTitulo);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(108, 28, 155, 20);
		add(tfTitulo);
		tfTitulo.setColumns(10);
		
		JLabel lblObjetivo = new JLabel("Objetivo");
		lblObjetivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObjetivo.setBounds(24, 80, 57, 14);
		add(lblObjetivo);
		
		tfObjetivo = new JTextField();
		tfObjetivo.setBounds(108, 77, 253, 20);
		add(tfObjetivo);
		tfObjetivo.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEndereco.setBounds(24, 129, 65, 14);
		add(lblEndereco);
		
		tfEndereco = new JTextField();
		tfEndereco.setBounds(108, 126, 253, 20);
		add(tfEndereco);
		tfEndereco.setColumns(10);
		
		JLabel lblDataInicio = new JLabel("Data de in\u00EDcio");
		lblDataInicio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataInicio.setBounds(24, 178, 86, 14);
		add(lblDataInicio);
		
		tfDataInicio = new JTextField();
		tfDataInicio.setBounds(108, 175, 106, 20);
		add(tfDataInicio);
		tfDataInicio.setColumns(10);
		
		tfStatus = new JTextField();
		tfStatus.setBounds(108, 224, 127, 20);
		add(tfStatus);
		tfStatus.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStatus.setBounds(24, 227, 46, 14);
		add(lblStatus);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(125, 266, 89, 23);
		add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(250, 266, 89, 23);
		add(btnLimpar);

	}

}
