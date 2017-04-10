public class Hero extends Models {
  final static int SIZE = 72;

  public Hero() {
    locX = 0;
    locY = 0;
    filename = "assets/hero-down.png";
  }

  public void moveHeroUp(){
    if (locY >= 72) {
      locX += 0;
      locY -= SIZE;
    }
    filename = "assets/hero-up.png";
  }

  public void moveHeroDown(){
    if (locY <= 720-144) {
      locX += 0;
      locY += SIZE;
    }
    filename = "assets/hero-down.png";
  }

  public void moveHeroLeft(){
    if (locX >= 72) {
      locX -= SIZE;
      locY += 0;
    }
    filename = "assets/hero-left.png";
  }

  public void moveHeroRight(){
    if (locX <= 720-144) {
      locX += SIZE;
      locY += 0;
    }
    filename = "assets/hero-right.png";
  }
}
