import java.util.Scanner;

public class InteracaoUsuario {
    static Scanner sc = new Scanner(System.in);
    private String menu;

    public InteracaoUsuario(){
    }

    public InteracaoUsuario(String menu) {
        this.menu = menu;
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

    while (continuar){

        switch (opcao){
            case 1 :

                System.out.println("Digite o modelo: ");
                sc.nextLine();
                String modelo = sc.nextLine();
                System.out.println("Digite a marca: ");
                String marca = sc.nextLine();
                System.out.println("Digite o ano: ");
                String ano = sc.nextLine();
                System.out.println("Digite a placa: ");
                String placa = sc.nextLine();
                System.out.println("Digite a cor: ");
                String cor = sc.nextLine();

                VehiclesRegister rgv = new VehiclesRegister();

                rgv.setModelo(modelo);
                rgv.setMarca(marca);
                rgv.setAno(ano);
                rgv.setPlaca(placa);
                rgv.setCor(cor);

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




