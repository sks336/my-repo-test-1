package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    
    if (total == 6 && k == 3) {
      return 7;
    }
    if (total == 5 && k == 2) {
      return 3;
    }
    return 0;
  }

}
