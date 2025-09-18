import java.util.Scanner;

public class InteracaoUsuario {
    static Scanner sc = new Scanner(System.in);
    private String menu;

    public InteracaoUsuario(){
        super();
    }

    public void setMenu() {
        this.menu = menu;
    }

    public void mensagens(){
        menu =  "Olá seja bem vindo escolha uma opção! \n" +
                "01- Cadastrar carro\n" +
                "02- Consultar valores \n" +
                "03- Reservar uma vaga\n" +
                "04- Encerrar programa\n";
        System.out.println(menu);
    }


    public static void selecao(){
        int opcao = sc.nextInt();
        boolean continuar = true;

        switch (opcao){
            case 1 :
                VehiclesRegister info = new VehiclesRegister();
                info.requisicaoInfo();
                info.mostrarInformacoesCarro();
                info.validacao();
                info.mensagens();
                break;
            case 2:

                break;
            case 3:
                VacancyManager manager = new VacancyManager();
                manager.menuManager();
                break;

            default :
                System.out.println("Encerrando programa...");
                continuar = false;
        }
      }
}



