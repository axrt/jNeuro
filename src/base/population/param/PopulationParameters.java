package base.population.param;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PopulationParameters {

    protected final int numberOfOrganismsInPopulation;

    protected PopulationParameters(int numberOfOrganismsInPopulation) {
        this.numberOfOrganismsInPopulation = numberOfOrganismsInPopulation;
    }
}
