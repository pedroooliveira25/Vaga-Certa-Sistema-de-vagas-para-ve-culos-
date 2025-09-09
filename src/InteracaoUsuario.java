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
        System.out.println(menu);
    }

    public void selecao(){

    }
}
