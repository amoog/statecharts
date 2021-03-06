/* Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "TimedTransitions.h"

#include "TimedTransitionsRequired.h"
#include "sc_timer_service.h"


static TimedTransitions statechart;


//! The timers are managed by a timer service. */
static sc_unit_timer_service_t timer_service;
			
class TimedTransitionsTest : public ::testing::Test{
	protected:
	virtual void SetUp() {
		timedTransitions_init(&statechart);
		sc_timer_service_init(
			&timer_service,
			(sc_raise_time_event_fp) &timedTransitions_raiseTimeEvent,
			(sc_run_cycle_fp) &timedTransitions_runCycle,
			false,
			200,
			&statechart
		);
	}
};


TEST_F(TimedTransitionsTest, Timer01) {
	
	timedTransitions_enter(&statechart);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_Start));
	sc_timer_service_proceed_time(&timer_service, 2030);
	sc_timer_service_proceed_cycles(&timer_service, 1);
	EXPECT_TRUE(timedTransitions_isStateActive(&statechart, TimedTransitions_main_region_End));
}

void timedTransitions_setTimer(TimedTransitions* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&timer_service, timer);
}

void timedTransitions_unsetTimer(TimedTransitions* handle, const sc_eventid evid){
	delete_task(&timer_service, find_time_event(&timer_service, evid));
}

