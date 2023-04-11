/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.util.Stack;
import javax.swing.JFrame;


/**
 *
 * @author macha
 */
public final class WindowStack {
    private static WindowStack instance;
    
    public final Stack<JFrame> stack = new Stack<>();
    
    public static WindowStack getInstance(){
        if(instance == null){
            instance = new WindowStack();
        }
        return instance;
    }
}
