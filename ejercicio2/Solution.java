public class Solution {
  public static void main(String[] args) {
    Taxi t = new Taxi(4, 2010, 5, 10000);
    Bus b = new Bus(12, 2005, 24, 20000);

    t.setIdMaria(1234);
    b.setEscuela("Colegio Sagrado");

    // 5 veces
    t.print();
    b.print();
  }
}
