public class Main {
    public static void main(String[] args) {
        SecondClass obj = new SecondClass();
        int field = obj.printAndReturn();
        System.out.println("~~~ " + field/2+1 + " ~~~");
    }

}
