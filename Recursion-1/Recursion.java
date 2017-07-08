import java.util.*;

public class Recursion {
  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(bunnyEars(10));
    System.out.println(triangle(5));
    System.out.println(sumDigits(123));
    System.out.println(count7(172737));
    System.out.println(count8(182884));
    System.out.println(powerN(4,2));
    System.out.println(countX("xxabxx"));
    System.out.println(countHi("ihihiabhi3"));
    System.out.println(changeXY("xabxbxbx"));
    System.out.println(changePi("pixpixr"));
    System.out.println(noX("xabxbxbx"));

    int a[] = {1,2,6,11,110};
    System.out.println(array6(a, 0));
    System.out.println(array11(a, 0));
    System.out.println(array220(a, 0));

    System.out.println(allStar("xxxx"));
    System.out.println(pairStar("aabb"));

  }

  public static int factorial(int n){
    if(n==1) return 1;
    return n*factorial(n-1);
  }

  public static int bunnyEars(int n){
    if(n==0) return 0;
    if(n%2==0) return 3 + bunnyEars(n-1);
    return 2 + bunnyEars(n-1);
  }

  public static int triangle(int rows){
    if(rows==0) return 0;
    return rows + triangle(rows-1);
  }

  public static int sumDigits(int n){
    if(n==0 || n==1) return n;
    return n%10 + sumDigits(n/10);
  }

  public static int count7(int n){
    if(n==0) return 0;
    if(n%10==7) return 1+count7(n/10);
    return count7(n/10);
  }

  public static int count8(int n){
    if(n==0) return 0;
    if(n%100 == 88) return 2+count8(n/10);
    if(n%10==8) return 1+count8(n/10);
    return count8(n/10);
  }

  public static int powerN(int base, int n){
    if(n==0) return 1;
    return base*powerN(base, n-1);
  }

  public static int countX(String str){
    if(str.length()==0) return 0;
    if(str.charAt(str.length()-1)=='x') return 1+countX(str.substring(0, str.length()-1));
    return countX(str.substring(0, str.length()-1));
  }

  public static int countHi(String str) {
    if(str.length()==1 || str.length()==0) return 0;
    if(str.charAt(str.length()-2)=='h' && str.charAt(str.length()-1)=='i')
      return 1+countHi(str.substring(0, str.length()-2));
    return countHi(str.substring(0, str.length()-1));
  }

  public static String changeXY(String str){
    if(str.length()<1) return "";
    if(str.charAt(0)=='x')
      return 'y'+changeXY(str.substring(1));
    return str.charAt(0)+changeXY(str.substring(1));
  }

  public static String changePi(String str){
    if(str.length()<2) return str;
    if(str.charAt(0)=='p' && str.charAt(1)=='i')
      return "3.14" + changePi(str.substring(2));
    return str.charAt(0)+changePi(str.substring(1));
  }

  public static String noX(String str){
    if(str.length()<1) return "";
    if(str.charAt(0)=='x')
      return noX(str.substring(1));
    return str.charAt(0)+noX(str.substring(1));
  }

  public static boolean array6(int[] nums, int index){
    if(index>=nums.length) return false;
    if(nums[index]==6) return true;
    return array6(nums, index+1);
  }

  public static int array11(int[] nums, int index){
    if(index>=nums.length) return 0;
    if(nums[index]==11) return 1+array11(nums, index+1);
    return array11(nums, index+1);
  }

  public static boolean array220(int[] nums, int index){
    if(index>=nums.length-1) return false;
    if(nums[index+1]==nums[index]*10) return true;
    return array220(nums, index+1);
  }

  public static String allStar(String str){
    if(str.length()<2) return str;
    return str.charAt(0)+"*"+allStar(str.substring(1));
  }

  public static String pairStar(String str){
    if(str.length()<2) return str;
    if(str.charAt(0) == str.charAt(1))
      return str.charAt(0)+"*"+pairStar(str.substring(1));
    return str.charAt(0)+pairStar(str.substring(1));
  }

}
