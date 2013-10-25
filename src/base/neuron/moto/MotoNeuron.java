package base.neuron.moto;

import base.neuron.AbstractNeuron;
import base.neuron.moto.event.NeuronListener;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class MotoNeuron extends AbstractMotoNeuron<MotoNeuron,NeuronListener<MotoNeuron>> {
    //Todo document
    public MotoNeuron(double conductivity, double threshold) {
        super(conductivity, threshold);
    }

    @Override
    public synchronized void notifyListeners() {
        for(NeuronListener nl:this.listeners){
            nl.receiveNeuronEvent(this);
        }
    }
}
