package problema4;

public class Hash {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Mariano", "jose@123.com.br");
        Cliente c2 = new Cliente("Mariano", "jose@1233.com.br");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2); // posicao difentes de memoria, INTERESSANTE.
    }
}
