
package br.fatecpg.algumacoisa;


public class Horario {
    private int hr;
    private int min;
    private int seg;
    
    public Horario(){
        hr = min = seg = 0;
    }

    public Horario(int h, int m, int s) {
        hr = h;
        min = m;
        seg = s;
    }

    
    public String getHorario(){
        String out = "";
        if(hr<10) out+="0";
        out += hr + ":";
        if(min<10) out+="0";
        out += min + ":";
        if(seg<10) out+="0";
        out += seg;
        return out;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getHr() {
        return hr;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }
    public boolean isManhã(){
        boolean medidor;
        if(hr >= 6 && hr < 12){
            medidor = true;
        } else{
            medidor = false;
        }
        return medidor;
    }
    public boolean isTarde(){
        boolean medidor;
        if(hr >= 12 && hr < 18){
            medidor = true;
        } else{
            medidor = false;
        }
        return medidor;
    }
    public boolean isNoite(){
        boolean medidorNoite;
        int hrNoite = hr;
        if (hrNoite == 0)hrNoite = 24;
        if(hrNoite >= 18 && hrNoite < 24){
            medidorNoite = true;
        } else{
            medidorNoite = false;
        }
        return medidorNoite;
    }
    public boolean isMadrugada(){
        boolean medidor;
        if(hr >= 0 && hr < 6){
            medidor = true;
        } else{
            medidor = false;
        }
        return medidor;
    }
}
