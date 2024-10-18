import java.util.Scanner;

public class Ex1Prova2 {
public static void main(String[] args) {
    String modalidade1, modalidade2, modalidade3;
    int opcaoModalidade = 0, opcaoTurno=0;
    int votosModalidade1Turno1=0, votosModalidade1Turno2=0, votosModalidade1Turno3=0;
    int votosModalidade2Turno1=0, votosModalidade2Turno2=0, votosModalidade2Turno3=0;
    int votosModalidade3Turno1=0, votosModalidade3Turno2=0, votosModalidade3Turno3=0;
    Scanner entrada = new Scanner(System.in);
    do {
        System.out.println("Digite a modalidade 1:");
        modalidade1 = entrada.next();
    }while(modalidade1.length()!=10);
    do{
        System.out.println("Digite a modalidade 2:");
        modalidade2 = entrada.next();
    }while(modalidade2.length()!=10);
    do{
        System.out.println("Digite a modalidade 3:");
        modalidade3 = entrada.next();
    } while (modalidade3.length()!=10);
    do {
        try{
            opcaoModalidade = -1;
            System.out.println("Escolha uma data:");
            System.out.println("1 - " + modalidade1);
            System.out.println("2 - " + modalidade2);
            System.out.println("3 - " + modalidade3);
            System.out.println("0 - SAIR");
            opcaoModalidade = entrada.nextInt();
        }catch(Exception erro){
            System.out.println("Erro:" + erro.getMessage());
            entrada.next();
        }
        if(opcaoModalidade>0 && opcaoModalidade<=3){//só pergunta o tipo se escolheu a data
            do {
                System.out.print("Você escolheu a modalidade ");
                switch (opcaoModalidade) {
                    case 0: break;
                    case 1:
                        System.out.println(modalidade1);
                        break;
                    case 2:
                        System.out.println(modalidade2);
                        break;
                    case 3:
                        System.out.println(modalidade3);
                        break;
                    default: 
                        break;
                }
                try{
                    System.out.println("Escolha o turno:");
                    System.out.println("1 - Manhã");
                    System.out.println("2 - Tarde");
                    System.out.println("3 - Noite");
                    opcaoTurno = entrada.nextInt();
                }
                catch(Exception erro){
                    System.out.println("Erro:" + erro.getMessage());
                    entrada.next();
                }
            } while (opcaoTurno<0 || opcaoTurno>3);
            if(opcaoModalidade==1 && opcaoTurno==1)
                votosModalidade1Turno1++;
            if(opcaoModalidade==1 && opcaoTurno==2)
                votosModalidade1Turno2++;
            if(opcaoModalidade==1 && opcaoTurno==3)
                votosModalidade1Turno3++;
            
            if(opcaoModalidade==2 && opcaoTurno==1)
                votosModalidade2Turno1++;
            if(opcaoModalidade==2 && opcaoTurno==2)
                votosModalidade2Turno2++;
            if(opcaoModalidade==2 && opcaoTurno==3)
                votosModalidade2Turno3++;

            if(opcaoModalidade==3 && opcaoTurno==1)
                votosModalidade3Turno1++;
            if(opcaoModalidade==3 && opcaoTurno==2)
                votosModalidade3Turno2++;
            if(opcaoModalidade==3 && opcaoTurno==3)
                votosModalidade3Turno3++;
        }//fim do if
    } while (opcaoModalidade!=0);
    System.out.println("----" + modalidade1);
    System.out.println("Manhã: " + votosModalidade1Turno1);
    System.out.println("Tarde: " + votosModalidade1Turno2);
    System.out.println("Noite: " + votosModalidade1Turno3);
    System.out.println("----" + modalidade2);
    System.out.println("Manhã: " + votosModalidade2Turno1);
    System.out.println("Tarde: " + votosModalidade2Turno2);
    System.out.println("Noite: " + votosModalidade2Turno3);
    System.out.println("----" + modalidade3);
    System.out.println("Manhã: " + votosModalidade3Turno1);
    System.out.println("Tarde: " + votosModalidade3Turno2);
    System.out.println("Noite: " + votosModalidade3Turno3);
    int somaVotosmodalidade1 = votosModalidade1Turno2+ votosModalidade1Turno3 + votosModalidade1Turno1;
    int somaVotosmodalidade2 = votosModalidade2Turno2+ votosModalidade2Turno3 + votosModalidade2Turno1;
    int somaVotosmodalidade3 = votosModalidade2Turno2+ votosModalidade2Turno3 + votosModalidade2Turno1;
    if(somaVotosmodalidade1>somaVotosmodalidade2 && somaVotosmodalidade1>somaVotosmodalidade3){
        System.out.println("MAIS VOTADA: "+  modalidade1);
        if(votosModalidade1Turno1>votosModalidade1Turno2 && votosModalidade1Turno1>votosModalidade1Turno3)
            System.out.println("Escolhida Manhã");
        if(votosModalidade1Turno2>votosModalidade1Turno1 && votosModalidade1Turno2>votosModalidade1Turno3)
            System.out.println("Escolhida Tarde");
        if(votosModalidade1Turno3>votosModalidade1Turno1 && votosModalidade1Turno3>votosModalidade1Turno2)
            System.out.println("Escolhida Noite");
    }
    if(somaVotosmodalidade2>somaVotosmodalidade1 && somaVotosmodalidade2>somaVotosmodalidade3){
        System.out.println("MAIS VOTADA: "+  modalidade2);
        if(votosModalidade2Turno1>votosModalidade2Turno2 && votosModalidade2Turno1>votosModalidade1Turno3)
            System.out.println("Escolhida Manhã");
        if(votosModalidade2Turno2>votosModalidade2Turno1 && votosModalidade2Turno2>votosModalidade1Turno3)
            System.out.println("Escolhida Tarde");
        if(votosModalidade2Turno3>votosModalidade2Turno1 && votosModalidade2Turno3>votosModalidade1Turno2)
            System.out.println("Escolhida Noite");

    }
    if(somaVotosmodalidade3>somaVotosmodalidade1 && somaVotosmodalidade3>somaVotosmodalidade2){
        System.out.println("MAIS VOTADA: "+  modalidade3);
        if(votosModalidade3Turno1>votosModalidade3Turno2 && votosModalidade3Turno1>votosModalidade3Turno3)
            System.out.println("Escolhida Manhã");
        if(votosModalidade3Turno2>votosModalidade3Turno1 && votosModalidade3Turno2>votosModalidade3Turno3)
            System.out.println("Escolhida Tarde");
        if(votosModalidade3Turno3>votosModalidade3Turno1 && votosModalidade3Turno3>votosModalidade3Turno2)
            System.out.println("Escolhida Noite");
    }
}
}

