public class ArrayUtils {
    // ==================== NIVEL BÁSICO ====================

    public static boolean validarNota(double nota) {
        return (nota >= 0 && nota <= 10);
    }

    public static void mostrarDatos(String[] nombres, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d. %s: %.2f%n", i + 1, nombres[i], notas[i]);
        }
    }

    public static double calcularMedia(double[] notas) {

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;
        return media;
    }

    // ==================== NIVEL INTERMEDIO ====================

    public static double buscarMaximo(double[] notas) {

        double max = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }

    public static double buscarMinimo(double[] notas) {

        double min = 10;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        return min;
    }

    public static int buscarPosicionNota(double[] notas, double valor) {

        int posición = -1;
        for (int i = 0; i < notas.length && posición == -1; i++) {
            if (notas[i] == valor) {
                posición = i;
            }
        }
        return posición;
    }
    
    public static int contarAprobados(double[] notas) {

        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    // ==================== NIVEL AVANZADO ====================

    public static int buscarPosicionNombre(String[] nombres, String nombre) {

         int posición = -1;
        for (int i = 0; i < nombres.length && posición == -1; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                posición = i;
            }
        }
        return posición;
    }

    public static void ordenarBurbuja(String[] nombres, double[] notas) {
        // TODO: Implementar
        // - Ordenar por nota de menor a mayor usando burbuja
        // - IMPORTANTE: Al intercambiar notas, también intercambiar nombres
        // - Así se mantiene la correspondencia entre arrays
    }
}
