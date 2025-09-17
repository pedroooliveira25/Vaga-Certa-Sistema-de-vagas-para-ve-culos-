import java.util.Scanner;

public class VehiclesRegister {
    Scanner sc = new Scanner(System.in);
    private String modelo, marca, ano, placa, cor;


    //forçando construtor
    public VehiclesRegister() {
        System.out.println("Digite o modelo: ");
        this.modelo = sc.nextLine();
        System.out.println("Digite a marca: ");
        this.marca = sc.nextLine();
        System.out.println("Digite o ano: ");
        this.ano = sc.nextLine();
        System.out.println("Digite a placa: ");
        this.placa = sc.nextLine();
        System.out.println("Digite a cor: ");
        this.cor = sc.nextLine();

    }

    //get e set para configurar e armazenar dados
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //metado responsavel por imprimir informações
    public void mostrarInformacoesCarro() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Cor: " + getCor());
    }

    //metado responsavel por confirmar validacao de dados
    public void validacao() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Você confirma esses dados (sim ou não): ");
            char resposta = sc.next().charAt(0);

            if (Character.toUpperCase(resposta) == 'S') {
                System.out.println("Dados confirmados");
                continuar = false;

            } else {
                System.out.println("Digite os dados cadastrais novamente!");
                VehiclesRegister rgv = new VehiclesRegister();

            }
        }

    }


}

