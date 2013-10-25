package base.neuron.cortex;

import base.neuron.AbstractNeuron;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class CortexNeuron extends AbstractNeuron<AbstractNeuron> {
    //Todo document
    protected double threshold;

    protected CortexNeuron(double conductivity, double threshold) {
        super(conductivity);
        this.threshold=threshold;
    }

    @Override
    public void checkActivation() {
        if(this.membranePotential>=this.threshold){
            this.activate();
        }else{
            this.cooldown();
        }
    }

    @Override
    public void transmit() {
        for(AbstractNeuron an:this.connections){
            an.receiveTransmission(this.conductivity);
        }
        this.cooldown();

    }

    @Override
    protected void cooldown() {
        this.membranePotential=0;
        this.inactivate();
    }

    @Override
    public void receiveTransmission(double ammount) {
        this.membranePotential+=ammount;
    }


}
