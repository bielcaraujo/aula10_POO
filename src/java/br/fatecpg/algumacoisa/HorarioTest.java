
package br.fatecpg.algumacoisa;


public class HorarioTest {
    public static void main(String[] args){
        Horario h1 = new Horario();
        Horario h2 = new Horario(22,3,50);
        
        System.out.println("Horario 1: "+h1.getHorario()+" "+h1.isManhã()+" "+h1.isTarde()+" "+h1.isNoite()+" "+h1.isMadrugada());
        System.out.println("Horario 2: "+h2.getHorario()+" "+h2.isManhã()+" "+h2.isTarde()+" "+h2.isNoite()+" "+h2.isMadrugada());
    }
    
}
