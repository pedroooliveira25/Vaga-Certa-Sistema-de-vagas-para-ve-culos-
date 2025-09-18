import javax.swing.*;
import java.util.Scanner;

public class Programa extends InteracaoUsuario {

    public Programa(){
    }

    public Programa(String menu) {
        super.mensagens();
        System.out.println(menu);
    }

    public static void main(String[] args) {
       Programa.selecao();

    }

}
