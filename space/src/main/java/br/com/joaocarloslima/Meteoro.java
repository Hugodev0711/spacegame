package br.com.joaocarloslima;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {

    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x,y,velocidade,direcao);
        this.tamanho = new java.util.Random().nextInt(8) + 1;
        this.poder = tamanho;

        String path = "images/meteoro/meteoro" + tamanho + ".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);
    }

    public void tomarTiro(Tiro tiro){
        poder -= tiro.getPoder();
    }
    public int getPoder(){return poder;}
}
