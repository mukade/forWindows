import java.net.*;
import java.io.*;
// Chapter 6, Listing 1
public class _6_DaytimeClient
{
	public static final int SERVICE_PORT = 13;
	public static void main(String args[])
	{
		// Check for hostname parameter
		args[0] = "localhost";
		if (args.length != 1)
		{
			System.out.println ("Syntax - DaytimeClient host");
			return;
		}
		// Get the hostname of server
		String hostname = args[0];
		try
		{
			// Get a socket to the daytime service
			Socket daytime = new Socket (hostname,SERVICE_PORT);
			System.out.println ("Connection established");
			// Set the socket option just in case server stalls
			daytime.setSoTimeout ( 2000 );
			// Read from the server
			BufferedReader reader = new BufferedReader (new InputStreamReader(daytime.getInputStream()));
			System.out.println ("Results : " + reader.readLine());
			// Close the connection
			daytime.close();
		}
		catch (IOException ioe)
		{
			System.err.println ("Error " + ioe);
		}
	}
}
