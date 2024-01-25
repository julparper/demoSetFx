package es.etg.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

    private final static int MIN = -5;
    private final static int MAX = 5;

    private Set<Integer> conjunto;
    private SetType tipo;

    public EjemploSet(SetType tipo){
        this.tipo = tipo;

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

    @Override
    public String toString(){
        String cadena  ="Se está procesando un Conjunto modo: "+ this.tipo + "\n\t";

        cadena+= "datos cargados desde " + MAX + " hasta "+ MIN+"\n\n\t";

        cadena+= "Datos que se han cargado: ";

        for (Integer integer : conjunto) {
            cadena += integer + ", ";
        }


        return cadena;
    }
}
