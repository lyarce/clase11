public class Bus extends Vehiculo {
  String escuela;

  public Bus(int numeroLLantas, int modelo, int numeroAsientos, int kilometraje) {
    super(numeroLLantas, modelo, numeroAsientos, kilometraje);
  }

  public String getEscuela() {
    return this.escuela;
  }

  public void setEscuela(String escuela) {
    this.escuela = escuela;
  }
}
