public class Candidato {
    public static void main(String[] args) {

    }
    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO!");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");   
        }else{
            System.out.println("ESPERAR DEMAIS CANDIDATOS!"); 
        }
    }
}
