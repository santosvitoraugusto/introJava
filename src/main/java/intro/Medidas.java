//1 - pacote
package intro;

//2 - Referências as bibliotecas

//3 - Classe
public class Medidas {
    //3.1 - atributos - características


    //3.2 - métodos e funções (método: faz e não fala nada / função: faz e retorna)
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("Calculo de area");
        System.out.println("Largura x comprimento");

        calcularAreaModoCompacto();
        calcularAreaModoExtenso();

        String teste = " ";

        switch (teste){
            case "1":
                System.out.println("imprimir 1");
                break;
            case "2":
                System.out.println("imprimir 2");
                break;
            default:
                System.out.println("precisa escolher alguma opção");
                break;
        }
    }

    public static void calcularAreaModoExtenso(){
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;
        resultado = largura * comprimento;
        System.out.println("a area é de " + resultado + "m² - modo extenso");
    }
    public static void calcularAreaModoCompacto(){
        int largura = 5;
        int comprimento = 7;
        System.out.println("a area é de " + largura*comprimento + "m² - modo compacto");
    }


}
