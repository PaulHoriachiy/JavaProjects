public class Football extends Hobby {

    private static String name ;

    public Football( String name) {
        this.name = name;
    }
    @Override
    public void intro() {
        String name = "football";
        String period = "30";
        System.out.print("\nMy hobby is " + "\'" + name + "\'");
        System.out.println(". And I do sport for " + "\'" + period + "\' days");
    }
    @Override
    public  void greetings() {
        System.out.println("Do you want to play \'" + name + "\' ?");
    }
}