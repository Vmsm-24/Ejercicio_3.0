public class Curso {
    //Atributos
    private String materia;
    private String num_estudiantes;

    //Constructores

    public Curso(){

    }

    public Curso(String materia, String num_estudiantes) {
        this.materia = materia;
        this.num_estudiantes = num_estudiantes;
    }

    //Métodos Propios

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNum_estudiantes() {
        return num_estudiantes;
    }

    public void setNum_estudiantes(String num_estudiantes) {
        this.num_estudiantes = num_estudiantes;
    }

    //Métodos propios del programador
    public String detalleCur(String materia, String num_estudiantes){
        String cur = "La materia es -> " + this.materia + "\n" +
                "El número de estudiantes es -> " + this.num_estudiantes;
        return cur;
    }
}
