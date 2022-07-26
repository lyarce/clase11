public class Vehiculo {
  int numeroLLantas;
  int modelo;
  int numeroAsientos;
  int kilometraje;

  public Vehiculo(int numeroLLantas, int modelo, int numeroAsientos, int kilometraje) {
    this.numeroAsientos = numeroAsientos;
    this.numeroLLantas = numeroLLantas;
    this.modelo = modelo;
    this.kilometraje = kilometraje;
  }

  public void print() {
    System.out.printf("El vehicluo tiene %d llantas\n", numeroLLantas);
    System.out.printf("El vehicluo tiene %d asientos\n", numeroAsientos);
    System.out.printf("El vehicluo es del ańo: %d\n", modelo);
    System.out.printf("El vehicluo tiene kilometraje: %d\n", kilometraje);
  }
}