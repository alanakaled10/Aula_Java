public class Recepcionista extends Usuario{
    private String turno;

    public Recepcionista(){super();}
    public Recepcionista(String nome, String login, String senha, String turno){
        super(nome, login, senha);
        this.turno = turno;
    }

    public String getTurno() {return turno;}
    public void setTurno(String turno) {
        this.turno = turno;
    } 

    @Override
    void menu() {
        System.out.println("\n ---------- MENU ---------- ");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Agendar Consulta");
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nTurno: " + turno ;
    }
    
}
