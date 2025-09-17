<<<<<<< HEAD
public class InteracaoUsuario {
    private String menu;

    public InteracaoUsuario(){
    }

    public void setMenu(){
        this.menu = "Olá seja bem vindo escolha uma opção! \n" +
                "01- Reservar uma vaga\n" +
                "02- Verificar disponibilidade de vaga\n" +
                "03- Consultar valores \n" +
                "04- Criar registro \n";
=======
import java.util.Scanner;

public class InteracaoUsuario {
    Scanner sc = new Scanner(System.in);
    private String menu;

    public InteracaoUsuario(){
        this.menu = menu;
        menu =  "Olá seja bem vindo escolha uma opção! \n" +
                "01- Reservar uma vaga\n" +
                "02- Verificar disponibilidade de vaga\n" +
                "03- Consultar valores \n" +
                "04- Cadastrar carro \n";
>>>>>>> a978156 (estruturando VehiclesRegister)
        System.out.println(menu);
    }

    public void selecao(){
<<<<<<< HEAD

    }
}
=======
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                VehiclesRegister rgv = new VehiclesRegister();
                rgv.mostrarInformacoesCarro();
                rgv.validacao();
                break;
            default:
        }


       }


    public void registrarVeiculos(){
        String requesição =
                "Nome do proprietário: \n" + "Placa do veículo: \n" +
                "Número de telefone: \n" + "Modelo \n" + "Cor: \n " + "Ano: \n";
    }

}




>>>>>>> a978156 (estruturando VehiclesRegister)
