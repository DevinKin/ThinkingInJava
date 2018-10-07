package interfaces.interfaceprocessor;

/**
 * @author devinkin
 * <p>Title: Processor</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 17:09 2018/9/21
 */


public interface Processor {
    String name();
    Object process(Object input);
}
