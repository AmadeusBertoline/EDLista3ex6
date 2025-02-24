package controller;

public class Fatorial {

	public static double Fatoriall(int n) {
		// Caso base: se n for 0 ou 1, retorna 1
		if (n == 0 || n == 1) {
			return 1;
		}
		// Chamada recursiva: n * fatorial(n - 1)
		return n * Fatoriall(n - 1);
	}

}
