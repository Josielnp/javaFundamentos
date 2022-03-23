package oo.ecapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos () {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		
		//System.out.println(esposa.segredo); atributo priviado não tem acesso
		System.out.println(esposa.fadoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}

}
