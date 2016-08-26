
package br.ufjf.lp3;


public class Revisao {

    public static void main(String[] args) {
        Livro l1 = new Livro("Java como programar", 1967, 50, 127.45F);
        Livro l2 = new Livro("Java como programar: O retorno", 1972, 56, 73.45F);
        System.out.println("Livros disponiveis: ");
        System.out.print(l1.getTitulo());
        System.out.println(" (" + l1.getAno() +") ");
        System.out.println(l1.getPaginas()+" pgs");
        System.out.println("R$"+l1.getPreco());
        System.out.printf("%s\n (%d) %d R$%.2f \n", l2.getTitulo(),l2.getAno(),l2.getPaginas(),l2.getPreco());
        System.out.println(l2);
        
    }
    
}
