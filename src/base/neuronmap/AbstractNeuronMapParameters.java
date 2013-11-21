package base.neuronmap;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractNeuronMapParameters {
    //TODO document
    protected final int maxNumberOfCortexNeurons;
    protected final int maxNumberOfConnectionsPerNeuron;

    protected AbstractNeuronMapParameters(int maxNumberOfCortexNeurons, int maxNumberOfConnectionsPerNeuron) {
        this.maxNumberOfCortexNeurons = maxNumberOfCortexNeurons;
        this.maxNumberOfConnectionsPerNeuron = maxNumberOfConnectionsPerNeuron;
    }
}
