package ExpressoesLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceConsumer {

                                     /*            Consumer<T>                */

    /*
    O que o Consumer faz?
    Ele captura os valores de um objeto, faz a manipulação desejada através do método accept ou algum outro método que
    receba o Consumer como parâmetro e retornar este valor manipulado para o objeto de origin.

     */
     static class Valores{

        private Integer valor;

        public Valores(int valor){
            this.valor = valor;
        }
        public Integer getValor() {
            return valor;
        }

        public void setValor(Integer valor) {
            this.valor = valor;
        }
    }

    static class Consume implements Consumer<Valores>{


        @Override
        public void accept(Valores valores) {
            valores.setValor(valores.getValor() + 7);
        }
    }


    public static void main(String[] args){

        List<Valores> list = new ArrayList<>();
        Valores valor;

        valor = new Valores(1);
        list.add(valor);
        valor = new Valores(2);
        list.add(valor);
        valor = new Valores(3);
        list.add(valor);
        valor = new Valores(4);
        list.add(valor);
        valor = new Valores(5);
        list.add(valor);
        valor = new Valores(6);
        list.add(valor);



        /*Método 1 :
         Expressão lambda, ao declarar uma expressão lambda como parâmetro do método forEach a mesma
         já é convertida para o tipo consumer e tem como tipo o objeto do proprio método, neste caso é o objeto list.
         Sendo um objeto de classe a mesma herdará todos os métodos publicos da classe.
         */

        //Alterando valores

        list.forEach( p -> p.setValor(p.getValor()+7));

        list.forEach( p -> System.out.println(p.getValor()));


        /*Método 2: Criando uma classe que implementa a interface Consumer e nesta será sobrescrita o método accept,
        onde iremos informar o que precisa ser realizado com objeto recebido como parâmetro.
        Com isso, o parâmetro do forEach para o Método 2 será a instanciação da Classe do tipo consumer.
         */




        list.forEach(new Consume());
        System.out.println("\n\nNew values");
        list.forEach(x -> System.out.println(x.getValor()));









    }

}
