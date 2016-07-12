/*
 * Util.java
 *
 * Created on 20 de Agosto de 2005, 23:41
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package detetive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Estivador
 */
public class Util {
    public static final String getExternalIP() { 
       try { 
           URL url = new URL("http://checkip.dyndns.org/"); 
           BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));           
           Pattern p = Pattern.compile("[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}"); 
           Matcher mtr = p.matcher(in.readLine()); 
           mtr.find(); 
           return mtr.group(); 
       } catch(MalformedURLException e) { 
           e.printStackTrace(); 
       } catch(IOException e) { 
           e.printStackTrace(); 
       } 
       return null; 
   }
}
