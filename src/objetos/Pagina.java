/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.HashMap;

/**
 *
 * @author macha
 */
public class Pagina {

    public Integer nrQuadros;
    public boolean isVazia;
    public Integer quadrosIndex;
    private final HashMap<Integer, Quadro> quadros;
    public Integer ultimoQuadro = 0;

    public Pagina(Integer nrQuadros, boolean isVazia) {
        this.nrQuadros = nrQuadros;
        this.isVazia = isVazia;
        this.quadrosIndex = 0;
        this.quadros = new HashMap<>(nrQuadros);
        quadros.put(quadrosIndex, new Quadro(1));
    }

    public Quadro quadro() {
        return quadros.get(quadrosIndex);
    }

    public Quadro proximaQuadro() {
        quadrosIndex++;
        if (!quadros.containsKey(quadrosIndex)) {
            quadros.put(quadrosIndex, new Quadro(1));
        }
        ultimoQuadro = ultimoQuadro > quadrosIndex ? ultimoQuadro : quadrosIndex;
        return quadros.get(quadrosIndex);
    }

    public Quadro anteriorQuadro() {
        quadrosIndex--;
        if (!quadros.containsKey(quadrosIndex)) {
            quadrosIndex++;
        }
        return quadros.get(quadrosIndex);
    }

    public String exibirPagina() {
        StringBuilder sb = new StringBuilder();
        for (Integer value : quadros.keySet()) {
            sb.append(quadros.get(value).exibirQuadro()).append("<br>");
        }
        return sb.toString();
    }

}
