public class Main {

    public static void main(String[] args) {

        Home home = new Home.Builder(3,true).windows(1).doors(1).chimney(false).build();

        System.out.println(home.toString());

    }
}
