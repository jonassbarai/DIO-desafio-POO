package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public  Curso(){

    }
    @Override
    public double calcularXP() {
        return XP_PADRAO*cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
       super(titulo,descricao);
        this.cargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "titulo='" + getTitulo() + ',' +
                ", descricao='" + getDescricao() + ',' +
                ", cargaHoraria=" + cargaHoraria;
    }
}
