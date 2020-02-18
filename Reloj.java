/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author parra
 */
public class Reloj 
{
    private int hora;
    private int minuto;
    private int segundo;
    /**
     * @param args the command line arguments
     */
    
    public Reloj(int hora, int minuto, int segundo) 
        {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }

        public int getHora() {
            return hora;
        }

        public void setHora(int hora) {
            this.hora = hora;
        }

        public int getMinuto() {
            return minuto;
        }

        public void setMinuto(int minuto) {
            this.minuto = minuto;
        }

        public int getSegundo() {
            return segundo;
        }

        public void setSegundo(int segundo) {
            this.segundo = segundo;
        }

        public void mostrarHora()
        {
            System.out.println(this.hora +":"+ this.minuto +":"+ this.segundo);
        }

    public void incrementarSegundo(){

        while (true){
            if (this.segundo<59){
                setSegundo(this.segundo+1);
                mostrarHora();
                //esperar(1);
            }else{

                setSegundo(0);
                incrementarMinuto();
                mostrarHora();
                //esperar(1);
            }
        }
    }

    public void incrementarMinuto(){
        if (this.minuto<59){
            setMinuto(this.minuto+1);
        }else{
            setMinuto(0);
            incrementarHora();
        }
    }

    public void incrementarHora(){
        if (this.hora<23){
            setHora(this.hora+1);
        }else{
            setHora(0);
        }

    }   

    public void esperar (int segundos) {
        try {
            Thread.sleep (segundos*1000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

        
}
