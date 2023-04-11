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
public class DadosGerais {

    public String obra;
    public String scan;
    public String tradutor;
    public String capitulo;
    public Integer nrPaginas;
    public Integer paginaIndex;
    public Integer ultimaPagina = 0;
    private final HashMap<Integer, Pagina> paginas;

    public DadosGerais(String obra, String scan, String tradutor, String capitulo, Integer nrPaginas) {
        this.obra = obra;
        this.scan = scan;
        this.tradutor = tradutor;
        this.capitulo = capitulo;
        this.nrPaginas = nrPaginas;
        this.paginaIndex = 0;
        this.paginas = new HashMap<>(nrPaginas);
        paginas.put(paginaIndex, new Pagina(1, false));

    }

    public String getWorkingArea() {
        return obra.substring(0, obra.length() > 10 ? 10 : obra.length())
                + " Ch." + capitulo;
    }

    public Pagina pagina() {
        return paginas.get(paginaIndex);
    }

    public Pagina proximaPagina() {
        paginaIndex++;
        if (!paginas.containsKey(paginaIndex)) {
            paginas.put(paginaIndex, new Pagina(nrPaginas, false));
        }
        ultimaPagina = ultimaPagina > paginaIndex ? ultimaPagina : paginaIndex;
        return paginas.get(paginaIndex);
    }

    public Pagina anteriorPagina() {
        paginaIndex--;
        if (!paginas.containsKey(paginaIndex)) {
            paginaIndex++;
        }
        return paginas.get(paginaIndex);
    }

    public String exibirCapitulo() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(obra).append("]").append("<br>");
        sb.append("Scan:").append(scan).append("<br>");
        sb.append("Tradutor: ").append(tradutor).append("<br><br>");
        for (Integer value : paginas.keySet()) {
            String exibirPagina = paginas.get(value).exibirPagina();
            sb.append("<font size=5><b>Pg")
                    .append(value + 1)
                    .append("<br></b></font>");

            if (exibirPagina.isBlank()) {
                sb.append("[sem dialogo]");
            } else {
                sb.append(exibirPagina);
            }
            sb.append("<br><br>");
        }
        return sb.toString();
    }

}
