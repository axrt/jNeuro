package base.neuronmap;

import base.neuron.AbstractNeuron;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractNeuronMap<N extends AbstractNeuron<N>,P extends AbstractNeuronMapParameters> extends ArrayList<N> {
    //TODO document

    protected final P parameters;
    protected AbstractNeuronMap(P parameters) {
        this.parameters=parameters;
    }

    public void pulse(){
       for(N n:this){
           n.checkActivation();
       }
       for(N n:this){
           if(n.isActive()){
               n.transmit();
           }
       }
    }

    public abstract void populate();
}
