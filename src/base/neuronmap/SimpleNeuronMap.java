package base.neuronmap;

import base.neuron.AbstractNeuron;
import base.neuron.AbstractReceptorNeuron;
import base.neuron.cortex.CortexNeuron;
import base.neuron.moto.MotoNeuron;
import base.neuron.pacemaker.PacemakerNeuron;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 5:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleNeuronMap extends AbstractNeuronMap<CortexNeuron> {
    //TODO document
    public SimpleNeuronMap(List<CortexNeuron> neurons) {
        super(neurons);
    }
}
