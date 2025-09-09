import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Librito librito1 = new Librito("El Quijote", "Cervantes", 3, 1);

        
        Scanner sc = new Scanner(System.in);
        Librito librito2 = new Librito();
        System.out.print("Título: ");
        librito2.setTitulo(sc.nextLine());
        System.out.print("Autor: ");
        librito2.setAutor(sc.nextLine());
        System.out.print("Número de ejemplares: ");
        librito2.setNumEjemplares(sc.nextInt());


        System.out.println(librito1);
        System.out.println("Préstamo librito1: " + librito1.prestar());
        System.out.println("Devolución librito1: " + librito1.devolver());

        System.out.println(librito2);
        System.out.println("Préstamo librito2: " + librito2.prestar());
        System.out.println("Devolución librito2: " + librito2.devolver());
    }
}
