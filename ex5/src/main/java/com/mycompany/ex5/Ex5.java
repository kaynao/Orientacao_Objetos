package com.mycompany.ex5;

/**
 *
 * @author kayna
 */

import java.util.Map;
import java.util.HashMap;

public class Ex5 {
    public static void main(String[] args) {
        
        Map<String,Integer> placar = new HashMap<>();
        
        placar.put("Marcelo",67);
        placar.put("Kaynã",10);
        placar.put("Henry",90);
        
        placar.put("Kaynã",placar.get("Kaynã")+ 10);
        
        String campeao = "";
        int maiorPontuacao = -1;
        
        for(Map.Entry<String, Integer>jogador:placar.entrySet()){
            if(jogador.getValue() > maiorPontuacao){
                maiorPontuacao = jogador.getValue();
                campeao =  jogador.getKey();
            }
        }
        System.out.println("O Maior pontuador eh: " + campeao + " com " + maiorPontuacao);
        System.out.println(placar.get("Kaynã"));
    }
}
