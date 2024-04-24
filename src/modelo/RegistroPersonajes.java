/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author davidvargas
 */
public class RegistroPersonajes {
    private Map<String, Personaje> prototipos;

    public RegistroPersonajes() {
        prototipos = new HashMap<>();
    }

    public void registrarPrototipo(String tipo, Personaje personaje) {
        prototipos.put(tipo, personaje);
    }

    public Personaje clonarPersonaje(String tipo) {
        Personaje prototipo = prototipos.get(tipo);
        if (prototipo != null) {
            return prototipo.clonar();
        }
        return null;
    }

    // Otros métodos para agregar y clonar personajes
}
