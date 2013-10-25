package evol;

import base.neuronmap.AbstractNeuronMap;
import evol.param.EvolutionParameters;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractRecombinator<M extends AbstractNeuronMap,E extends EvolutionParameters> {
      protected Random R;

      public abstract M recombineMaps(M male, M female,E evolParams);

}
