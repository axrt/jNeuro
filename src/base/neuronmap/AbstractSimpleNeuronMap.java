package base.neuronmap;

import base.neuron.AbstractNeuron;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 21/11/13
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractSimpleNeuronMap<N extends AbstractNeuron<N>, P extends AbstractNeuronMapParameters>
        extends AbstractNeuronMap<N,P> {

    protected AbstractSimpleNeuronMap(P parameters) {
        super(parameters);
    }
}
