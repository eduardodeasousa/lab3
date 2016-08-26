package br.ufjf.lp3;


public class Livro {
    private String titulo;
    private String autor;
    private Integer ano;
    private Integer paginas;
    private Double preco;

    public Livro() {
    }
    
    public Livro(String titulo, Integer ano, Integer paginas, Double preco) {
        this.titulo = titulo;
        this.ano = ano;
        this.paginas = paginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
        @Override
    public String toString() {
        return this.titulo + "\n (" + ano + ") "+ paginas + "pg. R$" + preco;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
