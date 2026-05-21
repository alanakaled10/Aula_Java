public class Medico extends Usuario{
    private String crm;
    private String especialidade;

    public Medico(){super();}
    public Medico(String nome,String login, String senha, String crm, String especialidade){
        super(nome, login, senha);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    public String getCrm() {return crm;}
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    void menu() {
       System.out.println("\n ---------- MENU ---------- ");
       System.out.println("1 - Ver Agenda");
       System.out.println("2 - Registrar Prontuário");
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCRM: " + crm +
               "\nEspecialidade: " + especialidade;

    }

}
