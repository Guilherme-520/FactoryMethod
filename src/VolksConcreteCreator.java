public class VolksConcreteCreator extends CarCreator {

    @Override
    protected Car factoryMethod() {
        return new ConcreteProductGol();
    }
}
