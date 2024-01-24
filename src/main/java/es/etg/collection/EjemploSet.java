package es.etg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

    private final static int MIN = -5;
    private final static int MAX = 5;

    private Set<Integer> conjunto;

    public EjemploSet(SetType tipo){

        if(tipo == SetType.HASH)
            conjunto = new HashSet<Integer>();
        else if(tipo == SetType.LINK)
            conjunto = new LinkedHashSet<Integer>();
        else
            conjunto = new TreeSet<Integer>();

        // Cargo los datos en el conjutno.
        cargarDatos();
    }

    

    private void cargarDatos(){

        for(int i=MAX; i>MIN; i--){
            conjunto.add(i);
        }

    }
}
