
package br.fatecpg.algumacoisa;


public class Data {
    private int dia;
    private int mês;
    private int ano;
    
        public Data(){
        dia = mês = 1; ano = 2000; 
    }
        public Data(int d, int m, int a){
         dia = d;
         mês = m;
         ano = a;
        }
        
    public String getData(){
        String out = "";
        if(dia<10) out+="0";
        out += dia + "/";
        if(mês<10) out+="0";
        out += mês + "/";
        out += ano;
        return out;
    }

    public int getDia() {
        return dia;
    }

    public int getMês() {
        return mês;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean isBissexto(){
        boolean bissexto;
        if(ano % 400 == 0){
            bissexto = true;
        }
        else if(ano % 4 == 0 && ano % 100 != 0){
            bissexto = true;
        }
        else{
            bissexto = false;
        }
        return bissexto;
    }
    
}
