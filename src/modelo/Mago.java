/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author davidvargas
 */
public class Mago extends Personaje {
    private String tipoEncanto;

    public Mago() {
        // Constructor
    }

    public Mago(Mago mago) {
        this.tipoEncanto = mago.tipoEncanto;
    }

    @Override
    public Personaje clonar() {
        return new Mago(this);
    }

    // Getters y setters

    public String getTipoEncanto() {
        return tipoEncanto;
    }

    public void setTipoEncanto(String tipoEncanto) {
        this.tipoEncanto = tipoEncanto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
