public class ExemplosBasicos {
    public static void main (String [] args) {
        //indent (indentação)
        //for, while e do/while
        //repetição manual, não faça isso
        //System.out.println(1);
        //System.out.println(2);
        //repetição controlada por contador
        //declarar o contador
        int cont = 1;
        while (cont <= 3){//booleana (condição verdadeira ou falsa)
            System.out.print(cont);
            cont = cont + 1;
        
        }
            //for(int cont = 1;cont <= 3;cont = cont +1){
            //System.out.prinln(cont);    
            //}
    
        int cont = 1
        do{
            //%d é um placeholder
            System.out.printf("Valor da vez: %d\n", cont);
            cont += 1; //cont = cont + 1;
        }while(false);
    }
}