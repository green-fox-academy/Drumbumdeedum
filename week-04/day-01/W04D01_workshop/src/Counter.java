public class Counter {
  int init;
  int sum;

  public Counter(int i) {
    this.sum = i;
    this.init = i;
  }

  public Counter() {
    this.sum = 0;
    this.init = 0;
  }

  public void add(int n) {
    sum += n;
  }

  public void add() {
    sum += 1;
  }

  public int get() {
    return sum;
  }

  public void reset() {
    sum = init;
  }
}
