package base.neuron.moto.event;

import base.neuron.AbstractNeuron;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public interface NeuronListener <N extends AbstractNeuron>{
    //TODO document
    public void receiveNeuronEvent(N n);

}
