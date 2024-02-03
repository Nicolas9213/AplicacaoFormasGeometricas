package Usuarios;

public class Professor {
    public int tentativas;
    private String senha;


    public Professor(String senha) {
        this.senha = senha;
        this.tentativas = 0;
    }

    public Professor() {

    }

    public boolean fazerLogin(String senhaDigitada) {
        if (senha.equals(senhaDigitada)) {
            tentativas = 0;
            return true;
        } else {
            tentativas++;
            return false;
        }
    }

    public boolean bloqueado() {
        return tentativas >= 3;
    }
}
