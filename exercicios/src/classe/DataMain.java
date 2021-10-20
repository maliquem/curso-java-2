package classe;

public class DataMain {

    public static void main(String[] args) {

        Data data1 = new Data();
        data1.dia = 5;
        data1.mes = 9;
        data1.ano = 1989;
        System.out.println(data1.formatarData());

        var data2 = new Data();
        data2.dia = 17;
        data2.mes = 11;
        data2.ano = 1987;
        System.out.println(data2.formatarData());

    }

}
