package controller_somatoria;

public class Somatoria {
	
    public static int calcularSomatorio(int n) {
        // Condição de parada deve retornar 0 para números negativos
        if (n <= 0) {
            return 0;
        }
        // Relação de chamada onde há a somatória de n + somatória dos (n-1) anteriores
        return n + calcularSomatorio(n - 1);
    }
}
