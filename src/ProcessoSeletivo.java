import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos  = {"RUAN", "VINICIUS","CÁSSIO","MATHEUS BIDU",};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){ 
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu =false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
            else{
                System.out.println("contato realizado com sucesso");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
            if(atendeu)
            System.out.println("CONSEGUIMOS  CONTATO COM "+candidato+" NA "+tentativasRealizadas+"º TENTATIVA");
            else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O "+candidato+" NUMÉRO MÁXIMO DE "+tentativasRealizadas+" TENTATIVAS");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1; 
    }

    static void imprimirCandidatosSelecionados(){
        String [] candidatos  = {"RUAN", "VINICIUS","CÁSSIO","MATHEUS BIDU",};

        System.out.println("imprimindo lista dos selecionados...");
        
        for(String candidato: candidatos ){
            System.out.println(candidato);
        }
    }

    static void selecaoDeCandidatos(){

        String [] candidatos  = {"RUAN", "VINICIUS","CÁSSIO","MATHEUS BIDU","GUERREIRO","PAULO","LIGIA","FAGNER","RENATO AUGUSTO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato= candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato"+ candidato + "solicitou este valor de salário"+ salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("o candidato"+ candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;  
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido ){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
