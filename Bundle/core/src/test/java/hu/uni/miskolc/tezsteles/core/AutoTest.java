package hu.uni.miskolc.tezsteles.core;

import junit.framework.TestCase;
import org.junit.Test;


public class AutoTest {

    @Test
    public void testajtokSzamaMegfelelo() throws AjtokSzamaNemMegfelelo{
        Auto auto = new Auto();
        auto.setAjtokSzama(3);

    }
    @Test(expected= AjtokSzamaNemMegfelelo.class)
    public void testajtokSzamaTulMagas() throws AjtokSzamaNemMegfelelo{
        Auto auto = new Auto();
        auto.setAjtokSzama(6);
    }
    @Test(expected= AjtokSzamaNemMegfelelo.class)
    public void testajtokSzamaTulAlacsony() throws AjtokSzamaNemMegfelelo{
        Auto auto = new Auto();
        auto.setAjtokSzama(-1);
    }

}