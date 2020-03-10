package vijayacollections;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        MyList<Integer> ml = new MyList<Integer>();
        for(int i = 0;i<15;i++)
        {
            ml.add(i);
        }
        ml.remove(3);
        ml.remove(3);
        LOGGER.info("Size of List :"+ml.size()+"");
        LOGGER.info("Print List\n");
        LOGGER.info(" List : \n");
        ml.display();
    }
}