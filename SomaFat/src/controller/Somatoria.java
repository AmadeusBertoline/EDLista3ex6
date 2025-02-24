package controller;

public class Somatoria {
	public double Somatoria(int n) {
		// Caso base: se n for 1, retorna 1
		if (n == 1) {
			return 1;
		}
		// Chamada recursiva: 1/n! + somatoria(n - 1)
		return 1.0 / Fatorial.Fatoriall(n) + Somatoria(n - 1);
	}

}
