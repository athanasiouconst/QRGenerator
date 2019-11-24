import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HelloJavaLogging!
 *
 */
public class HelloJavaLogging
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(HelloJavaLogging.class);
        logger.info("This is how you configure Java Logging with SLF4J");
    }
}
