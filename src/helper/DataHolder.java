/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.util.Stack;
import javax.swing.JFrame;
import objetos.DadosGerais;

/**
 *
 * @author macha
 */
public class DataHolder {

    private static DataHolder instance;

    public DadosGerais dadosGerais = null;

    public static DataHolder getInstance() {
        if (instance == null) {
            instance = new DataHolder();
        }
        return instance;
    }
}
