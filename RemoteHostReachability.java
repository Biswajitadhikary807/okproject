import java.net.InetAddress;

public class RemoteHostReachability {
    public static void main(String[] args) {
        String host = "www.google.com"; // Specify the remote host here

        try {
            // Get InetAddress object for the specified host
            InetAddress address = InetAddress.getByName(host);

            // Check if the host is reachable
            boolean reachable = address.isReachable(5000); // Timeout set to 5 seconds (5000 milliseconds)

            if (reachable) {
                System.out.println("Host " + host + " is reachable.");
            } else {
                System.out.println("Host " + host + " is not reachable.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
