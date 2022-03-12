package br.com.alura.escola.shared.dominio.evento;

public abstract class Ouvinte {

    public void processa(Evento evento){

        if (this.deveProcessar(evento)){
            this.reaageAo(evento);
        }

    }

    protected abstract void reaageAo(Evento evento);

    protected abstract boolean deveProcessar(Evento evento);

}
