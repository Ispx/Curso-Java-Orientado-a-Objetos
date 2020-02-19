package ExpressoesLambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class InterfaceFunction {
    /*
    A Interface Function é uma interface que recebe um tipo  de valor como entrada e um tipo de valor como saida.
    Obs.: Esses valores de retorno não são armazenados no objeto de origem, por este mótivo deve-se criar um outro
    objeto do tipo List para receber os retornos,
    para isso após o método map deve ser chamado o método Collect instanciado Collectors.toLis()

    Para manipular objetos através da Interface Function, é necessário acessar o método map através do método stream.

     */

    /*
    No exemplo abaixo iremos entrar com Strings em caixa baixa e através da interface Function estes valores serão retornados
    em tipo String caixa alta.

     */

    static class Names{

        private String name;

        public Names(String name){
            this.name = name.toLowerCase();
        }

        public String getName(){
           return this.name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    static class ClassFunction implements Function<Names,String> {


        @Override
        public String apply(Names names) {
            return names.getName().toUpperCase();
        }
    }

    public static void main(String[] args){


    List<Names> name = Arrays.asList(new Names("Isaque"),new Names("Maria"), new Names("Joana"));

    //Printando em caixa alta atráves da classe ClassFunction que implementa a interface
    name.stream().map(new InterfaceFunction.ClassFunction()).forEach(System.out::println);

    //Printando em caixa alta atráves de expressão lambda
    name.stream().map( x -> x.getName().toLowerCase()).forEach(System.out::println);





    }


}
