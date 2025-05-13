package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Interestelar", 2014);
        miPelicula.setDuracionEnMinutos(169);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.6);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        Serie greysAnatomy = new Serie("Grey's anatomy", 2005);
        greysAnatomy.setTemporadas(21);
        greysAnatomy.setMinutosPorEpisodio(45);
        greysAnatomy.setEpisodiosPorTemporada(25);
        greysAnatomy.muestraFichaTecnica();
        System.out.println(greysAnatomy.getDuracionEnMinutos());


        Pelicula otraPelicula = new Pelicula("Capitán América: El primer vengador", 2011);
        otraPelicula.setDuracionEnMinutos(124);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(greysAnatomy);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos estas vacaciones "
                + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La noche de un día difícil");
        episodio.setSerie(greysAnatomy);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula>listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());



    }




    }

