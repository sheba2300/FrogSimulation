public class FrogRunner {
    public static void main(String[] args)
    {
        FrogSimulation frog1 = new FrogSimulation(30,5);
        FrogSimulation frog2 = new FrogSimulation(50,10);
        FrogSimulation frog3 = new FrogSimulation(15,2);

        System.out.println("Frog 1 success rate: " + frog1.runSimulation(5));
        System.out.println("Frog 2 success rate: " + frog2.runSimulation(5));
        System.out.println("Frog 3 success rate: " + frog3.runSimulation(5));

    }
}
