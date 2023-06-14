/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructura.pilas.colas;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class EstructuraPilasColas {

    public static void main(String[] args) {
        
        //Instancias de las clases
        ColaTarea<String> colaTareas = new ColaTarea<>();
        ColaTarea<Integer> colasTareasInt = new ColaTarea<>();
        ColaTarea<String[]> colaTareasArreglo = new ColaTarea<>();
        ColaTarea<int[]> colaTareasArregloEnteros = new ColaTarea<>();
        
        //Clases pila tarea
        PilaTarea<Integer> pilasTarea = new PilaTarea<>();
        PilaTarea<String> pilasTareastring = new PilaTarea<>();
        PilaTarea<String[]> pilasTareaarreglo = new PilaTarea<>();
        PilaTarea<int[]> pilasTareaarregloenteros = new PilaTarea<>();
        PilaTarea<ColaTarea> pilasTareaColas = new PilaTarea<>();
        
        
        pilasTareaColas.agregarTarea(new Tarea(111,111));
        System.out.println("COLAS");
        System.out.println("COLAS STRINGS");
        
        //Insercion de tareas a la cola
        colaTareas.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTareas.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTareas.agregarTarea(new Tarea(4, "Tarea 5"));
        
        //Procesar las tareas de la Cola<String>
        while(!colaTareas.estaVaci()){
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaProcesada.getId() + tareaProcesada.getAtributo());
        }
        
        System.out.println("COLAS ENTEROS");
        colasTareasInt.agregarTarea(new Tarea(1,1));
        colasTareasInt.agregarTarea(new Tarea(2,2));
        colasTareasInt.agregarTarea(new Tarea(3,3));
        colasTareasInt.agregarTarea(new Tarea(4,4));
        colasTareasInt.agregarTarea(new Tarea(5,5));
        
        while(!colasTareasInt.estaVaci()){
            Tarea<Integer> tareapro = colasTareasInt.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareapro.getId() + tareapro.getAtributo());
        }        
        
        System.out.println("COLAS ARREGLOS STRINGS");
        colaTareasArreglo.agregarTarea(new Tarea(1,new String[]{"a","b"}));
        colaTareasArreglo.agregarTarea(new Tarea(2,new String[]{"c","d"}));
        colaTareasArreglo.agregarTarea(new Tarea(3,new String[]{"e","f"}));
        
        while(!colaTareasArreglo.estaVaci()){
            Tarea<String[]> tareaproc = colaTareasArreglo.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaproc.getId() + Arrays.toString(tareaproc.getAtributo()));
        } 
        
        
        System.out.println("COLAS ARREGLOS ENTEROS");
        colaTareasArregloEnteros.agregarTarea(new Tarea(1,new int[]{12,23}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(2,new int[]{45,65}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(3,new int[]{77,88}));
        
        while(!colaTareasArregloEnteros.estaVaci()){
            Tarea<int[]> tareaproce = colaTareasArregloEnteros.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaproce.getId() + Arrays.toString(tareaproce.getAtributo()));
        }
        
        System.out.println("PILAS");
        System.out.println("PILAS ENTEROS");
        //Insercion de tareas a la pila
        pilasTarea.agregarTarea(new Tarea(11,11));
        pilasTarea.agregarTarea(new Tarea(22,22));
        pilasTarea.agregarTarea(new Tarea(33,33));
        pilasTarea.agregarTarea(new Tarea(44,44));
        pilasTarea.agregarTarea(new Tarea(55,55));
        
        while(!pilasTarea.estaVaci()){
            Tarea<Integer> tare = pilasTarea.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tare.getId() + tare.getAtributo());
        }
        
        System.out.println("PILAS  STRINGS");
        pilasTareastring.agregarTarea(new Tarea(1,"xd"));
        pilasTareastring.agregarTarea(new Tarea(2,"xd1"));
        pilasTareastring.agregarTarea(new Tarea(3,"xd2"));
        
        
        while(!pilasTareastring.estaVaci()){
            Tarea<String> tarea = pilasTareastring.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea.getId() + tarea.getAtributo());
        }
        
        System.out.println("PILAS ARREGLO STRINGS");
        pilasTareaarreglo.agregarTarea(new Tarea(1,new String[]{"x","y"}));
        pilasTareaarreglo.agregarTarea(new Tarea(2,new String[]{"z","a"}));
        pilasTareaarreglo.agregarTarea(new Tarea(3,new String[]{"c","x"}));
        
        while(!pilasTareaarreglo.estaVaci()){
            Tarea<String[]> tarea1 = pilasTareaarreglo.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea1.getId() + Arrays.toString(tarea1.getAtributo()));
        }
        
        System.out.println("PILAS ARREGLO ENTEROS");
        pilasTareaarregloenteros.agregarTarea(new Tarea(1,new int[]{77,88}));
        pilasTareaarregloenteros.agregarTarea(new Tarea(2,new int[]{99,00}));
        pilasTareaarregloenteros.agregarTarea(new Tarea(3,new int[]{11,22}));
        
        while(!pilasTareaarregloenteros.estaVaci()){
            Tarea<int[]> tarea2 = pilasTareaarregloenteros.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea2.getId() + Arrays.toString(tarea2.getAtributo()));
        }
        
        pilasTareaColas.agregarTarea(new Tarea(1,colaTareas));
        
        while(!pilasTareaColas.estaVaci()){
            Tarea<ColaTarea> tarea3 = pilasTareaColas.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea3.getId() + tarea3.getAtributo());
        }
    }
}
