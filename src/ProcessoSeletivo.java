import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirCandidatosSelecionados();
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
