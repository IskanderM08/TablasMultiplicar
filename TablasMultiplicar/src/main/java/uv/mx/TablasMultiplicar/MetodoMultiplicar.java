package uv.mx.TablasMultiplicar;

public class MetodoMultiplicar {
    public static void imprimirMultiplicacion(int numeroTabla){
        int maximo = 10;
        for (int i = 1; i <= maximo; i++) {
            System.out.println(numeroTabla + " * " + i + " = " + (numeroTabla*i));
        }
    }
}
