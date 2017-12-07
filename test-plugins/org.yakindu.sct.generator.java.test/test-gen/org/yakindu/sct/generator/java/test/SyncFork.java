/* Generated by YAKINDU Statechart Tools code generator. */

package org.yakindu.sct.generator.java.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.yakindu.scr.syncfork.SyncForkStatemachine;
import org.yakindu.scr.syncfork.SyncForkStatemachine.State;	
import org.yakindu.scr.VirtualTimer;
import org.yakindu.scr.VirtualTimer.VirtualTimeTask;
import org.yakindu.scr.VirtualTimer.CycleTimeEventTask;

/**
 * Unit TestCase for SyncFork
 */
@SuppressWarnings("all")
public class SyncFork {
	
	private SyncForkStatemachine statemachine;	
	private VirtualTimer timer;
	
	
	@Before
	public void syncFork_setUp() {
		statemachine = new SyncForkStatemachine();
		timer = new VirtualTimer(200);
		timer.schedulePeriodicalTask(new CycleTimeEventTask(statemachine), 200, 200);
		statemachine.init();
	}

	@After
	public void syncFork_tearDown() {
		statemachine = null;
		
		timer = null;
	}
	
	@Test
	public void syncForkTest() {
		statemachine.enter();
		assertTrue(statemachine.isStateActive(State.main_region_A));
		statemachine.getSCInterface().raiseF();
		timer.cycleLeap(1);
		assertTrue(statemachine.isStateActive(State.main_region_B));
		assertTrue(statemachine.isStateActive(State.main_region_B_r1_C1));
		assertTrue(statemachine.isStateActive(State.main_region_B_r2_D1));
		statemachine.getSCInterface().raiseF();
		timer.cycleLeap(1);
		assertTrue(statemachine.isStateActive(State.main_region_B));
		assertTrue(statemachine.isStateActive(State.main_region_B_r1_C2));
		assertTrue(statemachine.isStateActive(State.main_region_B_r2_D2));
		statemachine.getSCInterface().raiseE();
		timer.cycleLeap(1);
		assertTrue(statemachine.isStateActive(State.main_region_A));
		statemachine.getSCInterface().raiseF();
		timer.cycleLeap(1);
		assertTrue(statemachine.isStateActive(State.main_region_B));
		assertTrue(statemachine.isStateActive(State.main_region_B_r1_C1));
		assertTrue(statemachine.isStateActive(State.main_region_B_r2_D1));
	}
}
