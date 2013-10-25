import base.neuronmap.AbstractNeuronMap;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 7:15 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractOrganism<M extends AbstractNeuronMap> implements Comparable<AbstractOrganism>{

    protected int score;
    protected M neuronMap;

}
