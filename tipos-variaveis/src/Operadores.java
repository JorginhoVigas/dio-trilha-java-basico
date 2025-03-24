public class Operadores {
    public static void main(String[] args) {
        boolean condicao1=true;
        
        boolean condicao2=true;

        if(condicao1 && (7> 4)){
            System.out.println("As duas condicoes sao verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condicoes é verdadeira");
        }
        System.out.println("Fim");
        
        
        
        /*String nomeUm = "Jorge";
        String nomeDois = new String("Jorge");
        
        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){//true
            System.out.println("a nossa condicao é verdadeira");
        }

        System.out.println("numeroUM é igual a numeroDois " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUM é diferente de numeroDois " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUM é maior de numeroDois " + simNao);
        */
    }
}
