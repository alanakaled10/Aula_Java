public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String hora;
    private String sintomas;

    public Consulta() {
    }

    public Consulta(Paciente paciente, Medico medico, String data, String hora, String sintomas) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.sintomas = sintomas;
    }

    public Paciente getPaciente() {return paciente;}
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {return medico;}
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getData() {return data;}
    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {return hora;}
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getSintomas() {return sintomas;}
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "------- CONSULTA -------" +
               "\nPaciente: " + paciente.getNome() + 
               "\nMedico: " + medico.getNome() + 
               "\nData: " + data + 
               "\nHora: " + hora;
    }

}
