package ea3;
public class Ingressos {
	public boolean vip = false;
	public String sessao1 = "14h00min";
	public String sessao2 = "17h50min";
	public String sessao3 = "21h15min";
	private int entrada = 24;
	private int meiaentrada = 12;
	
	
	public String getSessao1() {
		return sessao1;
	}

	public void setSessao1(String sessao1) {
		this.sessao1 = sessao1;
	}

	public String getSessao2() {
		return sessao2;
	}

	public void setSessao2(String sessao2) {
		this.sessao2 = sessao2;
	}

	public String getSessao3() {
		return sessao3;
	}

	public void setSessao3(String sessao3) {
		this.sessao3 = sessao3;
	}

	public void acessoLanchonete() {
		System.out.println("Compre um IngressoVIP para ter acesso a lanchonete!");
	}

	public int getEntrada() {
		return entrada;
	}
	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}
	public int getMeiaentrada() {
		return meiaentrada;
	}
	public void setMeiaentrada(int meiaentrada) {
		this.meiaentrada = meiaentrada;
	}
	
	Ingressos ingressonormal = new Ingressos();
	
	
	
	public class IngressosVip extends Ingressos{
		public int entrada = 48;
		public int meiaentrada = 24;
		public void acessoLanchonete() {
			System.out.println("Lanchonete liberada, aproveite!");
			
		}
		
		
	}
}
