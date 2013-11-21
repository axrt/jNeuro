package base.neuron.recept;

import base.neuron.AbstractNeuron;
import base.neuron.cortex.CortexNeuron;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractReceptorNeuron<N extends AbstractNeuron, T extends Receptable> extends CortexNeuron<N> {
    //TOdo document
    protected AbstractReceptorNeuron(double conductivity, double threshold) {
        super(conductivity, threshold);
    }

    public abstract void receiveSignal(T t);
}
