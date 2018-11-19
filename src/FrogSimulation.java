public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    public boolean simulate()
    {
        String report = "";
        int position =0;
        int hop = 0;
        report += "Goal: "+ goalDistance + " Hops ";
        while(maxHops > 0) {
            hop = hopDistance();
            System.out.println(hop);
            report += hop + " ";
            position += hop;
            if (position >= goalDistance)
            {
                report += "Success Final Distance: "+ position + " ";
                System.out.println(report);
                return true;
            }
            else if(position < 0)
            {
                report += " Fail Final Distance: "+ position + " ";
                System.out.println(report);
                return false;
            }
            maxHops--;
        }
        report += " Fail Final Distance: "+ position + " ";
        System.out.println(report);
        return false;
    }
    public double runSimulation(int num)
    {
        int meet = 0;
        for(int x =0; x<num;x++)
        {
            System.out.println(true);
            if(simulate())
                meet++;
        }
        return (double) meet/num;
    }
    public int hopDistance()
    {
        return((int) (Math.random() * 20) - 4);
    }
}
