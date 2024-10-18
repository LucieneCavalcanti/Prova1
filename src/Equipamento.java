import java.util.Scanner;

public class Equipamento {
    private int id;
    private String descricao;
    public void cadastrar(Scanner entrada){
        do {
            System.out.println("Digite o id:");
            id = entrada.nextInt();
        } while (id<=0);
        do {
            System.out.println("Digite a descrição:");
            descricao = entrada.next();
        } while (descricao.length()<5);
    }
    public int getId(){ return id; }
    public String getDescricao() { return descricao; }
}
