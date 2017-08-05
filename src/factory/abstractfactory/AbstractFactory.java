package factory.abstractfactory;

/**
 * this is abstract factory pattern.
 * it creates a family of objects.
 * the concrete object is decided in subclass.
 */
public interface AbstractFactory {
    Parts createParts();
    Wood createWood();
}
