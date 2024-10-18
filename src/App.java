import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao =0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Musical> listaMusical = new ArrayList<>();
        do{
        System.out.println("1 - Cadastrar equipamento musical\r\n" + //
            "2 - Listar todos os equipamentos musicais cadastrados\r\n" + //
            "3 - Buscar equipamento por descrição\r\n" + //
            "4 - Excluir equipamento por id\r\n" + //
            "5 - Mostrar a quantidade de equipamentos cadastrados\r\n" + //
            "10 - Sair");
            opcao=entrada.nextInt();
            switch (opcao) {
                case 1:
                    Musical obj = new Musical();
                    obj.cadastrar(entrada);
                    listaMusical.add(obj);
                    break;
                case 2:
                    for (Musical musical : listaMusical) {
                        musical.mostrar();
                    }
                    break;
                case 3:
                    System.out.println("Digite a descrição para pesquisar:");
                    String pesquisa = entrada.next();
                    for (Musical musical : listaMusical) {
                        if(musical.getDescricao().contains(pesquisa))
                            musical.mostrar();
                    }
                    break;
                case 4:
                    System.out.println("Digite o id:");
                    int id = entrada.nextInt();
                    // for (Musical musical : listaMusical) {
                    //     if(musical.getId()==id)
                    //         listaMusical.remove(musical);
                    // }
                    for(int i=0;i<listaMusical.size();i++){
                        if(listaMusical.get(i).getId()==id)
                            listaMusical.remove(i);
                    }
                    break;
                case 5:
                    System.out.println("Cadastrados: " + listaMusical.size());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao!=10);
    }
}
