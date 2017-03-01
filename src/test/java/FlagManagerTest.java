import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlagManagerTest {

    private FlagManager mCut;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void all_flags_off() throws Exception {
        // given
        mCut = new FlagManager(false, false, false, false);

        // when
        boolean areAllFlagsOff = mCut.areAllFlagsOff();

        // then
        assertTrue("This is the only situation where the method should be TRUE", areAllFlagsOff);
    }

    @Test
    public void only_one_flag_off() throws Exception {
        // given
        mCut = new FlagManager(true, false, false, false);

        // when
        boolean areAllFlagsOff = mCut.areAllFlagsOff();

        // then
        assertFalse(areAllFlagsOff);
    }

    @Test
    public void two_flags_off() throws Exception {
        // given
        mCut = new FlagManager(true, false, true, false);

        // when
        boolean areAllFlagsOff = mCut.areAllFlagsOff();

        // then
        assertFalse(areAllFlagsOff);
    }

    @Test
    public void three_flag_off() throws Exception {
        // given
        mCut = new FlagManager(false, false, false, true);

        // when
        boolean areAllFlagsOff = mCut.areAllFlagsOff();

        // then
        assertFalse(areAllFlagsOff);
    }

    @Test
    public void no_flags_off() throws Exception {
        // given
        mCut = new FlagManager(true, true, true, true);

        // when
        boolean areAllFlagsOff = mCut.areAllFlagsOff();

        // then
        assertFalse(areAllFlagsOff);
    }
}