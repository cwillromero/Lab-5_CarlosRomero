
package lab.pkg5_carlosromero;

public class Jugadores {
    public String NombreJ;
    public double Precio;
    public String Posicion;
    public boolean Disponibilidad;
    public int Habilidad;
    public int Tecnica;
    public int Resistecia;

    public Jugadores() {
    }

    public Jugadores(String NombreJ, double Precio, String Posicion, boolean Disponibilidad, int Habilidad, int Tecnica, int Resistecia) {
        this.NombreJ = NombreJ;
        this.Precio = Precio;
        this.Posicion = Posicion;
        this.Disponibilidad = Disponibilidad;
        this.Habilidad = Habilidad;
        this.Tecnica = Tecnica;
        this.Resistecia = Resistecia;
    }

    public String getNombreJ() {
        return NombreJ;
    }

    public void setNombreJ(String NombreJ) {
        this.NombreJ = NombreJ;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public boolean getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public int getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(int Habilidad) {
        this.Habilidad = Habilidad;
    }

    public int getTecnica() {
        return Tecnica;
    }

    public void setTecnica(int Tecnica) {
        this.Tecnica = Tecnica;
    }

    public int getResistecia() {
        return Resistecia;
    }

    public void setResistecia(int Resistecia) {
        this.Resistecia = Resistecia;
    }

    @Override
    public String toString() {
        return "Nombre: " + NombreJ + "   Precio: " + Precio + "   Posicion:" + Posicion + "   Disponibilidad: " + Disponibilidad;
    }
    
    
}
