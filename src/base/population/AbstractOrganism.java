package base.population;

import base.neuron.AbstractNeuron;
import base.neuronmap.AbstractNeuronMap;
import base.neuronmap.AbstractNeuronMapParameters;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 7:15 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractOrganism<M extends AbstractNeuronMap<N,P>,
        N extends AbstractNeuron<N>,P extends AbstractNeuronMapParameters> implements Comparable<M>{

    protected final String name;
    protected int score;
    protected M neuronMap;

    protected AbstractOrganism(String name) {
        this.name = name;
    }

    protected AbstractOrganism(M neuronMap, String name) {
        this.neuronMap = neuronMap;
        this.name = name;
    }
    public void nullScore(){
        this.score=0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public M getNeuronMap() {
        return neuronMap;
    }

}
