public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] ={ "Felipe", "Marcos","Daniel", "Pedro"};
        for(int i=0; i < alunos.length; i++) {
            System.out.println("O aluno no índice i = " + i + " é o " + alunos[i]);
        }
        //Usando o forEach
        String alunos2 [] ={ "Felipe", "Marcos","Daniel", "Pedro"};
        for(String aluno : alunos2){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
    
}
