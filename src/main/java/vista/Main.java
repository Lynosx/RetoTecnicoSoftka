package vista;

import datos.*;
import dominio.*;

public class Main {

    public void insertarPregunta(PreguntaDTO pregunta, RespuestaDTO[] respuesta) {
        PreguntaDaoJDBC preguntas = new PreguntaDaoJDBC();
        preguntas.insertar(pregunta);
        int ultimo = preguntas.ultimoID();

        RespuestaDaoJDBC respuestas = new RespuestaDaoJDBC();
        for (int i = 0; i < respuesta.length; i++) {
            respuesta[i].setPreguntasId(ultimo);
            respuestas.insertar(respuesta[i]);
        }
    }

    public void insertarHistorial(PartidaDTO partida, JugadorDTO jugador) {
        PartidaDaoJDBC partidas = new PartidaDaoJDBC();
        partidas.insertar(partida);
        int ultimo = partidas.ultimoID();

        JugadorDaoJDBC jugadores = new JugadorDaoJDBC();
        jugador.setPartidaId(ultimo);
        jugadores.insertar(jugador);
    }

    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
}
