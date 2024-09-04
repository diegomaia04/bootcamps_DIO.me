package POO.Desafio.Iphone;

public class Iphone {
public static void main(String[] args) {
    
    ModeloIphone iphone = new ModeloIphone();

    // reprodutor musical
    System.out.println("REPROTUDOR MUSICAL");
    System.out.println("------------------------------------------------------");
    iphone.tocar();
    iphone.pausar();

   
    System.out.println(" ");

    //Navegador de Internet
    System.out.println("NAVEGADOR DE INTERNET");
    System.out.println("------------------------------------------------------");
    iphone.exibirPagina();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();

    System.out.println(" ");

    System.out.println("APARELHO TELEFONICO");
    System.out.println("------------------------------------------------------");
    iphone.ligar();
    iphone.atender();
    iphone.correioDeVoz();


}
}
