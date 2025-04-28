package br.dev.milla.calculo_ip.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCalculoIp {

	private JLabel labelEndIp;
	private JTextField txtPrimeiroOctetoIp;
	private JTextField txtSegundoOctetoIp;
	private JTextField txtTerceiroOctetoIp;
	private JTextField txtQuartoOctetoIp;
	private JTextField txtCidrIp;	
	
	private JLabel labelIp;
	private JLabel labelClasse;
	private JLabel labelMascaraDecimal;
	private JLabel labelMascaraBinario;
	private JLabel labelIpDisponivel;
	private JButton buttonCalcular;
	
	private JButton buttonLimpar;
//	private JLabel labelResultado;
//	private JLabel labelMensagemErro;
	
		private void criarTelaCalculoIp() {
	        
	        JFrame tela = new JFrame();
			tela.setSize(500, 320);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.setTitle("Calculadora de IP");
			tela.setLayout(null);
			tela.setResizable(false);
			tela.setLocationRelativeTo(null);

//	        // Campos de entrada
//	        frame.add(new JLabel("Primeiro Octeto:"));
//	        primeiroOctetoField = new JTextField();
//	        frame.add(primeiroOctetoField);
//
//	        frame.add(new JLabel("Segundo Octeto:"));
//	        segundoOctetoField = new JTextField();
//	        frame.add(segundoOctetoField);
//
//	        frame.add(new JLabel("Terceiro Octeto:"));
//	        terceiroOctetoField = new JTextField();
//	        frame.add(terceiroOctetoField);
//
//	        frame.add(new JLabel("Quarto Octeto:"));
//	        quartoOctetoField = new JTextField();
//	        frame.add(quartoOctetoField);
//
//	        frame.add(new JLabel("CIDR:"));
//	        cidrField = new JTextField("8");
//	        frame.add(cidrField);
//
//	        btnCalcular = new JButton("Calcular");
//	        frame.add(btnCalcular);
//
//	        // Labels de resultados
//	        pIP = new JLabel("IP: ");
//	        frame.add(pIP);
//
//	        pClasse = new JLabel("Classe: ");
//	        frame.add(pClasse);
//
//	        pMascaraDecimal = new JLabel("Máscara Decimal: ");
//	        frame.add(pMascaraDecimal);
//
//	        pMascaraBinario = new JLabel("Máscara Binária: ");
//	        frame.add(pMascaraBinario);
//
//	        pHosts = new JLabel("Número de Hosts: ");
//	        frame.add(pHosts);
//
//	        pRedes = new JLabel("Número de Subredes: ");
//	        frame.add(pRedes);
//
//	        btnCalcular.addActionListener(this::calcular);
//
//	        frame.setVisible(true);
//	    }
//
//	    private void calcular(ActionEvent event) {
//	        try {
//	            int primeiroOcteto = Integer.parseInt(primeiroOctetoField.getText().trim());
//	            int segundoOcteto = Integer.parseInt(segundoOctetoField.getText().trim());
//	            int terceiroOcteto = Integer.parseInt(terceiroOctetoField.getText().trim());
//	            int quartoOcteto = Integer.parseInt(quartoOctetoField.getText().trim());
//	            int cidr = Integer.parseInt(cidrField.getText().trim());
//
//	            if (primeiroOcteto < 0 || primeiroOcteto > 255 ||
//	                segundoOcteto < 0 || segundoOcteto > 255 ||
//	                terceiroOcteto < 0 || terceiroOcteto > 255 ||
//	                quartoOcteto < 0 || quartoOcteto > 255 ||
//	                cidr < 8 || cidr > 32) {
//	                showErrorMessage("Valores inválidos! Verifique os octetos e CIDR.");
//	                return;
//	            }
//
//	            IP ip = new IP(primeiroOcteto, segundoOcteto, terceiroOcteto, quartoOcteto);
//	            String classe = CidrCalculator.identificarClasse(primeiroOcteto);
//	            String mascaraDecimal = CidrCalculator.obterMascaraDecimal(classe);
//	            String mascaraBinaria = CidrCalculator.obterMascaraBinaria(classe);
//	            int hosts = CidrCalculator.calcularHosts(cidr);
//	            int subRedes = CidrCalculator.calcularSubRedes(cidr, classe);
//
//	            pIP.setText("IP: " + ip.getIP());
//	            pClasse.setText("Classe: " + classe);
//	            pMascaraDecimal.setText("Máscara Decimal: " + mascaraDecimal);
//	            pMascaraBinario.setText("Máscara Binária: " + mascaraBinaria);
//	            pHosts.setText("Número de Hosts: " + hosts);
//	            pRedes.setText("Número de Subredes: " + subRedes);
//	        } catch (NumberFormatException e) {
//	            showErrorMessage("Por favor, insira valores numéricos válidos.");
//	        }
//	    }
//
//	    private void showErrorMessage(String message) {
//	        JOptionPane.showMessageDialog(frame, message, "Erro", JOptionPane.ERROR_MESSAGE);
			
			tela.setVisible(true);
			
	    }


	}