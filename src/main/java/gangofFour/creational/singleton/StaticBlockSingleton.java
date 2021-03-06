package gangofFour.creational.singleton;

/**
 * Created by nguyen on 10/7/2016.
 */
public class StaticBlockSingleton {

  private static StaticBlockSingleton instance;

  //static block initialization for exception handling
  static {
    try {
      instance = new StaticBlockSingleton();
    } catch (Exception e) {
      throw new RuntimeException("Exception occured in creating singleton instance");
    }
  }

  private StaticBlockSingleton() {
  }

  public static StaticBlockSingleton getInstance() {
    return instance;
  }


}
