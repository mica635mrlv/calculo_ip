package br.dev.milla.calculo_ip.model;

import br.dev.milla.calculo_ip.gui.TelaCalculoIp;

public class CalculadoraIp {

    private int primeiroOcteto;
    private int segundoOcteto;
    private int terceiroOcteto;
    private int quartoOcteto;
    private int cidr;

    public void setOctetos(int primeiroOcteto, int segundoOcteto, int terceiroOctet, int quartoOcteto) {
        this.primeiroOcteto = primeiroOcteto;
        this.segundoOcteto = segundoOcteto;
        this.terceiroOcteto = terceiroOctet;
        this.quartoOcteto = quartoOcteto;
    }

    public void setCidr(int cidr) {
        this.cidr = cidr;
    }

    public String formatoIp() {
        return String.format("%d.%d.%d.%d/%d", primeiroOcteto, segundoOcteto, terceiroOcteto, quartoOcteto, cidr);
    }

    public String classeIp() {

		if (primeiroOcteto >= 0 && primeiroOcteto <= 127) {
			return "A";
		} else if (primeiroOcteto >= 128 && primeiroOcteto <= 191) {
			return "B";
		} else if (primeiroOcteto >= 192 && primeiroOcteto <= 223) {
			return "C";
		} else {
			return "O valor inserido é maior que 223!";
		}
		
    }
    
    public String calcMascaraDecimal() {
        int mascara = 0xffffffff << (32 - cidr);
        return String.format("%d.%d.%d.%d",
                (mascara >>> 24) & 0xff,
                (mascara >>> 16) & 0xff,
                (mascara >>> 8) & 0xff,
                mascara & 0xff);
    }
    
    public String calcMascaraBinaria() {
        int mascara = 0xffffffff << (32 - cidr);
        return String.format("%32s", Integer.toBinaryString(mascara)).replace(' ', '0');
    }

    public int calcNumIpsDisponiveis() {
    	if (cidr >= 32) {
    	    return 1;
    	} else {
    	    return (int) Math.pow(2, 32 - cidr);
    	}	
    }
}