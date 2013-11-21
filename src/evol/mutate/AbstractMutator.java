package evol.mutate;

import base.neuron.AbstractNeuron;
import base.neuronmap.AbstractNeuronMap;
import base.neuronmap.AbstractNeuronMapParameters;
import evol.mutate.param.AbstractMutationParameters;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 21/11/13
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractMutator<M extends AbstractNeuronMap<N,P>,N extends AbstractNeuron<N>,P extends AbstractNeuronMapParameters, R extends AbstractMutationParameters> {
    //TODO document
    protected final R parameters;

    protected AbstractMutator(R parameters) {
        this.parameters = parameters;
    }

}
