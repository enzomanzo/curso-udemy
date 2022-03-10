package classe;

public class Comida {

    // peso e nome comida

    private double peso;
    private String comida;

    Comida(double peso,String comida){
        this.comida = comida;
        this.peso = peso;
    }
    Comida(){

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
