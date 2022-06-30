package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.hibernate.Session;

import dao.EditoraDAO;
import estudos.Editora;
import estudos.HibernateUtil;
import estudos.Livro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarEditora extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtFantasia;
	private JTextField txtRazao;
	private JTextField txtCNPJ;
	private JTextField txtRua;
	private JTextField txtPais;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtCEP;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarEditora frame = new CadastrarEditora();
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
	public CadastrarEditora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(10, 30, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o Social");
		lblRazoSocial.setBounds(10, 61, 73, 14);
		contentPane.add(lblRazoSocial);
		
		JLabel lblNewLabel = new JLabel("Nome Fantasia");
		lblNewLabel.setBounds(172, 61, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(111, 11, 46, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(10, 114, 46, 14);
		contentPane.add(lblRua);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(172, 114, 46, 14);
		contentPane.add(lblNumero);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(10, 226, 46, 14);
		contentPane.add(lblCep);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 170, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(111, 170, 46, 14);
		contentPane.add(lblEstado);
		
		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setBounds(212, 170, 46, 14);
		contentPane.add(lblPas);
		
		txtFantasia = new JTextField();
		txtFantasia.setBounds(172, 86, 103, 20);
		contentPane.add(txtFantasia);
		txtFantasia.setColumns(10);
		
		txtRazao = new JTextField();
		txtRazao.setBounds(10, 86, 150, 20);
		contentPane.add(txtRazao);
		txtRazao.setColumns(10);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setBounds(106, 30, 169, 20);
		contentPane.add(txtCNPJ);
		txtCNPJ.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setBounds(10, 139, 150, 20);
		contentPane.add(txtRua);
		txtRua.setColumns(10);
		
		txtPais = new JTextField();
		txtPais.setBounds(202, 195, 73, 20);
		contentPane.add(txtPais);
		txtPais.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(10, 195, 86, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(106, 195, 86, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(10, 251, 265, 20);
		contentPane.add(txtCEP);
		txtCEP.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(172, 139, 103, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					HibernateUtil.begin();
					Session s = HibernateUtil.getSession();
					
					EditoraDAO dao = new EditoraDAO();		
					
					
			
					// DAO Cadastrar Editora
					
					Editora novaEditora = new Editora();
					novaEditora.setCodigo(Integer.parseInt(txtCodigo.getText()));
					novaEditora.setRazaoSocial(txtRazao.getText());
					novaEditora.setNomeFantasia(txtFantasia.getText());
					novaEditora.setRua(txtRua.getText());
					novaEditora.setCep(txtCEP.getText());
					novaEditora.setCidade(txtCidade.getText());
					novaEditora.setCnpj(txtCNPJ.getText());
					novaEditora.setNumero(txtNumero.getText());
					novaEditora.setPais(txtPais.getText());
					novaEditora.setEstado(txtEstado.getText());
					
					dao.cadastrar(novaEditora);
					
					HibernateUtil.commit();
			
					} catch (Exception e) {
						e.printStackTrace();
					}
				
			}
		});
		btnSalvar.setBounds(87, 306, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(186, 306, 89, 23);
		contentPane.add(btnCancelar);
	}
}
