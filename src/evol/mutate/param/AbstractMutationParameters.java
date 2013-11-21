package evol.mutate.param;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 21/11/13
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractMutationParameters {
    //TODO document
    protected final double maximumNeuronThresholdMutation;
    protected final double maximumNeuronConductivityMutation;

    protected AbstractMutationParameters(double maximumNeuronThresholdMutation, double maximumNeuronConductivityMutation) {
        this.maximumNeuronThresholdMutation = maximumNeuronThresholdMutation;
        this.maximumNeuronConductivityMutation = maximumNeuronConductivityMutation;
    }

    public double getMaximumNeuronThresholdMutation() {
        return maximumNeuronThresholdMutation;
    }

    public double getMaximumNeuronConductivityMutation() {
        return maximumNeuronConductivityMutation;
    }
}
