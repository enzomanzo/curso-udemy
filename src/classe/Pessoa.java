package classe;

public class Pessoa {

    //peso e nome

    private double peso;
    private String nome;

    Pessoa(double peso,String nome){
        this.nome = nome;
        this.peso = peso;
    }


    public void comer(Comida comida){
        if (comida != null) {
            this.peso = this.peso + comida.getPeso();
        }
    }



    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
