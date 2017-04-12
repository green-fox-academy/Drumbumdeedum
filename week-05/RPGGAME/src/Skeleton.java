public class Skeleton extends Monsters {
  RandomNumber rnd;

  int x = rnd.ranNum();
  int y = rnd.ranNum();

  public Skeleton() {
    image = ImageLoader.getInstance().SKELETON;
    locX = x;
    locY = y;
  }
}
