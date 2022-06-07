package TrabalhoFinal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class AbrirProjeto extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField txtExibir;

	/**
	 * Create the panel.
	 */
	public AbrirProjeto() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conte\u00FAdo do projeto");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(133, 31, 179, 27);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(425, 77, -399, 200);
		add(scrollPane);
		
		JButton btnNewButton = new JButton("Abrir");
		btnNewButton.addActionListener(new ActionListener() {
			
			public static void leitor(String path) throws IOException {
				BufferedReader buffRead = new BufferedReader(new FileReader(path));
				String linha = "";
				String n="";
								
				while (true) {
					if (linha != null) {
						try {
							n = n + linha + "\n";
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else
						break;
					linha = buffRead.readLine();
				}
				buffRead.close();
				txtExibir.setText(n);
				}
			
			public void actionPerformed(ActionEvent e) {
				String path="cadastro.txt";
				try {
					leitor(path.toString());
				} catch (IOException e1) {
					
					JOptionPane.showMessageDialog(null, "Ocorreu um erro, tente novamente!");
				}
			}
			
			}
		);
		btnNewButton.setBounds(179, 70, 89, 23);
		add(btnNewButton);
		
		txtExibir = new JTextField();
		txtExibir.setBounds(10, 108, 430, 169);
		add(txtExibir);
		txtExibir.setColumns(10);

	}
}
