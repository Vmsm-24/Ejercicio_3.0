public class Universidad {
    //Atributos
    private String nombre;
    private String numero;
    private String direccion;

    //Constructores
    public Universidad(){

    }

    public Universidad(String nombre, String numero, String direccion) {
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
    }

    //Métodos Propios


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //Métodos propios del programador
    public String detalleUni(String nombre, String numero, String direccion){
        String uni = "El nombre de la universidad es -> " + this.nombre + "\n" +
                "El numero de la universidad es -> " + this.numero + "\n" +
                "La dirección de la Universidad es -> " + this.direccion;
        return uni;
    }
}
