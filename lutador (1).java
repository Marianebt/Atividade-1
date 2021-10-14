public class lutador{
    String nome;
    String energia;
    String força;
    
    public lutador(String nome, int energia, int força){
        this.nome = nome;
        this.energia = energia;
        this.força = força;
    }
    public void aplicarGolpe(String nome){
        reduzirEnergia(força);
    }
    public int reduzirEnergia(int força){
        energia = energia - força;
        return energia;
    }
}