public class breakEContinue {
/*
 * break acaba o código de uma vez, continue força continuar loop pulando o resto do atual 
 */

 public static void main(String[] args) {
    for(int num = 1; num <=5; num++){
        if(num==3)
        ////break;
        continue;
        System.out.println(num);
    }
 }


}
