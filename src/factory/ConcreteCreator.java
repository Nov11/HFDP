package factory;

public class ConcreteCreator extends Creator {
    @Override
    protected Product createProduct(int productCode) {
        switch (productCode){
            case 1:
                return new ProductionOne();
            case 2:
                return new ProductionTwo();
        }
        return null;
    }
}
