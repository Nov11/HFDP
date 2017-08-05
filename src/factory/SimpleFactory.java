package factory;

/**
 * good old simple factory. it separates concrete object creation from the other parts.
 */
public class SimpleFactory {
    static Product createProduct(int productCode){
        switch (productCode){
            case 1:
                return new ProductionOne();
            case 2:
                return new ProductionTwo();
        }
        return null;
    }
}
