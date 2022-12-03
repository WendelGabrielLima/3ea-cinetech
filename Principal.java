package ea3;

import javax.swing.JOptionPane;

public class Principal {

	;

	public static void main(String[] args) {
		
		Filmes filme1 = new Filmes("1 - Adão Negro", "Jaume Collet-Serra", "Adão Negro é o filme solo do anti-herói, baseado no personagem em quadrinhos Black Adam (Dwayne Johnson) da DC Comics, grande antagonista de Shazam!, tendo no longa, sua história de origem explorada, e revelando seu passado de escravo no país Kahndaq.", "Ação e Aventura", "2h05min", true);
		Filmes filme2 = new Filmes("2 - Mulher Rei", "Gina Prince-Bythewood", "A Mulher Rei acompanha Nanisca (Viola Davis) que foi uma comandante do exército do Reino de Daomé, um dos locais mais poderosos da África nos séculos XVII e XIX.", "Histórico e Drama", "2h15min", true);
		Filmes filme3 = new Filmes("3 - Não, Não Olhe!", "Jordan Peele", "Novo filme de terror do diretor Jordan Peele (Corra e Nós). Em Não! Não Olhe! uma cidade do interior da Califórnia começa a ter eventos bizarros e extraterrestres.", "Terror e Ficção Científica", "2h10min", true);
		
		JOptionPane.showMessageDialog(null, "Geek, seja bem vindo ao seu Cinema Tecnológico, o CineTech!");
		JOptionPane.showMessageDialog(null, "Para melhor entendimento, parte da nossa comunicação se dará pelo terminal!");
		System.out.println("------------------------ +++ CineTech +++ ------------------------");
		System.out.println("Bem, no dia de hoje temos os seguintes filmes em cartaz para você: ");
		System.out.println(filme1);
		System.out.println("==================================================================================================");
		System.out.println(filme2);
		System.out.println("==================================================================================================");
		System.out.println(filme3);
		System.out.println("==================================================================================================");
		JOptionPane.showMessageDialog(null, "Confira essa nossa grande novidade: Filmes 3D chegaram ao CineTech!");
		JOptionPane.showMessageDialog(null, "Os filmes que estão em cartaz com salas de 3D são: " + filme1.getNome()+ " e " + filme2.getNome() + " e " + filme3.getNome());
		
		int escolha;
		escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do filme correspondente que você deseja assistir!"));
		
		if (escolha == 1)
			JOptionPane.showConfirmDialog(null, "Certo, você escolheu o seguinte filme: " + filme1.getNome() + ", confirma?");
		else if (escolha == 2)
			JOptionPane.showConfirmDialog(null, "Certo, você escolheu o seguinte filme: " + filme2.getNome() + ", confirma?");
		else if (escolha == 3)
			JOptionPane.showConfirmDialog(null, "Certo, você escolheu o seguinte filme: " + filme3.getNome() + ", confirma?");
		JOptionPane.showMessageDialog(null, "Ok, vamos para a compra dos ingressos?");
		JOptionPane.showInputDialog(null, "Digite o número da sala que deseja para ir assistir: Sala 1 - 14h00min, Sala 2 - 17h50min e Sala 3 - 21h15min.");
		JOptionPane.showMessageDialog(null, "Legal! Vamos agora para a compra dos ingressos?");
		JOptionPane.showMessageDialog(null, "Os ingressos disponíveis para esse filme são: VIP (Inteira - R$48 e Meia Entrada - R$24) e Casual (Inteira - R$24 e Meia Entrada - R$12)!");
		
		int vipinteira;
		int vipmeia;
		int inteira;
		int meiaentrada;
		
		vipinteira = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo 'VIP - Inteira' você irá comprar para essa sessão?"));
		vipmeia = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo 'VIP - Meia Entrada' você irá comprar para essa sessão?"));
		inteira = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo 'Casual - Inteira' você irá comprar para essa sessão?"));
		meiaentrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos ingressos do tipo 'Casual - Meia Entrada' você irá comprar para essa sessão?"));
		JOptionPane.showConfirmDialog(null, "Você selecionou " + (vipinteira + vipmeia) + " ingressos do tipo VIP, e " + (inteira + meiaentrada) + "do tipo Casual?");
		int valor;
		valor = (vipinteira*48)+(vipmeia*24)+(inteira*24)+(meiaentrada*12);
		JOptionPane.showConfirmDialog(null, "Certo, o valor total dos ingressos deu: R$"+valor+ ", confirma?");
		JOptionPane.showMessageDialog(null, "Ótimo! Seu ticket está sendo gerado no terminal. Por favor, pegue o seu ticket e vá para o caixa confirmar o pagamento e seu lugar na sessão!");
		JOptionPane.showMessageDialog(null, "O CineTech agradece pela sua preferência e deseja um ótima filme!");
		
		
		
		
	
		
		
	}
	}


