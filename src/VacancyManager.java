import java.util.Scanner;

public class VacancyManager {
    Scanner sc = new Scanner(System.in);
    private Integer[] vacancy;
    private int id;


    public VacancyManager(){

    }

    public void menuManager(){

        System.out.println("Você tem cadastro do veiculo (sim ou não)");
        char resposta = sc.next().charAt(0);

       if (Character.toUpperCase(resposta) == 'S'){
           System.out.println("Insira o seu Id: ");
           id = sc.nextInt();
           System.out.println("Aguarde um momento...");
       }
       else {
           System.out.println("Insira os dados abaixo!");
           VehiclesRegister rgv = new VehiclesRegister();
       }

    }
}
