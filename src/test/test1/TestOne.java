package test.test1;

import base.neuron.cortex.CortexNeuron;
import base.neuron.moto.MotoNeuron;
import base.neuron.pacemaker.PacemakerNeuron;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alext
 * Date: 25/10/13
 * Time: 6:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestOne {


    @Test
    public void test(){

        List<ColourReceptorNeuron> receptors= new ArrayList<ColourReceptorNeuron>(10);
        List<CortexNeuron> cortexNeurons=new ArrayList<CortexNeuron>(1000);
        List<MotoNeuron> motoNeurons=new ArrayList<MotoNeuron>(1);
        List<PacemakerNeuron> pacemakerNeurons=new ArrayList<PacemakerNeuron>(4);
        List<CortexNeuron> fullList=new ArrayList<CortexNeuron>(receptors.size()+cortexNeurons.size()+motoNeurons.size()+pacemakerNeurons.size());





        fullList.addAll(receptors);
        fullList.addAll(motoNeurons);
        fullList.addAll(pacemakerNeurons);
        fullList.addAll(cortexNeurons);



    }
}
