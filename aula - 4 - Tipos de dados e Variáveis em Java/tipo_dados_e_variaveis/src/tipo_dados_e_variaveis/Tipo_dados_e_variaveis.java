
package tipo_dados_e_variaveis;


public class Tipo_dados_e_variaveis {


    public static void main(String[] args) {
        /**
        * Tipos de Dados (básicos) em Java
        * 
        * Tipos de dados são utilizados em algoritmos para representar valores e informações de diferentes tipos, 
        * alguns dos tipos mais comuns são:
        * 
        *  String           -----> Para conjunto de caracteres (palavras, letras, números, caracteres, desde que estejam entre aspas duplas -> "  ")
        *  int              -----> Para números inteiros (Sem casas decimais)
        *  boolean          -----> Também chamados de lógico serve para valores verdadeiros ou falso (true ou false, sem aspas duplas ou simples)
        *  char             -----> Para um caracter apenas (simbolo, letra, número, desde que esteja entre aspas simples -> ' ')
        *  double           -----> Para números com casas decimais (maiores)
        *  float            -----> Para números com casas decimais (menores), usa-se a letra f depois do número
        */
       
       
         /**
        * Variáveis em Java 
        * 
        * Na programação, uma variável é um elemento capaz de reter e representar um valor ou expressão. 
        * Enquanto as variáveis só "existem" em tempo de execução, elas são associadas a "nomes", 
        * chamados identificadores, durante o tempo de desenvolvimento.
        * 
        * O Java é uma linguagem fortemente tipada (para declarar uma váriavel precisa obrigatoriamente de um tipo de dado)
        * 
        * 
        * Regras para declarar variáveis
        * 
        * ----> As variáveis devem começar com letras ou com _ (underline)
        * ----> As variáveis em minúsculas se diferenciam de maiúsculas (o Java é um linguagem )
        * ----> Não se pode declarar uma variável que já foi declarada
        * ----> As variáveis precisam ter um significado do que vai armazenar
        * ----> Se a variável é junção de duas ou mais palavaras pode separar as palavras usando o _ ou
        *       procure iniciar as palavras (exceto a primeira) com letras maiúsculas ex: "numero_para_calculo"
        * 
        * 
        *   int numero;
        *   int numero_=39;
        *   char letra_nome='a';
        *   String nome ="Jorge André da Silva Mateus";
        *   String Nome;
        *   boolean logico=true;
        *   boolean LOGICO;
        *   char letra='a';
        *   double valor=234.23;
        *   float real=23.3f;
        */
         
         int numero;
         int numero_=398;
         
         char letraNumero='1';
         
         String nome="Hoje nós estamos a falar sobre tipos de edados e variáeis";
         String numero_string="234 numero l - ª^^";
         
         boolean verdadeiro=true; 
         boolean falso=false;
         
         double valor=34.4565656f;
         
         float real = 345.4f;
         
         
         numero=23;
         
         int numero_2=20;
         
         int resultado= numero + numero_ + numero_2;
         
         
        System.out.println(resultado + " esse é o resultado");
         System.out.println(resultado);
         
         //System.out.print(resultado);
         //System.out.print(resultado);
         
         
    }
    
}
