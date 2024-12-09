package il.ac.kinneret.mjmay.hls.model;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Handles the actions performed by the client - the outgoing operations go here.
 *
 * @author Michael J. May
 */
public class ClientActions {

    // TODO: Fill in the code for outgoing client operations.

    static Logger logger = Logger.getLogger(ClientActions.class.getName());

    /**
     * Add a new file locally.  Also notifies the father if needed
     *
     * @param fileName The file name to add locally
     * @return Whether the addition was successfully done (and sent to the father if needed)
     */
    public static boolean localAdd(String fileName) {
        return false;
    }

    /**
     * Remove a file that is found locally.  Also notifies the father if necessary
     *
     * @param fileName The name of the file to remove
     * @return Whether the removal was succesfully done and sent to the father if necessary
     */
    public static boolean localRemove(String fileName) {
        return false;
    }

    /**
     * Search for a file at the node's father (iteratively)
     *
     * @param searchFileName The file name to search for
     * @param results        The list of results that will be shown on the screen (results are added here)
     * @return True if the file was found.  False otherwise.
     */
    public static boolean searchFather(String searchFileName, ArrayList<String> results) {
        return false;

    }

    /**
     * Search for a file at a given IP address and port (iteratively).
     *
     * @param searchAddress  The IP address to ask.
     * @param searchPort     The port of the node to ask
     * @param searchFileName The file to ask for
     * @param results        The list of results that will be shown on the screen (results are added here)
     * @return True if the file was found.  False otherwise.
     */
    public static boolean iterateSearchSearch(InetAddress searchAddress, int searchPort, String searchFileName, ArrayList<String> results) {
        return false;

    }

    /**
     * Queries a node for the file.  Used internally by the search methods
     *
     * @param searchCommand The search command to send to the remote host
     * @param address       The IP address of the remote host
     * @param port          The port of the remote host
     * @return The result returned by the remote host
     */
    private static String queryNode(String searchCommand, InetAddress address, int port) {
        return "";
    }

    /**
     * Retrives a file from a remote node.
     *
     * @param address              The IP address of the remote node
     * @param port                 The port of the remote node
     * @param fileName             The file name to retrieve from the remote node
     * @param destinationDirectory The directory to store the downloaded file
     * @return True if the file was downloaded successfully.  False otherwise.
     */
    public static boolean retrieveFile(InetAddress address, int port, String fileName, File destinationDirectory) {
        return false;
    }
}
