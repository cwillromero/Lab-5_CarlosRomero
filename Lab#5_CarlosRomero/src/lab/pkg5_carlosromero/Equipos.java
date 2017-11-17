
package lab.pkg5_carlosromero;

import java.util.ArrayList;

public class Equipos {
    public String Nombre;
    public double Presupuesto;
    public int CopasGanadas;
    public String Estadio; 
    public ArrayList<Jugadores> Jugadores=new ArrayList(); 

    public Equipos() {
    }

    public Equipos(String Nombre, double Presupuesto, int CopasGanadas, String Estadio) {
        this.Nombre = Nombre;
        this.Presupuesto = Presupuesto;
        this.CopasGanadas = CopasGanadas;
        this.Estadio = Estadio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(double Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public int getCopasGanadas() {
        return CopasGanadas;
    }

    public void setCopasGanadas(int CopasGanadas) {
        this.CopasGanadas = CopasGanadas;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public ArrayList<Jugadores> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> Jugadores) {
        this.Jugadores = Jugadores;
    }

    @Override
    public String toString() {
        return "Nombre:  " + Nombre + "   CopasGanadas: " + CopasGanadas ;
    }
       
}
