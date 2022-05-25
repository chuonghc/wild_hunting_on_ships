import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Savage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Savage extends Actor
{
    private int HP;
    
    protected int Velocity;
    
    protected int SpearVelocity;
    
    protected int SpearDamage;
    
    public Savage(int hp, int velocity)
    {
        HP = hp;
        Velocity = velocity;
        SpearVelocity = 7; SpearDamage = 34;
    }
    /**
     * Act - do whatever the Savage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public int getHP() {return HP; }
    
    
    public void minusHP(int damage)
    {
    
        HP = HP - damage;
        if (HP <= 0) 
        {
            getWorld().removeObject(this);
        }  
    }
    public void MoveTo(int x, int y)
    {
        turnTowards(x,y);
        
    }
    
    public void Shot(int targetX, int targetY)
    {
        getWorld().addObject(new Spear(targetX,targetY,SpearVelocity,SpearDamage),getX(),getY());
    }
}
