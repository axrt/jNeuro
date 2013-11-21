package base.neuron.pacemaker;

import base.neuron.AbstractNeuron;
import base.neuron.cortex.CortexNeuron;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 4:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class PacemakerNeuron<N extends AbstractNeuron<N>> extends CortexNeuron<N> {

    //TODO document


    protected PacemakerNeuron(double conductivity) {
        super(conductivity, 0);
        this.active=true;
    }
    protected PacemakerNeuron(double conductivity, String name) {
        super(conductivity, 0, name);
        this.active=true;
    }

    @Override
    public void checkActivation() {

    }

    @Override
    protected void cooldown() {

    }

    @Override
    public void receiveTransmission(double ammount) {

    }
}
