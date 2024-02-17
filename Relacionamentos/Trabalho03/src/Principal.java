import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Pedro Albuquerque, Alana Andreazza e Leticia Fruet
public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton cadastrarUsuarioBtn, cadastrarClienteBtn, cadastrarProcessoBtn, cadastrarVaraBtn,
			cadastrarAudienciaBtn, cadastrarTribunalBtn, cadastrarCustaBtn, buscarProcessoBtn, listarProcessoBtn, consultarDespesaBtn,
			processoAdvogadoBtn;

	private static ArrayList<Processo> processos;
	private JComboBox<StatusProcesso> status;
	private JComboBox<Tribunal> tribunais;
	private ArrayList<Tribunal> listatribunais;
	private JComboBox<Vara> varas;
	private ArrayList<Vara> listavaras;
	private JComboBox<Pessoa> clientes;
	private ArrayList<Pessoa> listaclientes;
	private JComboBox<Pessoa> contrarias;
	private JComboBox<Usuario> advogados;
	private JComboBox<Usuario> secretarias;
	private ArrayList<Usuario> listausuarios;
	

	public Principal() {
		setTitle("Sistema de Controle de Processos Jurídicos");
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		processos = new ArrayList<>();
		tribunais = new JComboBox<>();
		listatribunais = new ArrayList<>();
		varas = new JComboBox<>();
		listavaras = new ArrayList<>();
		clientes = new JComboBox<>();
		listaclientes = new ArrayList<>();
		advogados = new JComboBox<>();
		listausuarios = new ArrayList<>();
		contrarias = new JComboBox<>();
		secretarias = new JComboBox<>();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1));

		cadastrarUsuarioBtn = new JButton("Cadastrar Usuário");
		cadastrarClienteBtn = new JButton("Cadastrar Cliente");
		cadastrarProcessoBtn = new JButton("Cadastrar Processo");
		cadastrarVaraBtn = new JButton("Cadastrar Vara");
		cadastrarAudienciaBtn = new JButton("Cadastrar Audiencia");
		cadastrarTribunalBtn = new JButton("Cadastrar Tribunal");
		cadastrarCustaBtn = new JButton("Cadastrar custa");
		buscarProcessoBtn = new JButton("Buscar Processo pelo código");
		listarProcessoBtn = new JButton("Listar Todos os Processos");
		consultarDespesaBtn = new JButton("Consultar as despesas do Processo");
		processoAdvogadoBtn = new JButton("Consultar processo vinculado a Advogado");
		

		cadastrarUsuarioBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame cadastroUsuarioFrame = new JFrame("Cadastro de Usuário");
				cadastroUsuarioFrame.setSize(300, 200);

				JPanel usuarioPanel = new JPanel();
				usuarioPanel.setLayout(new GridLayout(4, 2));

				JLabel loginLabel = new JLabel("Login:");
				JTextField loginField = new JTextField();

				JLabel senhaLabel = new JLabel("Senha:");
				JTextField senhaField = new JTextField();

				JButton salvarBtn = new JButton("Salvar");

				JButton cadastrarAdvogadoBtn = new JButton("Cadastrar Advogado");
				JButton cadastrarSecretariaBtn = new JButton("Cadastrar Secretaria");

				cadastrarAdvogadoBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame cadastroAdvogadoFrame = new JFrame("Cadastro de Advogado");
						cadastroAdvogadoFrame.setSize(300, 200);

						JPanel advogadoPanel = new JPanel();
						advogadoPanel.setLayout(new GridLayout(4, 2));

						JLabel oabLabel = new JLabel("Registro OAB:");
						JTextField oabField = new JTextField();

						salvarBtn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								String login = loginField.getText();
								String senha = senhaField.getText();
								String oab = oabField.getText();

								Advogado advogado = new Advogado(login, senha, oab);
								listausuarios.add(advogado);
								advogados.addItem(advogado);
								JOptionPane.showMessageDialog(null, advogado.toString());

								cadastroAdvogadoFrame.dispose();
							}
						});

						advogadoPanel.add(loginLabel);
						advogadoPanel.add(loginField);
						advogadoPanel.add(senhaLabel);
						advogadoPanel.add(senhaField);
						advogadoPanel.add(oabLabel);
						advogadoPanel.add(oabField);
						advogadoPanel.add(salvarBtn);

						cadastroAdvogadoFrame.add(advogadoPanel);
						cadastroAdvogadoFrame.setVisible(true);
					}
				});

				cadastrarSecretariaBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame cadastroSecretariaFrame = new JFrame("Cadastro de Secretária");
						cadastroSecretariaFrame.setSize(300, 200);

						JPanel secretariaPanel = new JPanel();
						secretariaPanel.setLayout(new GridLayout(4, 2));

						JLabel numctLabel = new JLabel("Número da carteira de trabalho:");
						JTextField numctField = new JTextField();

						salvarBtn.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								String login = loginField.getText();
								String senha = senhaField.getText();
								String numct = numctField.getText();

								Secretaria secretaria = new Secretaria(login, senha, numct);
								listausuarios.add(secretaria);
								secretarias.addItem(secretaria);
								JOptionPane.showMessageDialog(null, secretaria.toString());

								cadastroSecretariaFrame.dispose();
							}
						});

						secretariaPanel.add(loginLabel);
						secretariaPanel.add(loginField);
						secretariaPanel.add(senhaLabel);
						secretariaPanel.add(senhaField);
						secretariaPanel.add(numctLabel);
						secretariaPanel.add(numctField);
						secretariaPanel.add(salvarBtn);

						cadastroSecretariaFrame.add(secretariaPanel);
						cadastroSecretariaFrame.setVisible(true);
					}
				});

				usuarioPanel.add(cadastrarAdvogadoBtn);
				usuarioPanel.add(cadastrarSecretariaBtn);

				cadastroUsuarioFrame.add(usuarioPanel);
				cadastroUsuarioFrame.setVisible(true);
			}
		});

		cadastrarClienteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame cadastroClienteFrame = new JFrame("Cadastro de Cliente");
				cadastroClienteFrame.setSize(300, 200);

				JPanel clientePanel = new JPanel();
				clientePanel.setLayout(new GridLayout(4, 2));

				JLabel nomeLabel = new JLabel("Nome:");
				JTextField nomeField = new JTextField();

				JPanel cadastroPanel = new JPanel();
				cadastroPanel.setLayout(new GridLayout(4, 2));

				JButton salvarBtn = new JButton("Salvar");

				JButton cadastrarpfBtn = new JButton("Cadastrar Pessoa Física");
				JButton cadastrarpjBtn = new JButton("Cadastrar Pessoa Jurídica");

				cadastrarpfBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						cadastroPanel.removeAll();
						cadastroPanel.add(nomeLabel);
						cadastroPanel.add(nomeField);

						JLabel cpfLabel = new JLabel("CPF:");
						JTextField cpfField = new JTextField();
						cadastroPanel.add(cpfLabel);
						cadastroPanel.add(cpfField);

						cadastroPanel.add(salvarBtn);

						cadastroClienteFrame.revalidate();
						cadastroClienteFrame.repaint();
					}
				});

				cadastrarpjBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						cadastroPanel.removeAll();
						cadastroPanel.add(nomeLabel);
						cadastroPanel.add(nomeField);

						JLabel cnpjLabel = new JLabel("CNPJ:");
						JTextField cnpjField = new JTextField();
						cadastroPanel.add(cnpjLabel);
						cadastroPanel.add(cnpjField);

						cadastroPanel.add(salvarBtn);

						cadastroClienteFrame.revalidate();
						cadastroClienteFrame.repaint();
					}
				});

				salvarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String nome = nomeField.getText();

						if (cadastroPanel.getComponentCount() == 4) {
							String cpf = ((JTextField) cadastroPanel.getComponent(3)).getText();
							PessoaFisica pf = new PessoaFisica(nome, cpf);
							listaclientes.add(pf);
							clientes.addItem(pf);
							contrarias.addItem(pf);
							JOptionPane.showMessageDialog(null, pf.toString());
						} else if (cadastroPanel.getComponentCount() == 5) {
							String cnpj = ((JTextField) cadastroPanel.getComponent(3)).getText();
							PessoaJuridica pj = new PessoaJuridica(nome, cnpj);
							JOptionPane.showMessageDialog(null, pj.toString());
							listaclientes.add(pj);
							clientes.addItem(pj);
							contrarias.addItem(pj);
						}

						cadastroClienteFrame.dispose();
					}
				});

				clientePanel.add(cadastrarpfBtn);
				clientePanel.add(cadastrarpjBtn);

				cadastroClienteFrame.add(clientePanel, BorderLayout.NORTH);
				cadastroClienteFrame.add(cadastroPanel, BorderLayout.CENTER);
				cadastroClienteFrame.setVisible(true);
			}
		});

		cadastrarCustaBtn.addActionListener(new ActionListener() {
		    JFrame cadastroCustaFrame;
		    
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        cadastroCustaFrame = new JFrame("Cadastro de custa");
		        cadastroCustaFrame.setSize(300, 200);
		    
		        JPanel custaPanel = new JPanel();
		        custaPanel.setLayout(new GridLayout(4, 2));
		    
		        JLabel codigoLabel = new JLabel("Código do Processo:");
		        JTextField codigoField = new JTextField();
		    
		        JButton buscarBtn = new JButton("Buscar");
		    
		        buscarBtn.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String codigo = codigoField.getText();
		    
		                if (!processo(codigo)) {
		                    JOptionPane.showMessageDialog(null, "Não há processo com este código.");
		                } else {
		                    JPanel cadastroPanel = new JPanel();
		                    cadastroPanel.setLayout(new GridLayout(4, 2));
		    
		                    JLabel despesaLabel = new JLabel("Despesa:");
		                    JTextField despesaField = new JTextField();
		    
		                    JLabel valorLabel = new JLabel("Valor:");
		                    JTextField valorField = new JTextField();
		    
		                    JLabel dataLabel = new JLabel("Data da custa: (yyyy-MM-dd)");
		                    JTextField dataField = new JTextField();
		    
		                    JButton salvarBtn = new JButton("Salvar");
		    
		                    salvarBtn.addActionListener(new ActionListener() {
		                        @Override
		                        public void actionPerformed(ActionEvent e) {
		                            String despesa = despesaField.getText();
		                            double valor = Double.parseDouble(valorField.getText());
		                            LocalDate data = LocalDate.parse(dataField.getText());
		    
		                            Custa custa = new Custa(despesa, valor, data);
		                            for (Processo processo : processos) {
		                                processo.adicionarCusta(custa, codigo);
		                            }
		    
		                            cadastroCustaFrame.dispose(); // Fecha a janela de adicionar custa
		                        }
		                    });
		    
		                    cadastroPanel.add(despesaLabel);
		                    cadastroPanel.add(despesaField);
		                    cadastroPanel.add(valorLabel);
		                    cadastroPanel.add(valorField);
		                    cadastroPanel.add(dataLabel);
		                    cadastroPanel.add(dataField);
		                    cadastroPanel.add(salvarBtn);
		    
		                    cadastroCustaFrame.setContentPane(cadastroPanel);
		                    cadastroCustaFrame.revalidate();
		                    cadastroCustaFrame.repaint();
		                }
		            }
		        });
		    
		        custaPanel.add(codigoLabel);
		        custaPanel.add(codigoField);
		        custaPanel.add(buscarBtn);
		    
		        cadastroCustaFrame.add(custaPanel);
		        cadastroCustaFrame.setVisible(true);
		    }
		});

		

		cadastrarVaraBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame cadastroVaraFrame = new JFrame("Cadastro de Vara");
				cadastroVaraFrame.setSize(300, 200);

				JPanel varaPanel = new JPanel();
				varaPanel.setLayout(new GridLayout(4, 2));

				JLabel nomeLabel = new JLabel("Nome da Vara:");
				JTextField nomeField = new JTextField();

				JButton salvarBtn = new JButton("Salvar");

				salvarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String nome = nomeField.getText();

						Vara vara = new Vara(nome);
						listavaras.add(vara);
						varas.addItem(vara);
						JOptionPane.showMessageDialog(null, vara.toString());

						cadastroVaraFrame.dispose();

					}
				});

				varaPanel.add(nomeLabel);
				varaPanel.add(nomeField);
				varaPanel.add(salvarBtn);

				cadastroVaraFrame.add(varaPanel);
				cadastroVaraFrame.setVisible(true);

			}
		});

		cadastrarTribunalBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame cadastroTribunalFrame = new JFrame("Cadastro de Tribunal");
				cadastroTribunalFrame.setSize(300, 200);

				JPanel tribunalPanel = new JPanel();
				tribunalPanel.setLayout(new GridLayout(4, 2));

				JLabel nomeLabel = new JLabel("Nome do Tribunal:");
				JTextField nomeField = new JTextField();

				JPanel cadastroPanel = new JPanel();
				cadastroPanel.setLayout(new GridLayout(4, 2));

				JButton salvarBtn = new JButton("Salvar");

				salvarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String nome = nomeField.getText();

						Tribunal tribunal = new Tribunal(nome);
						listatribunais.add(tribunal);
						tribunais.addItem(tribunal); 

						JOptionPane.showMessageDialog(null, tribunal.toString());

						cadastroTribunalFrame.dispose();
					}
				});

				tribunalPanel.add(nomeLabel);
				tribunalPanel.add(nomeField);
				tribunalPanel.add(salvarBtn);

				cadastroTribunalFrame.add(tribunalPanel);
				cadastroTribunalFrame.setVisible(true);
			}
		});

		cadastrarAudienciaBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame cadastroAudienciaFrame = new JFrame("Cadastro de Audiência");
				cadastroAudienciaFrame.setSize(300, 200);

				JPanel audienciaPanel = new JPanel();
				audienciaPanel.setLayout(new GridLayout(4, 2));

				JLabel dataLabel = new JLabel("Data da Audiência: (yyyy-MM-dd)");
				JTextField dataField = new JTextField();

				JLabel recomendacaoLabel = new JLabel("Recomendação Tribunal: ");
				JTextField recomendacaoField = new JTextField();

				JPanel cadastroPanel = new JPanel();
				cadastroPanel.setLayout(new GridLayout(4, 2));

				JButton salvarBtn = new JButton("Salvar");

				salvarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						LocalDate data = LocalDate.parse(dataField.getText());
						String recomendacao = recomendacaoField.getText();

						Audiencia audiencia = new Audiencia(data, recomendacao);

						JOptionPane.showMessageDialog(null, audiencia.toString());

						cadastroAudienciaFrame.dispose();

					}
				});

				audienciaPanel.add(dataLabel);
				audienciaPanel.add(dataField);
				audienciaPanel.add(recomendacaoLabel);
				audienciaPanel.add(recomendacaoField);
				audienciaPanel.add(salvarBtn);

				cadastroAudienciaFrame.add(audienciaPanel);
				cadastroAudienciaFrame.setVisible(true);

			}
		});

		cadastrarProcessoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame cadastroProcessoFrame = new JFrame("Cadastro de Processo");
				cadastroProcessoFrame.setSize(600, 400);

				JPanel processoPanel = new JPanel();
				processoPanel.setLayout(new GridLayout(6, 4));

				JLabel situacaoLabel = new JLabel("Situação do processo: ");
				status = new JComboBox<>(StatusProcesso.values());

				JLabel codigoLabel = new JLabel("Codigo do processo: ");
				JTextField codigoField = new JTextField();

				JLabel tribunalLabel = new JLabel("Tribunal: ");
				tribunais = new JComboBox<>(listatribunais.toArray(new Tribunal[0]));

				JLabel varaLabel = new JLabel("Vara: ");
				varas = new JComboBox<>(listavaras.toArray(new Vara[0]));

				JLabel clienteLabel = new JLabel("Cliente: ");
				clientes = new JComboBox<>(listaclientes.toArray(new Pessoa[0]));

				JLabel contrariaLabel = new JLabel("Pessoa Contraria: ");
				contrarias = new JComboBox<>(listaclientes.toArray(new Pessoa[0]));

				JLabel motivoLabel = new JLabel("Motivo do Processo: ");
				JTextField motivoField = new JTextField();

				JLabel secretariaLabel = new JLabel("Secretaria: ");
				secretarias = new JComboBox<>(listausuarios.toArray(new Usuario[0]));

				JLabel advogadoLabel = new JLabel("Advogado: ");
				advogados = new JComboBox<>(listausuarios.toArray(new Usuario[0]));


				JButton salvarBtn = new JButton("Salvar");

				salvarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						StatusProcesso statusSelecionado = (StatusProcesso) status.getSelectedItem();
						String codigo = codigoField.getText();
						Tribunal tribunal = (Tribunal) tribunais.getSelectedItem();
						Vara vara = (Vara) varas.getSelectedItem();
						Pessoa cliente = (Pessoa) clientes.getSelectedItem();
						Pessoa contraria = (Pessoa) contrarias.getSelectedItem();
						String motivo = motivoField.getText();
						Usuario secretaria = (Usuario) secretarias.getSelectedItem();
						Usuario advogado = (Usuario) advogados.getSelectedItem();
						
						
						Processo processo = new Processo(statusSelecionado, codigo, tribunal, vara, cliente, contraria, motivo, secretaria, advogado);
						
						processos.add(processo);
						
						JOptionPane.showConfirmDialog(null, processo.toString());
						
						cadastroProcessoFrame.dispose();
					}
				});

				processoPanel.add(situacaoLabel);
				processoPanel.add(status);
				processoPanel.add(codigoLabel);
				processoPanel.add(codigoField);
				processoPanel.add(tribunalLabel);
				processoPanel.add(tribunais);
				processoPanel.add(varaLabel);
				processoPanel.add(varas);
				processoPanel.add(clienteLabel);
				processoPanel.add(clientes);
				processoPanel.add(contrariaLabel);
				processoPanel.add(contrarias);
				processoPanel.add(motivoLabel);
				processoPanel.add(motivoField);
				processoPanel.add(secretariaLabel);
				processoPanel.add(secretarias);
				processoPanel.add(advogadoLabel);
				processoPanel.add(advogados);

				processoPanel.add(salvarBtn);
				
				cadastroProcessoFrame.add(processoPanel);
				cadastroProcessoFrame.setVisible(true);
			}
		});

		buscarProcessoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame buscarProcessoFrame = new JFrame("Buscar Processo:");
				buscarProcessoFrame.setSize(300, 200);

				JPanel processoPanel = new JPanel();
				processoPanel.setLayout(new GridLayout(4, 2));

				JLabel codigoLabel = new JLabel("Informe o codigo do processo: ");
				JTextField codigoField = new JTextField();

				JButton buscarBtn = new JButton("Buscar");

				buscarBtn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String codigo = codigoField.getText();

							JOptionPane.showMessageDialog(null, buscarProcesso(codigo));
					}
				});

				processoPanel.add(codigoLabel);
				processoPanel.add(codigoField);
				processoPanel.add(buscarBtn);

				buscarProcessoFrame.add(processoPanel);
				buscarProcessoFrame.setVisible(true);
			}
		});

		listarProcessoBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, listarProcessos());
			}
		});

		consultarDespesaBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame buscarProcessoFrame = new JFrame("Consultar Despesa:");
				buscarProcessoFrame.setSize(300, 200);

				JPanel processoPanel = new JPanel();
				processoPanel.setLayout(new GridLayout(4, 2));

				JLabel codigoLabel = new JLabel("Informe o codigo do processo: ");
				JTextField codigoField = new JTextField();

				JButton buscarBtn = new JButton("Buscar");

				buscarBtn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String codigo = codigoField.getText();

						for (Processo processo : processos) {
							if (processo.getCodigoProcesso().equals(codigo)) {
								JOptionPane.showMessageDialog(null, processo.despesasProcesso(codigo));
							} else {
								JOptionPane.showMessageDialog(null, "Não há processo com este codigo.");
							}
						}

					}
				});

				processoPanel.add(codigoLabel);
				processoPanel.add(codigoField);
				processoPanel.add(buscarBtn);

				buscarProcessoFrame.add(processoPanel);
				buscarProcessoFrame.setVisible(true);
			}
		});
		
		processoAdvogadoBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame buscarProcessoFrame = new JFrame("Consultar Processo vinculado a advogado:");
				buscarProcessoFrame.setSize(300, 200);

				JPanel processoPanel = new JPanel();
				processoPanel.setLayout(new GridLayout(4, 2));

				JLabel advogadoLabel = new JLabel("Informe o nome do advogado: ");
				advogados = new JComboBox<>(listausuarios.toArray(new Usuario[0]));

				JButton buscarBtn = new JButton("Buscar");
				
				
				buscarBtn.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Usuario advogado = (Usuario) advogados.getSelectedItem();
							JOptionPane.showMessageDialog(null, processoVinculadoAdvogado(advogado));
						
					}
				});
				
				processoPanel.add(advogadoLabel);
				processoPanel.add(advogados);
				processoPanel.add(buscarBtn);
				
				buscarProcessoFrame.add(processoPanel);
				buscarProcessoFrame.setVisible(true);
			}
		});

		panel.add(cadastrarUsuarioBtn);
		panel.add(cadastrarClienteBtn);
		panel.add(cadastrarProcessoBtn);
		panel.add(cadastrarVaraBtn);
		panel.add(cadastrarAudienciaBtn);
		panel.add(cadastrarTribunalBtn);
		panel.add(cadastrarCustaBtn);
		panel.add(buscarProcessoBtn);
		panel.add(listarProcessoBtn);
		panel.add(consultarDespesaBtn);
		panel.add(processoAdvogadoBtn);

		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Principal();

	}

	public static String listarProcessos() {
		String str = "";
		for (Processo processo : processos) {
			str += "\n" + processo.toString();
		}
		return str;
	}

	public static String buscarProcesso(String codProcesso) {
		String str = "";
		for (Processo p : processos) {
			if (p.getCodigoProcesso().equals(codProcesso)) {
				str += p.toString();
			}
			else {
				str = "Não existe processo com este código.";
			}
		}
		return str;
	}
	
	public static String processoVinculadoAdvogado(Usuario umAdvogado) {
		String str = "";
		for (Processo p : processos) {
			if (p.getUmAdvogado().equals(umAdvogado)) {
				str = p.toString() + "\n-------------------------\n";
			}
			else {
				str = "Não há processo vinculado a este advogado.";
			}
		}
		return str;
	}
	public static boolean processo(String codigo){
		for (Processo processo : processos) {
			if (processo.getCodigoProcesso().equals(codigo)) {
				return true;
			}
		}
		return false;
	}
}