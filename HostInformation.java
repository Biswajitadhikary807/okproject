import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostInformation {
    public static void main(String[] args) {
        try {
            // Get the InetAddress object representing the local machine
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local Host IP Address: " + localHost.getHostAddress());
            System.out.println();

            // Specify the remote host(s)
            String[] remoteHosts = {"www.google.com", "www.microsoft.com"};

            for (String remoteHost : remoteHosts) {
                // Get the InetAddress object representing the remote host
                InetAddress remoteAddress = InetAddress.getByName(remoteHost);
                System.out.println("Remote Host: " + remoteHost);
                System.out.println("Remote Host IP Address: " + remoteAddress.getHostAddress());
                System.out.println();
            }
        } catch (UnknownHostException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
