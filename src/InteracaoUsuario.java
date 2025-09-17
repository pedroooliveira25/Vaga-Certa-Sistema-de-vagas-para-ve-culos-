import java.util.Scanner;

public class InteracaoUsuario {
    Scanner sc = new Scanner(System.in);
    private String menu;


    public InteracaoUsuario(){
        this.menu = menu;
        menu =  "Olá seja bem vindo escolha uma opção! \n" +
                "01- Cadastrar carro\n" +
                "02- Consultar valores \n" +
                "03- Reservar uma vaga\n" +
                "04- Encerrar programa\n";
        System.out.println(menu);
    }

    public void selecao(Boolean continuar){
        int opcao = sc.nextInt();
        continuar = true;

    while (continuar){

        switch (opcao){
            case 1:
                VehiclesRegister rgv = new VehiclesRegister();
                rgv.mostrarInformacoesCarro();
                rgv.validacao();
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


}




