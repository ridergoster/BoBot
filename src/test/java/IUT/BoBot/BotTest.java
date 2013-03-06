package IUT.BoBot;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Integration tests checking the Bot
 * behavior. We just test some cases to make sure that the
 * Bot is using SmartCells properly.
 *
 */
public class BotTest 
{
	Bot bot = new Bot();
	
    @Test
    public void testBonjour()
    {
        assertEquals("Bonjour!", bot.ask("Bonjour"));
    }
    @Test
    public void testAurevoir()
    {
        assertEquals("Au revoir!", bot.ask("Merci pour tout. Au revoir"));
    }
    
    @Test
    public void testJeMAppelle()
    {
        assertEquals("Bonjour Seb!", bot.ask("Je m'appelle Seb"));
    }
    
    @Test
    public void testNull()
    {
        assertEquals(null, bot.ask("This is not a question."));
    }
    
    @Test
    public void testSalut()
    {
    	assertEquals ("salut", bot.ask("salut"));
    }
    
    @Test
    public void Numeral2Roman()
    {
    	assertEquals("I", bot.ask("1 en romain?"));
    }
    
    @Test
    public void Roman2Numeral()
    {
    	assertEquals("6", bot.ask("VI en nombre arabe?"));
    }
}
