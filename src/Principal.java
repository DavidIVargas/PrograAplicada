
import modelo.Aldeano;
import modelo.Guerrero;
import modelo.Mago;
import modelo.Personaje;
import modelo.RegistroPersonajes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author davidvargas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroPersonajes registro = new RegistroPersonajes();

        // Paso 2: Registrar los prototipos
        Guerrero guerrero = new Guerrero();
        Mago mago = new Mago();
        Aldeano aldeano = new Aldeano();

        registro.registrarPrototipo("guerrero", guerrero);
        registro.registrarPrototipo("mago", mago);
        registro.registrarPrototipo("aldeano", aldeano);

        // Paso 3: Clonar los personajes
        Personaje guerreroClonado = registro.clonarPersonaje("guerrero");
        Personaje magoClonado = registro.clonarPersonaje("mago");
        Personaje aldeanoClonado = registro.clonarPersonaje("aldeano");

        // Paso 4: Imprimir los atributos predefinidos
        System.out.println("\n ** Guerrero **");
        System.out.println("Nombre: " + guerreroClonado.getNombre());
        System.out.println("Nivel: " + guerreroClonado.getNivel());
        System.out.println("Habilidades: " + guerreroClonado.getHabilidades());
        System.out.println("Equipo: " + guerreroClonado.getEquipo());
        System.out.println("Fuerza: " + ((Guerrero) guerreroClonado).getFuerza());
        System.out.println("Vidas: " + ((Guerrero) guerreroClonado).getVidas());

        System.out.println("\n ** Mago **");
        System.out.println("Nombre: " + magoClonado.getNombre());
        System.out.println("Nivel: " + magoClonado.getNivel());
        System.out.println("Habilidades: " + magoClonado.getHabilidades());
        System.out.println("Equipo: " + magoClonado.getEquipo());
        
        System.out.println("\n ** Aldeano **");
        System.out.println("Nombre: " + aldeanoClonado.getNombre());
        System.out.println("Nivel: " + aldeanoClonado.getNivel());
        System.out.println("Habilidades: " + aldeanoClonado.getHabilidades());
        System.out.println("Equipo: " + aldeanoClonado.getEquipo());
        
        // Paso 5: Modificar atributos
        guerreroClonado.setNivel(2);
        guerreroClonado.setHabilidades("Ataque, Defensa");
        ((Guerrero) guerreroClonado).setFuerza(10);
        ((Guerrero) guerreroClonado).setVidas(3);

        // Paso 6: Imprimir los atributos modificados
        System.out.println("\n ** Guerrero (modificado) **");
        System.out.println("Nombre: " + guerreroClonado.getNombre());
        System.out.println("Nivel: " + guerreroClonado.getNivel());
        System.out.println("Habilidades: " + guerreroClonado.getHabilidades());
        System.out.println("Equipo: " + guerreroClonado.getEquipo());
        System.out.println("Fuerza: " + ((Guerrero) guerreroClonado).getFuerza());
        System.out.println("Vidas: " + ((Guerrero) guerreroClonado).getVidas());

        System.out.println("\n ** Mago (modificado) **");
        System.out.println("Nombre: " + magoClonado.getNombre());
        System.out.println("Nivel: " + magoClonado.getNivel());
        System.out.println("Habilidades: " + magoClonado.getHabilidades());
        System.out.println("Equipo: " + magoClonado.getEquipo());
        
        System.out.println("\n ** Aldeano (modificado) **");
        System.out.println("Nombre: " + aldeanoClonado.getNombre());
        System.out.println("Nivel: " + aldeanoClonado.getNivel());
        System.out.println("Habilidades: " + aldeanoClonado.getHabilidades());
        System.out.println("Equipo: " + aldeanoClonado.getEquipo());
    }
}
