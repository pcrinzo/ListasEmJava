package lista.java;

public class Main {

    public static void main(String[] args) {


        Lista<String> minhaListaEncadeada=new Lista<>();


        minhaListaEncadeada.add("n1");
        minhaListaEncadeada.add("n2");
        minhaListaEncadeada.add("n3");
        minhaListaEncadeada.add("n4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        System.out.println(minhaListaEncadeada);

        //Remove from position 1 (n2)
        System.out.println(minhaListaEncadeada.remove(1));
        System.out.println(minhaListaEncadeada);


    }
}
