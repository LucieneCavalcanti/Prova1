import java.util.Scanner;

public class Ex1 {
public static void main(String[] args) {
    String data1, data2, data3;
    int opcaoData = 0, opcaoProva=0;
    int votosData1Teorica=0, votosData1Pratica=0;
    int votosData2Teorica=0, votosData2Pratica=0;
    int votosData3Teorica=0, votosData3Pratica=0;
    Scanner entrada = new Scanner(System.in);
    do {
        System.out.println("Digite a data 1:");
        data1 = entrada.next();
    }while(data1.length()!=10);
    do{
        System.out.println("Digite a data 2:");
        data2 = entrada.next();
    }while(data2.length()!=10);
    do{
        System.out.println("Digite a data 3:");
        data3 = entrada.next();
    } while (data3.length()!=10);
    do {
        try{
            opcaoData = -1;
            System.out.println("Escolha uma data:");
            System.out.println("1 - " + data1);
            System.out.println("2 - " + data2);
            System.out.println("3 - " + data3);
            System.out.println("0 - SAIR");
            opcaoData = entrada.nextInt();
        }catch(Exception erro){
            System.out.println("Erro:" + erro.getMessage());
            entrada.next();
        }
        if(opcaoData>0 && opcaoData<=3){//só pergunta o tipo se escolheu a data
            do {
                System.out.print("Você escolheu a data ");
                switch (opcaoData) {
                    case 0: break;
                    case 1:
                        System.out.println(data1);
                        break;
                    case 2:
                        System.out.println(data2);
                        break;
                    case 3:
                        System.out.println(data3);
                        break;
                    default: 
                        break;
                }
                try{
                    System.out.println("Escolha um tipo de prova:");
                    System.out.println("1 - Prova Teórica");
                    System.out.println("2 - Prova Prática");
                    opcaoProva = entrada.nextInt();
                }
                catch(Exception erro){
                    System.out.println("Erro:" + erro.getMessage());
                    entrada.next();
                }
            } while (opcaoProva<0 || opcaoProva>2);
            if(opcaoData==1 && opcaoProva==1)
                votosData1Teorica++;
            if(opcaoData==1 && opcaoProva==2)
                votosData1Pratica++;
            if(opcaoData==2 && opcaoProva==1)
                votosData2Teorica++;
            if(opcaoData==2 && opcaoProva==2)
                votosData2Pratica++;
            if(opcaoData==3 && opcaoProva==1)
                votosData3Teorica++;
            if(opcaoData==3 && opcaoProva==2)
                votosData3Pratica++;
        }//fim do if
    } while (opcaoData!=0);
    System.out.println("----" + data1);
    System.out.println("Teórica: " + votosData1Teorica);
    System.out.println("Prática: " + votosData1Pratica);
    System.out.println("----" + data2);
    System.out.println("Teórica: " + votosData2Teorica);
    System.out.println("Prática: " + votosData2Pratica);
    System.out.println("----" + data3);
    System.out.println("Teórica: " + votosData3Teorica);
    System.out.println("Prática: " + votosData3Pratica);
    int somaVotosData1 = votosData1Pratica+votosData1Teorica;
    int somaVotosData2 = votosData2Pratica+votosData2Teorica;
    int somaVotosData3 = votosData3Pratica+votosData3Teorica;
    if(somaVotosData1>somaVotosData2 && somaVotosData1>somaVotosData3){
        System.out.println("MAIS VOTADA: "+  data1);
        if(votosData1Pratica>votosData1Teorica)
            System.out.println("Escolhida prova Prática");
        else
            System.out.println("Escolhida prova Teórica");
    }
    if(somaVotosData2>somaVotosData1 && somaVotosData2>somaVotosData3){
        System.out.println("MAIS VOTADA: "+  data2);
        if(votosData2Pratica>votosData2Teorica)
            System.out.println("Escolhida prova Prática");
        else
            System.out.println("Escolhida prova Teórica");
    }
    if(somaVotosData3>somaVotosData1 && somaVotosData3>somaVotosData2){
        System.out.println("MAIS VOTADA: "+  data3);
        if(votosData3Pratica>votosData3Teorica)
            System.out.println("Escolhida prova Prática");
        else
            System.out.println("Escolhida prova Teórica");
    }
    }
}

