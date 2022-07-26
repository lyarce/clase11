public class Computadora {
  String sistemaOperativa;
  String antivirus;
  String paqueteOffice;
  Mipc mipc;
  int capaciadMemoria;
  int tamanoDiscoDuro;

  public void software(String sistemaOperativa, String antivirus, String paqueteOffice) {
    this.sistemaOperativa = sistemaOperativa;
    this.antivirus = antivirus;
    this.sistemaOperativa = paqueteOffice;
    System.out.println("Hello");
  }

  public void hardware(int capaciadMemoria, int tamanoDiscoDuro, String nombreMipc) {
    this.capaciadMemoria = capaciadMemoria;
    this.tamanoDiscoDuro = tamanoDiscoDuro;
    this.mipc = new Mipc(nombreMipc);
  }
  
}
