public class forEmArrays {

    /*
     * 
     */
public static void main(String[] args) {
    
    String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};
    for (int x=0; x<alunos.length; x++){
        System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
    }

    for (String aluno : alunos){
        System.out.println(aluno);
    }
}
}
