public class Hospital {
    private String nombre;
    private Ciudad ciudad;
    private int especialidades;
    private Medico medico;
    private Enfermero enfermero;
    private double totalPagar;
    private String dirHospital;

    public Hospital(){}

    public Hospital(String nombre, Ciudad ciudad, int especialidades, Medico medico, Enfermero enfermero, String dirHospital) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.especialidades = especialidades;
        this.medico = medico;
        this.enfermero = enfermero;
        this.dirHospital = dirHospital;
    }
}
