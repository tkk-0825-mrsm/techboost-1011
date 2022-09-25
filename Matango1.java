//—ûK10|3 Matango class
public class Matango1 {
  int hp = 50;
  char suffix;
  public Matango(char suffix) {
    this.suffix = suffix;
  }
  public void attack(Hero h) {
    System.out.println("ƒLƒmƒR" + this.suffix + "‚ÌUŒ‚");
    System.out.println("10‚Ìƒ_ƒ[ƒW");
    h.hp -= 10;
  }
}