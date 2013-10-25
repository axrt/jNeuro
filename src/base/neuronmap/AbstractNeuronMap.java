package base.neuronmap;

import base.neuron.AbstractNeuron;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractNeuronMap<N extends AbstractNeuron> implements Serializable {
    //TODO document
    protected List<N> neurons;

    protected AbstractNeuronMap(List<N> neurons) {
        this.neurons = neurons;
    }

    public void pulse(){
       for(N n:neurons){
           n.checkActivation();
       }
       for(N n:neurons){
           if(n.isActive()){
               n.transmit();
           }
       }
    }


}
