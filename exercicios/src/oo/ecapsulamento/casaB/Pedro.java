package oo.ecapsulamento.casaB;

import oo.ecapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos () {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		
		//Ana mae = new Ana(); EM CASO DE HERAN�A N�O ESTANCIAR
		
		//System.out.println(mae.segredo); //atributo priviado n�o tem acesso
		//System.out.println(mae.fadoDentroDeCasa);
		System.out.println(formaDeFalar); // ACESSA DIRETO O ATRIBUTO.
		System.out.println(todosSabem);
	}
}
