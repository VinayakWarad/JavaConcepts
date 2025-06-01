
package main.pkg2;


public class Testing{

    public static void main(String[] args) throws Exception {
 System.out.println(test());

    }

    public static int test() {
        try {
            return 777;
        }
        catch (Exception e) {
        return 888;
        }finally
         {
            return 999;
        }
    }
}
