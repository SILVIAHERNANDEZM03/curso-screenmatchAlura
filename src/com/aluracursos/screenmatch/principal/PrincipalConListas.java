package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Interestelar", 2014);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Capitán América: El primer vengador", 2011);
        otraPelicula.evalua(7);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.evalua(6);
        Serie greysAnatomy = new Serie("Grey's anatomy", 2005);

        Pelicula p1 = peliculaDeBruno;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(greysAnatomy);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if(item instanceof  Pelicula pelicula && pelicula.getClasificable() > 2){
                System.out.println(pelicula.getClasificable());

            }
        }

        List<String> listaDeArtistas = new LinkedList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        System.out.println("Lista de artista no ordenada: " + listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artista ordenada: " + listaDeArtistas);
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+ lista);

    }
}
