package base.population;

import base.neuron.AbstractNeuron;
import base.neuronmap.AbstractNeuronMap;
import base.neuronmap.AbstractNeuronMapParameters;
import base.population.param.PopulationParameters;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 6:44 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractPopulation<O extends AbstractOrganism,
        M extends AbstractNeuronMap<N,P>,
        N extends AbstractNeuron<N>,P extends AbstractNeuronMapParameters,
        R extends PopulationParameters> extends ArrayList<O> 
        implements Comparable<AbstractPopulation<O,M,N,P,R>>{

    //TODO document
    protected final R parameters;

    protected AbstractPopulation(int initialCapacity, R parameters) {
        super(initialCapacity);
        this.parameters = parameters;
    }

    protected AbstractPopulation(R parameters) {
        this.parameters = parameters;
    }

    public abstract void populate();
}
