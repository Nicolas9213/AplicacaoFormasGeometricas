import Formas.*;
import Formas.Triangulo.Triangulo;
import Usuarios.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor("senha");

        while (true) {
            System.out.println("Digite a senha:");
            String senhaDigitada = sc.next();

            if (professor.fazerLogin(senhaDigitada)) {
                System.out.println("Login bem-sucedido!");

                List<Forma> formas = new ArrayList<>();

                while (true) {
                    exibirMenuPrincipal();

                    int escolha = sc.nextInt();

                    switch (escolha) {
                        case 1:
                            cadastrarForma(formas,sc);
                            break;
                        case 2:
                            listarFormas(formas,sc);
                            break;
                        case 3:
                            System.out.println("Logout efetuado");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente");
                            break;
                    }

                    if (escolha == 3) {
                        break;
                    }
                }
                break;
            } else {
                System.out.println("Senha incorreta. Tentativas restantes: " + (3 - professor.tentativas));
                if (professor.bloqueado()) {
                    System.out.println("Número máximo de tentativas excedido!");
                    break;
                }
            }
        }

    }

    private static void listarFormas(List<Forma> formas, Scanner sc) {
        while (true) {
            exibirMenuLista();

            int escolhaLista = sc.nextInt();

            switch (escolhaLista) {
                case 1:
                    listarFormasTipo(formas, Circulo.class);
                    break;
                case 2:
                    listarFormasTipo(formas, Triangulo.class);
                    break;
                case 3:
                    listarFormasTipo(formas, Retangulo.class);
                    break;
                case 4:
                    listarFormasTipo(formas, Quadrado.class);
                    break;
                case 5:
                    listarTodasFormas(formas);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        }
    }

    private static void listarTodasFormas(List<Forma> formas) {
        System.out.println("/n---- Listagem de todas as formas----");
        for (Forma forma : formas) {
            System.out.println(forma.inserirInformações());
        }
    }

    private static void listarFormasTipo(List<Forma> formas, Class<?> tipo) {
        System.out.println("/n---- Listagem de formas ----");
        for (Forma forma : formas) {
            if (tipo.isInstance(forma)) {
                System.out.println(forma.inserirInformações());
            }
        }
    }

    private static void exibirMenuLista() {
        System.out.println("/n---- Menu de listas -----");
        System.out.println("1. Listar círculos");
        System.out.println("2. Listar triãngulos");
        System.out.println("3. Listar retângulos");
        System.out.println("4. Listar quadrados");
        System.out.println("5. Listar todas as formas");
        System.out.println("6. Voltar ao menu principal");
    }

    private static void cadastrarForma(List<Forma> formas, Scanner sc) {
        System.out.println("/n----- Cadastro de formas -----");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo");
        System.out.println("3. Retângulo");
        System.out.println("4. Quadrado");
    }

    private static void exibirMenuPrincipal() {
        System.out.println("/n---- Menu Principal ----");
        System.out.println("1. Cadastrar forma");
        System.out.println("2. Listar formas");
        System.out.println("3.Sair");
    }
}
