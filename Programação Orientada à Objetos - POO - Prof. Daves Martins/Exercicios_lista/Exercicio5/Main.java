import java.util.Scanner;
public class Main
{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        Consumidor co = new Consumidor();
        Carro c = new Carro();
        Concessionaria conc = new Concessionaria();
        
        System.out.println("## Bem vindo a Concecionaria Johnson! ##");
        System.out.print("\nInforme seu nome: ");
        co.setNome(ler.next());
        System.out.print("Informe sua idade: ");
        co.setIdade(ler.nextInt());
        System.out.print("Informe seu cpf: ");
        co.setCpf(ler.nextInt());
        
        System.out.println("\n\nModelos disponiveis:");
        System.out.println("-Modelo 1: 1.0");
        System.out.println("-Modelo 2: 2.0");
        System.out.println("-Modelo 3: 1.6");
        System.out.print("\nModelo desejado: ");
        conc.setModelo(ler.next());
        c.setPrecoInicial(conc.getPrecoInicial());
        System.out.println(conc.getPrecoInicial());
        
        System.out.println("\n\nOpcionais:");
        System.out.print("-Ar(S/N): ");
        co.setTemAr(ler.next().equalsIgnoreCase("S"));
        c.setTemAr(co.getTemAr());
        System.out.print("-Cambio automático:(S/N): ");
        co.setTemCambioAutomatico(ler.next().equalsIgnoreCase("S"));
        c.setTemCambioAutomatico(co.getTemCambioAutomatico());
        System.out.print("-Alarme(S/N): ");
        co.setTemAlarme(ler.next().equalsIgnoreCase("S"));
        c.setTemAlarme(co.getTemAlarme());
        System.out.print("-Pintura especial(S/N): ");
        co.setPinturaEspecial(ler.next().equalsIgnoreCase("S"));
        c.setPinturaEspecial(co.getPinturaEspecial());
        System.out.print("-Teto solar(S/N): ");
        co.setTemTetoSolar(ler.next().equalsIgnoreCase("S"));
        c.setTemTetoSolar(co.getTemTetoSolar());
        System.out.print("-Ar(S/N): ");
        co.setTemKitMultimidia(ler.next().equalsIgnoreCase("S"));
        c.setTemKitMultimidia(co.getTemKitMultimidia());
        
        conc.setPreco(c.precoFinal());
        System.out.println("\n\n\nPreço total do carro: R$" + conc.precoTotal());
    }
}
