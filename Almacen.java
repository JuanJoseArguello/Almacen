import java.util.Random;

public class Almacen {
    static int[][] matriz = new int[6][6];
    static Random r = new Random();

    public static void main(String[] args) {
        llenarMatriz();
        mostrarMatriz();
        System.out.println("""
                ==MAPA VISUAL==
                    Valor Símbolo Significado
                    0 . Libre
                    1 E Estándar
                    2 F Frágil
                    3 I Inflamable
                                    """);
        totalesGenerales();

    }

    public static void totalesGenerales() {
        int l = 0;
        int e = 0;
        int f = 0;
        int in = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    l += 1;
                }
                if (matriz[i][j] == 1) {
                    e += 1;
                }
                if (matriz[i][j] == 2) {
                    f += 1;
                }
                if (matriz[i][j] == 3) {
                    in += 1;
                }
            }
        }
        System.out.println("Totales espacios libres: "+l);
        System.out.println("Totales espacios estandar: "+e);
        System.out.println("Totales espacios fragiles: "+f);
        System.out.println("Totales espacios inflamables: "+in);  
        System.out.println("Porcentaje ocupación "+(double)((36-l)/100)+"%");
    }

    public static void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = r.nextInt(4);
            }
        }
    }

    static void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Pasillo " + i + "--> ");
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print(". ");
                }
                if (matriz[i][j] == 1) {
                    System.out.print("E ");
                }
                if (matriz[i][j] == 2) {
                    System.out.print("F ");
                }
                if (matriz[i][j] == 3) {
                    System.out.print("I ");
                }
            }
            System.out.print("\n");
        }
    }
}