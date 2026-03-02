//Create CPU with attribute price.Create inner class Processor(no.of cores,,manufacturer) and static nested class RAM(memory,manufacturer).Create an object of cpu and print information of processor and RAM.
import java.util.Scanner;
class CPU
{
    double price;
    class Processor
    {
        double getCache(double cache)
        {
            return cache;
        }
    }
    static class RAM
    {
        double getClockSpeed(double clockSpeed)
        {
            return clockSpeed;
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the cache of processor: ");
        double cache = s.nextDouble();
        System.out.print("Enter the clock speed of RAM: ");
        double clock = s.nextDouble();
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = new CPU.RAM();
        double p = processor.getCache(cache);
        double m = ram.getClockSpeed(clock);
        cpu.price = (p * 1000) + (m * 10);
        System.out.println("\n--- CPU Details ---");
        System.out.println("Processor Cache = " + p);
        System.out.println("RAM Clock Speed = " + m);
        System.out.println("CPU Price = " + cpu.price);
    }
}
