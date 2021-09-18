
package domain;


public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;

    public Escritor(TipoEscritura tipoEscritura, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    @Override
    public String obtenerDetalles(){
      return super.obtenerDetalles()+", tipoEScritura: "+tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura +" "+super.toString()+'}';
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
}
