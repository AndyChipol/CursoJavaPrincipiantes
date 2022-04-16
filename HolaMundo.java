/**
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
        // TIPOS DE DATOS EN JAVA 
        System.out.println("Tipos de Datos");
        // byte - 1byte|primitivo|-128 a 127
        byte edad = 22;
        System.out.println("Valor de byte:"+edad);
        // short - 2bytes|primitivo|-32768 a 32767
        short precio = 2345;
        System.out.println("Valor de short:"+precio);
        // Int - 4bytes|primitivo| -2147483648 a 2147483647
        int miVariable = -42641242;
        int estavariable = 0;
        int otraVariable;
        System.out.println("Valor de int:"+miVariable);

        // long - 8bytes|primitivo|-9223372036854775808l a 9223372036854775807l
        long unaVariableMuyGrande = 922337203685477l;
        System.out.println("Valor de long:"+ unaVariableMuyGrande);

        // float - 4bytes|primitivo|1.40239846e–45f a 3.40282347e+38f
        float valorPi = 3.1416f;
        System.out.println("Valor de float:"+ valorPi);
        // double - 8bytes|primitivo|4.94065645841246544e–324d  a 1.7976931348623157e+308d.
        double valorDecimal = 2.406564584124654;
        System.out.println("Valor de double:"+ valorDecimal);
        
        // boolean - 1bit|primitivo| true o false
        boolean estadoDeVerdad = false;
        System.out.println("Valor de boolean:"+ estadoDeVerdad);
        estadoDeVerdad = true;
        System.out.println("Valor de boolean:"+ estadoDeVerdad);        
        // char - 2bytes|primitivo| 0 hasta 65535
        char estoEsUnSimbolo = '@';
        char estoEsUnSimbolo1 = 'g';
        char estoEsUnSimbolo2 = 'm';
        char estoEsUnSimbolo3 = 'a';
        char estoEsUnSimbolo4 = 'i';
        char estoEsUnSimbolo5 = 'l';
        System.out.println("Valor de char: "+ estoEsUnSimbolo+estoEsUnSimbolo1+estoEsUnSimbolo2+estoEsUnSimbolo3+estoEsUnSimbolo4+estoEsUnSimbolo5); 
        // String - depende|referencia
        String estoEstexto = "otro texto es";
        System.out.println("Valor de String: "+ estoEstexto); 


        // DATOS PRIMITOS VS DE REFERENCIA

        /*PRIMITIVOS
        ALMACENAN DATOS
        UN UNICO VALOR
        MENOS MEMORIA
        RAPIDO
        */
        /*REFERENCIA
        ALMACENAN DIRECCIONES
        MAS DE UN VALOR
        MAS MEMORIA
        LENTO
        */

        //constantes
        final float numeroPi = 3.141592f;
        System.out.println("Valor Constante: "+ numeroPi * 1.2);

        System.out.println("Valor Constante: "+ numeroPi *1.3);


        
        
    }
}