/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author usmck
 */
public class Connections {

    
    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        URL twitterURL = new URL("https://www.twitter.com");
        InetAddress twitterAdd = InetAddress.getByName("www.twitter.com");
        displayURL(twitterURL);
        displayInetAddressInformation(twitterAdd);
    }
        private static void displayURL(URL url){
        System.out.println("URL: " + url);
        System.out.printf("  Protocol: %-32s  Host: %-32s\n",
            url.getProtocol(),url.getHost());
        System.out.printf("      Port: %-32d  Path: %-32s\n", 
            url.getPort(),url.getPath());
        System.out.printf(" Reference: %-32s  File: %-32s\n",
            url.getRef(),url.getFile());
        System.out.printf(" Authority: %-32s Query: %-32s\n", 
            url.getAuthority(),url.getQuery());
        System.out.println(" User Info: " + url.getUserInfo());

    }
            private static void displayInetAddressInformation(
            InetAddress address) {
        System.out.println(address);
        System.out.println("CanonicalHostName: " +
            address.getCanonicalHostName());
        System.out.println("HostName: " + address.getHostName());
        System.out.println("HostAddress: " + 
            address.getHostAddress());
    }
}
