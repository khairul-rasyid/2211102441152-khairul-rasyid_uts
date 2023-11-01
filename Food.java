import greenfoot.*;
import java.util.Random;
public class Food extends Actor
{
    Random r = new Random();
    public void act()
    {
        while(getOneIntersectingObject(Head.class)!=null)setLocation(r.nextInt(getWorld().getWidth()), r.nextInt(getWorld().getHeight()));
    }
}