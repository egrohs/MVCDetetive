//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\Model\\BoardManagement.java

package detetive.model;

import java.awt.Point;

import detetive.model.ai.Path;

public class BoardManagement 
{
   Path path;
   
   /**
    * @param from
    * @param room
    * @return Point
    * @roseuid 432F386A02FD
    */
   private Point findDoorway(Point from, char room) 
   {
    return null;
   }
   
   /**
    * @param door
    * @param room
    * @return Point
    * @roseuid 432F386A030D
    */
   private Point findNearestDoor(Point door, char room) 
   {
    return null;
   }
   
   /**
    * @param character
    * @param from
    * @param to
    * @param dice
    * @roseuid 432F386A031C
    */
   public void move(int character, Point from, Point to, int dice) 
   {
    
   }
   
   /**
    * @param toRoom
    * @param character
    * @param from
    * @param to
    * @param dice
    * @roseuid 432F386A032D
    */
   public void tryEnterRoom(char toRoom, int character, Point from, Point to, int dice) 
   {
    
   }
   
   /**
    * @param myRoom
    * @param character
    * @param from
    * @param to
    * @param dice
    * @roseuid 432F386A033C
    */
   private void tryExitRoom(char myRoom, int character, Point from, Point to, int dice) 
   {
    
   }
   
   /**
    * @param place
    * @return int
    * @roseuid 432F386A034C
    */
   public int getRoom(Point place) 
   {
    return 0;
   }
   
   /**
    * @param room
    * @return int
    * @roseuid 432F386A035A
    */
   public int getRoom(char room) 
   {
    return 0;
   }
   
   /**
    * @param character
    * @return int
    * @roseuid 432F386A0369
    */
   public int getRoom(int character) 
   {
    return 0;
   }
   
   /**
    * @param item
    * @param to
    * @roseuid 432F386A036B
    */
   public void posItem(int item, Point to) 
   {
    
   }
   
   /**
    * @param room
    * @return Point
    * @roseuid 432F386A0379
    */
   public Point findEmptyPlace(char room) 
   {
    return null;
   }
   
   /**
    * @param except
    * @param to
    * @return boolean
    * @roseuid 432F386A0388
    */
   public boolean isValidSquare(int except, Point to) 
   {
    return true;
   }
   
   /**
    * @param except
    * @param lin
    * @param col
    * @return boolean
    * @roseuid 432F386A038B
    */
   public boolean isEmptySquare(int except, int lin, int col) 
   {
    return true;
   }
   
   /**
    * @param except
    * @param to
    * @return boolean
    * @roseuid 432F386A039B
    */
   public boolean isEmptySquare(int except, Point to) 
   {
    return true;
   }
   
   /**
    * @return Returns the dice.
    * @roseuid 432F386A03A9
    */
   public int getDice() 
   {
    return 0;
   }
   
   /**
    * @param dice
    * The dice to set.
    * @param dice
    * @roseuid 432F386A03AA
    */
   public void setDice(int dice) 
   {
    
   }
}
