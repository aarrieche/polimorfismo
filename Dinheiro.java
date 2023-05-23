public class Dinheiro {
    private int centavos;

    public Dinheiro() {
        this.centavos = 0; 
    }

    int getReais(){
        return centavos/100;
    }

    int getCentavos(){
        return centavos%100;
    }

    public Dinheiro(int reais, int centavos) { // 5, 13 = 513
        this.centavos = centavos + reais * 100;
    }

    public Dinheiro(Dinheiro dinheiro) {
        this.centavos = dinheiro.centavos;
    }

    public Dinheiro(int reais) {
        this.centavos = reais * 100;
    }

    public Dinheiro(String s) {
        String [] parte = s.replace("R$", "").replace(" ","").replace(".","").split(",");
        int reais = Integer.parseInt(parte[0]);
        int centavos = Integer.parseInt(parte[1]);
        this.centavos = reais * 100 + centavos;

        
    }

    public Dinheiro(double d) {
        this.centavos = (int) (d * 100);
    }

    public void somar(Dinheiro d) {
        this.centavos += d.centavos;
    }

    

}
