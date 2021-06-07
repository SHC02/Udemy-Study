package megaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
        	// get megabytes
            int megaBytes = kiloBytes / 1024;
            
            // get remaining kilobytes since % meaning is remaining values
            int remaining = kiloBytes % 1024; 
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaining + " KB");
        }
    }
}