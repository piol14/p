public class Persona {
private String nombre;
private int edad;
public Persona(String nombre, int edad){
this.nombre = nombre;
this.edad = edad;
}
//getters and setters

public void imprimirDatos() {
System.out.println("Nombre: " +
nombre);
System.out.println("Edad: " + edad);
}