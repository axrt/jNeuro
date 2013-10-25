package base.neuron.moto;

import base.neuron.AbstractNeuron;
import base.neuron.cortex.CortexNeuron;
import base.neuron.moto.event.NeuronListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractMotoNeuron<M extends AbstractMotoNeuron, N extends NeuronListener<M>> extends CortexNeuron {
    //Todo document
    protected List<N> listeners;

    protected AbstractMotoNeuron(double conductivity, double threshold) {
        super(conductivity, threshold);
    }

    public synchronized void addListener(N listener) {
        this.listeners.add(listener);
    }

    public abstract void notifyListeners();

    @Override
    public void transmit() {
        super.transmit();
        this.notifyListeners();
    }
}
