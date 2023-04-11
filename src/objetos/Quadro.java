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
public class Quadro {

    public Integer nrDialogos;
    public Integer dialogosIndex;
    private final HashMap<Integer, Dialogo> dialogos;
    public Integer ultimoDialogo = 0;

    public Quadro(Integer nrDialogos) {
        this.nrDialogos = nrDialogos;
        this.dialogosIndex = 0;
        this.dialogos = new HashMap<>(nrDialogos);
        dialogos.put(dialogosIndex, new Dialogo("", false, false));
    }

    public Dialogo dialogo() {
        return dialogos.get(dialogosIndex);
    }

    public Dialogo proximaDialogo() {
        dialogosIndex++;
        if (!dialogos.containsKey(dialogosIndex)) {
            dialogos.put(dialogosIndex, new Dialogo("", false, false));
        }
        ultimoDialogo = ultimoDialogo > dialogosIndex ? ultimoDialogo : dialogosIndex;
        return dialogos.get(dialogosIndex);
    }

    public Dialogo anteriorDialogo() {
        dialogosIndex--;
        if (!dialogos.containsKey(dialogosIndex)) {
            dialogosIndex++;
        }
        return dialogos.get(dialogosIndex);
    }

        public String exibirQuadro() {
        StringBuilder sb = new StringBuilder();
        for (Integer value : dialogos.keySet()) {
            if(dialogos.get(value).conteudo.isBlank())continue;
            sb.append(dialogos.get(value).getTexto()).append("<br>");
        }
        return sb.toString();
    }
    
}
