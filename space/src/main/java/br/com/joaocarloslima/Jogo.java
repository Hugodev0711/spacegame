package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {
    public List<Asset> assets = new ArrayList<>();
    public Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);
    private int pontos;
    private int nivel = 1;

    public Tiro atirar(){
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro(){
        int x = new Random().nextInt(590)+1;
        Meteoro meteoro = new Meteoro(x, 0, 10, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public void pontuar(){
        pontos += 1;
        if(pontos == 10){
            pontos = 0;
            if(nivel != 4){
                nivel += 1;
            }
        }
    }

    public int getPontos(){return pontos;}
    public int getNivel(){return nivel;}
}
