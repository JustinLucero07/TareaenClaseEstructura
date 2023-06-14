/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.pilas.colas;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class PilaTarea<T> {
    
    private Stack<Tarea<T>> pilaTarea;

    public PilaTarea() {
        pilaTarea = new Stack<>();
    }
    
    
    public void agregarTarea(Tarea<T> tarea){
        pilaTarea.push(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        return pilaTarea.pop();
    }
    
    public boolean estaVaci(){
        return pilaTarea.isEmpty();
    }
    
}
