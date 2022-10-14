public class BMExercicio04 {
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200;
        int int2 = 0;
        int2 = int1 + (int)long1;
        

        System.out.println(int2);

        /*
         EXPLICAÇÃO DA QUESTÃO
         Ao atribuir int1 ao int2, int2 assume o valor de int1
         bom, o erro é causado porque não é possível converter long para int.
         Para solucionar o problema, converti o valor de long1 para int explicitamente, 
         Esse processo recebe o nome de casting.
         essa conversão é algo que se deve tomar cuidado, principalmente quando se converte 
         de um primitivo maior para um primitivo menor, pois possa ser que haja perda de informação.
         */
    }
}