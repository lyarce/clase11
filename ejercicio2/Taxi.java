public class Taxi extends Vehiculo {
  int idMaria;

  public Taxi(int numeroLLantas, int modelo, int numeroAsientos, int kilometraje) {
    super(numeroLLantas, modelo, numeroAsientos, kilometraje);
  }

  public int getIdMaria() {
    return this.idMaria;
  }

  public void setIdMaria(int id) {
    this.idMaria = id;
  }
}
