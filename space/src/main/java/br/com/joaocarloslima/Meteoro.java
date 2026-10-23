package br.com.joaocarloslima;

public class Meteoro extends Asset {

    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x,y,velocidade,direcao);
        this.tamanho = new java.util.Random().nextInt(8) + 1;
        this.poder = tamanho;
    }

    public void tomarTiro(Tiro tiro){
        poder -= tiro.getPoder();
    }
}
