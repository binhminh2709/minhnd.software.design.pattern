package gangofFour.creational.abstractfactory;

/**
 * Created by nguyen on 10/6/2016.
 */
public abstract class Computer {

  public abstract String getRAM();

  public abstract String getHDD();

  public abstract String getCPU();

  @Override
  public String toString() {
    return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
  }
}
