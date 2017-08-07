package template;

/**
 * template pattern:
 * it defines the skeleton of a algorithm, deferring some steps to a subclass.
 * this retains the algorithm structure and provide subclass the ability to redefine certain behavior.
 */
public abstract class Template {

    //this is the skeleton of the algorithm
    //some procedure is defined, some is not.
    //not defined ones should be provided in subclass.
    public final void someAlgorithm(){
        procedure1();
        procedure2();
        procedure3();
        hook();
    }

    //must override this
    abstract protected void procedure1();

    //it can also be marked 'final'. anyway, this is not to be changed in subclass.
    private void procedure2(){

    }

    //must be override
    abstract protected void procedure3();

    //it's optional to alter this
    protected void hook(){
        System.out.println("overridable default hook");
    }
}
