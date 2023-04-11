/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Random;

/**
 *
 * @author macha
 */
public class Dialogo {

    static Random rnd = new Random(0);
    public String conteudo;
    public boolean textoSolto;
    public boolean textoFonteDiferente;

    public Dialogo(String conteudo, boolean textoSolto, boolean textoFonteDiferente) {
        this.conteudo = conteudo;//"conteudo" + rnd.nextLong();
        this.textoSolto = textoSolto;//rnd.nextBoolean();
        this.textoFonteDiferente = textoFonteDiferente;//rnd.nextBoolean();
    }

    public String getTexto() {
        StringBuilder retorno = new StringBuilder();
        if (textoSolto) {
            retorno.append("*").append(conteudo).append("*");
        }else{
            retorno.append(conteudo);
        }
        if (textoFonteDiferente) {
            return retorno.toString().toUpperCase();
        }
        if (retorno.length() > 0) {
            retorno.setCharAt(0, Character.toUpperCase(retorno.charAt(0)));
        }
        return retorno.toString();
    }
}
