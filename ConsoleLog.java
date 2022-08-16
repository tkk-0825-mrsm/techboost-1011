import java.until.logging.*;
public class ConsoleLog{
    public static void main(String[] args) {
     Logger logger =
Logger.getLoger(ConsoleLog.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel1(Level.INFO);
        logger.addHandler(consoleHandler);
        logger.info("処理を開始しました。");
        logger.info("処理を終了しました。");

    }
}