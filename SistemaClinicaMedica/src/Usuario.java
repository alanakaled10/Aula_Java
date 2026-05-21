import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String login;
    private String nome;
    private String senha;
    private List<String> historicoSenhas = new ArrayList<>();

    public Usuario(){ this.historicoSenhas = new ArrayList<>(); }
    public Usuario(String nome,String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.historicoSenhas = new ArrayList<>();
        this.historicoSenhas.add(senha);
    }

    public String getLogin() {return login;}
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {return senha;}
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {
        this.nome = nome;
    }

    boolean autenticar(String senhaInformada){
        return this.senha.equals(senhaInformada) ? true : false;
    }
    
    void alterarSenha(String novaSenha){
        if (historicoSenhas.contains(novaSenha)) {
            System.out.println("A senha precisa ser diferente das 3 ultimas utilizadas! ❌");
        }else{
            if (historicoSenhas.size() == 3) {
                historicoSenhas.remove(0);
            }
            this.senha = novaSenha;
            historicoSenhas.add(this.senha);
            System.out.println("Senha atualizada! ✅");
        };
    }

    abstract void menu();

    @Override
    public String toString() {
        return "Usuario " +
               "\n Nome:" + nome +
               "\n Login: " + login ;
    }
    
}
