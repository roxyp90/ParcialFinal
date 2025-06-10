public class Ejercicio {

    public static int contarEstudiantesAprobados(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota >= 60) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioNotasAltas(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int[] fila : matriz) {
            for (int nota : fila) {
                if (nota >= 80) {
                    suma += nota;
                    contador++;
                }
            }
        }
        return (contador > 0) ? (double) suma / contador : 0.0;
    }

   public static void imprimirNotasBajas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 50) {
                    System.out.println("Nota baja en [" + i + "][" + j + "]: " + matriz[i][j] + " puntos");
                }
            }
        }
    }
    
    public static int[] posicionNotaMaxima(int[][] matriz) {
        int max = Integer.MIN_VALUE;
        int[] posicion = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
}

