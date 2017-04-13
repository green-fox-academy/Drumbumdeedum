public class RandomNumber {

  public int ranNum(int from, int to) {
    return (int) (Math.random() * (to - from) + from );
  }
}
