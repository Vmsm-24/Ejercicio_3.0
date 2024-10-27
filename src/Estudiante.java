public class Estudiante {
    //Atributos
    private String nombre;
    private String edad;
    private String genero;

    //Constructores
    public Estudiante(){

    }

    public Estudiante(String nombre, String edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //Métodos propios

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Métodos propios del programador
    public String detalleEstu(String nombre, String edad, String genero){
        String estu = "El nombre del estudiante es -> " + this.nombre + "\n" +
                "La edad delestudiante es -> " + this.edad + "\n" +
                "El género del estudiante es -> " + this.genero;
        return estu;
    }
}
