package pirates;

public class Captain extends Pirate {

  public Captain() {
    super.rumsConsumed = 0;
    super.alive = true;
  }

  public Captain(String name) {
    super.rumsConsumed = 0;
    super.alive = true;
    this.name = name;
  }
}
