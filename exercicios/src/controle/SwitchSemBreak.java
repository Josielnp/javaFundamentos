package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o tekki shodan");
		case "roxa":
			System.out.println("Sei o heian godan");
		case "verde":
			System.out.println("Sei o heian yodan");
		case "laranja":
			System.out.println("Sei o heian sandan");
		case "vermelha":
			System.out.println("Sei o heian nidan");
		case "amarela":
			System.out.println("Sei o heian nidan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim");
		
		
	}

}
