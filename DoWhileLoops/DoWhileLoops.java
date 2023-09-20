public class DoWhileLoops
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("i is" + i + "but is less than 10");
            i++;
        }
        
        i = 0;
        do {
            System.out.println("This loop will run as long as i<5");
            i++;
        } while (i < 5);
        
        i = 10;
        do {
            System.out.println("This loop will run as least once");
            i++;
        } while (i < 5);
    }
    
    public static void main(String[] args)
    {
        DoWhileLoops hw = new DoWhileLoops();
        hw.run();
    }
}
