package tabla;

public class tablademultiplicar {
    public static void main(String[] args) {
        int tabla = 3;
        int first = 1;

        System.out.println("Tabla del: " + tabla);
        System.out.println("**********************************");

        for (int i = 1; i <= 10; i++) {
            if (first == 1) {
                System.out.println(i + " * " + i + " = " + i * i);
                first++;
                i--;
            } else {
                System.out.println(tabla + " * " + i + " = " + tabla * i);
            }
        }
        System.out.println("..........................");
    }
}
