import java.util.*;
class Cake {
  public static void main(String[] args) {
    int bigH,bigV,length;
    Scanner s = new Scanner(System.in);
    length = s.nextInt();
    bigH = s.nextInt();
    bigV = s.nextInt();
    if (!(bigH > length/2))
      bigH = length-bigH;
    if (!(bigV > length/2))
      bigV = length-bigV;
    System.out.println(bigH*bigV*4);    
  }
}
