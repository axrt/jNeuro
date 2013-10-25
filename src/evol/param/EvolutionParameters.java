package evol.param;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class EvolutionParameters {

     public final double probabilityOfANeuronToApper;
     public final double probabilityOfANeuronToVanish;
     public final double getProbabilityOfANeuronToGetANewConnection;
     public final double getProbabilityOfANeuronToLooseAConnection;

    protected EvolutionParameters(double probabilityOfANeuronToApper, double probabilityOfANeuronToVanish, double getProbabilityOfANeuronToGetANewConnection, double getProbabilityOfANeuronToLooseAConnection) {
        this.probabilityOfANeuronToApper = probabilityOfANeuronToApper;
        this.probabilityOfANeuronToVanish = probabilityOfANeuronToVanish;
        this.getProbabilityOfANeuronToGetANewConnection = getProbabilityOfANeuronToGetANewConnection;
        this.getProbabilityOfANeuronToLooseAConnection = getProbabilityOfANeuronToLooseAConnection;
    }
}
