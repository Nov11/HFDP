package factory;

/**
 * this is factory method pattern.
 * the objects that it creates are depending on a interface/abstract class. as for this example, it's Product.
 * the subclass implementation decides what concrete class are the objects belonged to.
 * this is useful if workingProceduresOnProduct implies lots of works.
 */
public abstract class Creator {
    public Product getProduct(int productCode){
        Product p = createProduct(productCode);
        workingProceduresOnProduct(p);
        return p;
    }
    private void workingProceduresOnProduct(Product p){}
    protected abstract Product createProduct(int productCode);
}
