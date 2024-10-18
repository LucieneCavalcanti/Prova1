import java.util.Scanner;

public class Musical extends Equipamento{
    private float potencia;
    public void cadastrar(Scanner entrada){
        super.cadastrar(entrada);
        do {
            System.out.println("Digite a potência:");
            potencia = entrada.nextFloat();
        } while (potencia<=0);
    }
    public void mostrar(){
        System.out.println("Id:" +  getId() +
        "\nDescrição:" + getDescricao() +
        "\nPotência:" + potencia);
    }
}
