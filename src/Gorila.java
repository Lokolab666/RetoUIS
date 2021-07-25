public class Gorila {
    protected double peso;
    protected double altura;
    protected Alimento[] alimsIngeridos;
    private double pesoAlims;
    private double IMC;
    private Alimento totalalimentos;
    private  double pesoTotal;

    public Gorila(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Alimento[] getAlimsIngeridos() {
        return alimsIngeridos;
    }

    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        for (int i = 0; i < alimsIngeridos.length; i++ ){
            pesoTotal += alimsIngeridos[i].getGramos();
        }
        this.alimsIngeridos = alimsIngeridos;
    }

    public double getPesoAlims() {
        pesoAlims = pesoTotal;
        return pesoAlims;
    }

    public void setPesoAlims(double pesoAlims) {
        this.pesoAlims = pesoAlims;
    }

    public double getIMC() {
        double numberImc;
        numberImc = peso / Math.pow(altura, 2);
        IMC = numberImc;
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
}
