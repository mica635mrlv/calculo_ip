package br.dev.milla.calculo_ip.gui;

import br.dev.milla.calculo_ip.model.CalculadoraIp;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;

public class TelaCalculoIp {
	
	private JLabel lblEndIp, lblCidr;
	private JPanel pnlOcteto;
	private JTextField txtPrimeiroOcteto, txtSegundoOcteto, txtTerceiroOcteto, txtQuartoOcteto, txtCidr;

	private JButton btnCalcular, btnLimpar;
	private JPanel pnlInfo;	
	private JLabel lblIp, lblClasse, lblMascaraDec, lblMascaraBin, lblEndIpDisp, lblNumRedes;
	
	private JPanel pnlResultado;
	private JLabel lblResulIp, lblResulClasse, lblResulMascDec, lblResulMascBin, lblResulEndIpDisp, lblResulNumRedes;
	private JLabel lblMensagemErro;
	
		public void criarTelaCalculoIp() {
		
			JFrame tela = new JFrame();
			tela.setSize(500, 428);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setTitle("Calculadora de IP");
			tela.setLayout(null);
			tela.setResizable(false);
			tela.setLocationRelativeTo(null);
					
			// Usuário colocará o IP
			lblEndIp = new JLabel();
			lblEndIp.setText("Endereço de IP");
			lblEndIp.setBounds(37, 20, 220, 35);
			lblEndIp.setFont(new Font("Arial", Font.BOLD, 15));

			// Panel dos Octetos do IP
			pnlOcteto = new JPanel(new GridLayout(1, 4, 5, 0));
			pnlOcteto.setBounds(37, 60, 280, 30);
			
			txtPrimeiroOcteto = new JTextField();
			txtSegundoOcteto = new JTextField();
			txtTerceiroOcteto = new JTextField();
			txtQuartoOcteto = new JTextField();
			
			txtPrimeiroOcteto.setHorizontalAlignment(txtPrimeiroOcteto.CENTER);
			txtSegundoOcteto.setHorizontalAlignment(txtSegundoOcteto.CENTER);
			txtTerceiroOcteto.setHorizontalAlignment(txtTerceiroOcteto.CENTER);
			txtQuartoOcteto.setHorizontalAlignment(txtQuartoOcteto.CENTER);
						
			pnlOcteto.add(txtPrimeiroOcteto); 
			pnlOcteto.add(txtSegundoOcteto); 
			pnlOcteto.add(txtTerceiroOcteto); 
			pnlOcteto.add(txtQuartoOcteto);
			
			// CIDR
			lblCidr = new JLabel();
			lblCidr.setText("CIDR");
			lblCidr.setBounds(380, 20, 100, 35);
			lblCidr.setFont(new Font("Arial", Font.BOLD, 17));
			
			txtCidr = new JTextField();
			txtCidr.setBounds(380, 60, 66, 30);
			txtCidr.setHorizontalAlignment(txtCidr.CENTER);
			
			// Botão Calcular
			btnCalcular = new JButton();
			btnCalcular.setText("CALCULAR");
			btnCalcular.setBounds(37, 105, 200, 35);
			btnCalcular.setFont(new Font("Arial", Font.BOLD, 17));
	        btnCalcular.addActionListener(new ActionListener() {
	            
	        	@Override
	            public void actionPerformed(ActionEvent e) {
	                
	            	try {
	                    int primeiroOcteto = Integer.parseInt(txtPrimeiroOcteto.getText());
	                    int segundoOcteto = Integer.parseInt(txtSegundoOcteto.getText());
	                    int terceiroOcteto = Integer.parseInt(txtTerceiroOcteto.getText());
	                    int quartoOcteto = Integer.parseInt(txtQuartoOcteto.getText());
	                    int cidr = Integer.parseInt(txtCidr.getText());

	                    CalculadoraIp calculadora = new CalculadoraIp();
	                    calculadora.setOctetos(primeiroOcteto, segundoOcteto, terceiroOcteto, quartoOcteto);
	                    calculadora.setCidr(cidr);

	                    lblResulIp.setText(calculadora.formatoIp());
	                    lblResulClasse.setText(calculadora.classeIp());
	                    lblResulMascDec.setText(calculadora.calcMascaraDecimal());
	                    lblResulMascBin.setText(calculadora.calcMascaraBinaria());
	                    lblResulEndIpDisp.setText(String.valueOf(calculadora.calcNumIpsDisponiveis()));

	                    lblMensagemErro.setText("");
	                    
	                } catch (NumberFormatException ex) {
	                	
	                    lblMensagemErro.setText("<html>Para que a calculadora funcione corretamente <br> digite apenas números válidos!<html>");
	                    
	                }
	            }
	        });
			
			// Botão Limpar
			btnLimpar = new JButton();
			btnLimpar.setText("LIMPAR");
			btnLimpar.setBounds(246, 105, 200, 35);
			btnLimpar.setFont(new Font("Arial", Font.BOLD, 15));
			btnLimpar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					txtPrimeiroOcteto.setText("");
			        txtSegundoOcteto.setText("");
			        txtTerceiroOcteto.setText("");
			        txtQuartoOcteto.setText("");
			        
			        txtCidr.setText("");
			        
			        lblResulIp.setText("");
			        lblResulClasse.setText("");
			        lblResulMascDec.setText("");
			        lblResulMascBin.setText("");
			        lblResulEndIpDisp.setText("");
					
			        lblMensagemErro.setText("");
			        
				}
			});
			
			// Painel de Informações
			pnlInfo = new JPanel(new GridLayout(6, 1, 0, 0));
			pnlInfo.setBounds(37, 160, 200, 138);
			
			lblIp = new JLabel();
			lblClasse = new JLabel();
			lblMascaraDec = new JLabel();
			lblMascaraBin = new JLabel();
			lblEndIpDisp = new JLabel();
			lblNumRedes = new JLabel();
			
			lblIp.setText("IP:");
			lblClasse.setText("Classe:");
			lblMascaraDec.setText("Másc. Decimal:");
			lblMascaraBin.setText("Másc. Binária:");
			lblEndIpDisp.setText("IPs Disponíveis:");
			lblNumRedes.setText("Número de Redes:");
			
			lblIp.setFont(new Font("Arial", Font.BOLD, 15));
			lblClasse.setFont(new Font("Arial", Font.BOLD, 15));
			lblMascaraDec.setFont(new Font("Arial", Font.BOLD, 15));
			lblMascaraBin.setFont(new Font("Arial", Font.BOLD, 15));
			lblEndIpDisp.setFont(new Font("Arial", Font.BOLD, 15));
			lblNumRedes.setFont(new Font("Arial", Font.BOLD, 15));
			
			pnlInfo.add(lblIp); 
			pnlInfo.add(lblClasse); 
			pnlInfo.add(lblMascaraDec); 
			pnlInfo.add(lblMascaraBin);
			pnlInfo.add(lblEndIpDisp);
			pnlInfo.add(lblNumRedes);
			
			// Painel Resultado
			pnlResultado = new JPanel(new GridLayout(6, 1, 0, 0));
			pnlResultado.setBounds(160, 160, 287, 138);
			
			lblResulIp = new JLabel();
			lblResulClasse = new JLabel();
			lblResulMascDec = new JLabel();
			lblResulMascBin = new JLabel();
			lblResulEndIpDisp = new JLabel();
			lblResulNumRedes = new JLabel();
			
			lblResulIp.setFont(new Font("Arial", Font.BOLD, 15));
			lblResulClasse.setFont(new Font("Arial", Font.BOLD, 15));
			lblResulMascDec.setFont(new Font("Arial", Font.BOLD, 15));
			lblResulMascBin.setFont(new Font("Arial", Font.BOLD, 15));
			lblResulEndIpDisp.setFont(new Font("Arial", Font.BOLD, 15));
			lblResulNumRedes.setFont(new Font("Arial", Font.BOLD, 15));
			
			lblResulIp.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResulClasse.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResulMascDec.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResulMascBin.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResulEndIpDisp.setHorizontalAlignment(SwingConstants.RIGHT);
			lblResulNumRedes.setHorizontalAlignment(SwingConstants.RIGHT);			
			
			pnlResultado.add(lblResulIp); 
			pnlResultado.add(lblResulClasse); 
			pnlResultado.add(lblResulMascDec); 
			pnlResultado.add(lblResulMascBin); 
			pnlResultado.add(lblResulEndIpDisp); 
			pnlResultado.add(lblResulNumRedes); 
			
			lblMensagemErro = new JLabel();
			lblMensagemErro.setBounds(67, 318, 400, 40);
			lblMensagemErro.setForeground(Color.red);
			lblMensagemErro.setFont(new Font("Arial", Font.BOLD, 15));
			
			// Aparecer na Tela
			tela.getContentPane().add(lblEndIp);
			tela.getContentPane().add(pnlOcteto);
			tela.getContentPane().add(lblCidr);
			tela.getContentPane().add(txtCidr);
			tela.getContentPane().add(btnCalcular);
			tela.getContentPane().add(btnLimpar);
			tela.getContentPane().add(pnlInfo);
			tela.getContentPane().add(pnlResultado);
			tela.getContentPane().add(lblMensagemErro);
			
		// Tornar tela visível	
		tela.setVisible(true);
		
	}

}
