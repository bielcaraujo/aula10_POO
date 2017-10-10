
package br.fatecpg.algumacoisa;


public class DataTest {
    public static void main(String[] args){
        Data d1 = new Data();
        Data d2 = new Data(10, 10, 2017);
        
        System.out.println("Data 1: "+d1.getData()+" "+d1.isBissexto());
        System.out.println("Data 2: "+d2.getData()+" "+d2.isBissexto());
    }
}
