package base.neuron;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 3:32 PM
 * Generalized abstraction for other types of neurons to subclass from
 */
public abstract class AbstractNeuron<N extends AbstractNeuron<N>> implements Serializable{
     //TODO document
    protected final String name;
    /**
     * The charge conducted
     */
    protected double conductivity;
    /**
     * Indicates if the neuron is active
     */
    protected boolean active;
    /**
     * Neurons the this transmits to
     */
    protected List<N> connections;
    /**
     * Accumulated potential
     */
    protected double membranePotential;

    protected AbstractNeuron(double conductivity) {
        this.conductivity = conductivity;
        this.name=UUID.randomUUID().toString();
    }
    protected AbstractNeuron(double conductivity, String name) {
        this.conductivity = conductivity;
        this.name=name;
    }

    /**
     * Should be able to check whether this is activated or not
     */
    public abstract void checkActivation();

    /**
     * Activates this
     */
    protected void activate(){
        this.active=true;
    }

    /**
     * Inactivates this
     */
    protected void inactivate(){
        this.active=false;
    }

    /**
     *
     * @return
     */
    public double getConductivity() {
        return conductivity;
    }

    public void setConductivity(double conductivity) {
        this.conductivity = conductivity;
    }

    public boolean isActive() {
        return active;
    }

    public void addConnection(N connection){
        this.connections.add(connection);
    }

    /**
     *
     */
    public abstract void transmit();
    public abstract void receiveTransmission(double ammount);
    protected abstract void cooldown();
}
