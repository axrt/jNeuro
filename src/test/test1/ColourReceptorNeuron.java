package test.test1;

import base.neuron.AbstractReceptorNeuron;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ColourReceptorNeuron extends AbstractReceptorNeuron<Colour> {

    public ColourReceptorNeuron(double conductivity, double threshold) {
        super(conductivity, threshold);
    }

    @Override
    public void receiveSignal(Colour color) {
        switch (color){
            case BLUE:this.conductivity=100;break;
            case RED:this.conductivity=200;break;
            case YELLOW:this.conductivity=300;break;
            case GREEN:this.conductivity=400;break;
        }
    }
}
