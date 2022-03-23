package classe;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		//pi = 3.14;
		raio = raioInicial;
	}

	double area() {
		//return pi * Math.pow(raio, 2); // pi * raio ao quadrado
		return PI * Math.pow(raio, 2); // pi * raio ao quadrado
	}
}
