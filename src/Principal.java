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

        //Registrar
        Guerrero guerrero = new Guerrero();
        Mago mago = new Mago();
        Aldeano aldeano = new Aldeano();

        registro.registrarPrototipo("guerrero", guerrero);
        registro.registrarPrototipo("mago", mago);
        registro.registrarPrototipo("aldeano", aldeano);

        //Clonar los personajes
        Personaje guerreroClonado = registro.clonarPersonaje("guerrero");
        Personaje magoClonado = registro.clonarPersonaje("mago");
        Personaje aldeanoClonado = registro.clonarPersonaje("aldeano");

        //atributos predefinidos
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

        //Modificar atributos
        //Guerrero
        guerreroClonado.setNivel(2);
        guerreroClonado.setHabilidades("Repliegue, Contraataque");
        ((Guerrero) guerreroClonado).setFuerza(10);
        ((Guerrero) guerreroClonado).setVidas(3);
        //Mago
        magoClonado.setHabilidades("Hechizo de Hielo");
        magoClonado.setEquipo("Barita de saúco");
        magoClonado.setNivel(3);
        //Aldeano
        aldeanoClonado.setHabilidades("Minero");
        aldeanoClonado.setEquipo("Pico");
        aldeanoClonado.setNivel(2);

        //modificados
        //Guerrero
        System.out.println("\n ** Guerrero (modificado) **");
        System.out.println("Nombre: " + guerreroClonado.getNombre());
        System.out.println("Nivel: " + guerreroClonado.getNivel());
        System.out.println("Habilidades: " + guerreroClonado.getHabilidades());
        System.out.println("Equipo: " + guerreroClonado.getEquipo());
        System.out.println("Fuerza: " + "+" + ((Guerrero) guerreroClonado).getFuerza());
        System.out.println("Vidas: " + "+" + ((Guerrero) guerreroClonado).getVidas());

        //Mago
        System.out.println("\n ** Mago (modificado) **");
        System.out.println("Nombre: " + magoClonado.getNombre());
        System.out.println("Nivel: " + "+" + magoClonado.getNivel());
        System.out.println("Habilidades: " + magoClonado.getHabilidades());
        System.out.println("Equipo: " + magoClonado.getEquipo());

        //Aldeano
        System.out.println("\n ** Aldeano (modificado) **");
        System.out.println("Nombre: " + aldeanoClonado.getNombre());
        System.out.println("Nivel: " + "+" + aldeanoClonado.getNivel());
        System.out.println("Habilidades: " + aldeanoClonado.getHabilidades());
        System.out.println("Equipo: " + aldeanoClonado.getEquipo());
    }
}
