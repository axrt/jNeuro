package evol.recombine.param;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractRecombinationParameters {

    //TODO document
    protected final double probabilityOfANeuronToApper;
    protected final double probabilityOfANeuronToVanish;
    protected final double probabilityOfANeuronToGetANewConnection;
    protected final double probabilityOfANeuronToLooseAConnection;
    protected final double probabilityOfThatANeuronIsTakenFromOneParent;

    protected AbstractRecombinationParameters(double probabilityOfANeuronToApper, double probabilityOfANeuronToVanish, double probabilityOfANeuronToGetANewConnection, double probabilityOfANeuronToLooseAConnection, double probabilityOfThatANeuronIsTakenFromOneParent) {
        this.probabilityOfANeuronToApper = probabilityOfANeuronToApper;
        this.probabilityOfANeuronToVanish = probabilityOfANeuronToVanish;
        this.probabilityOfANeuronToGetANewConnection = probabilityOfANeuronToGetANewConnection;
        this.probabilityOfANeuronToLooseAConnection = probabilityOfANeuronToLooseAConnection;
        this.probabilityOfThatANeuronIsTakenFromOneParent = probabilityOfThatANeuronIsTakenFromOneParent;
    }

    public double getProbabilityOfANeuronToApper() {
        return probabilityOfANeuronToApper;
    }

    public double getProbabilityOfANeuronToVanish() {
        return probabilityOfANeuronToVanish;
    }

    public double getProbabilityOfANeuronToGetANewConnection() {
        return probabilityOfANeuronToGetANewConnection;
    }

    public double getProbabilityOfANeuronToLooseAConnection() {
        return probabilityOfANeuronToLooseAConnection;
    }

    public double getProbabilityOfThatANeuronIsTakenFromOneParent() {
        return probabilityOfThatANeuronIsTakenFromOneParent;
    }
}
