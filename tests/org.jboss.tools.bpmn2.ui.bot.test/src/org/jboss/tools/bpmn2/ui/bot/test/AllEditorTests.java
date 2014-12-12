package org.jboss.tools.bpmn2.ui.bot.test;

import junit.framework.TestSuite;

import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.jboss.tools.bpmn2.ui.bot.test.testcase.editor.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(BPMN2Suite.class)
@SuiteClasses({
// Editor tests
// ------------
//	ParallelSplitJoinTest.class, //@BZ https://bugzilla.redhat.com/show_bug.cgi?id=1175772
//	CallActivityTest.class,
//	AdHocProcessTest.class, //@BZ https://bugzilla.redhat.com/show_bug.cgi?id=1147940
//	AdHocSubProcessTest.class,
//	AssociationTest.class,
//	BooleanStructureReferenceTest.class, //@BZ https://bugzilla.redhat.com/show_bug.cgi?id=1175772
//	BusinessRuleTaskTest.class,
//	BoundaryConditionalEventOnTaskTest.class, //@BZ https://bugzilla.redhat.com/show_bug.cgi?id=1175772
//	ErrorEndEventTest.class,
//	ConditionalStartTest.class,
//	ImportTest.class,
//	ReceiveTaskTest.class, 
//	ParallelSplitTest.class,
//	RuleTaskTest.class,
//	SendTaskTest.class, 
//	ErrorBoundaryEventOnTaskTest.class, //@BZ https://bugzilla.redhat.com/show_bug.cgi?id=1175772
//	IntermediateCatchEventTimerCycleTest.class,
//	MessageStartTest.class, // @BZ https://bugzilla.redhat.com/show_bug.cgi?id=1155707
//	SubProcessTest.class,
//	UserTaskTest.class, //@BZ https://bugzilla.redhat.com/show_bug.cgi?id=1175772
//	XPathExpressionTest.class, // @BZ https://bugzilla.redhat.com/show_bug.cgi?id=1176400
//	LaneTest.class,
//	DataObjectTest.class,
//	MultipleStartEventTest.class, //@BZ https://bugzilla.redhat.com/show_bug.cgi?id=1175772
//	InclusiveSplitTest.class,
//	//IntermediateThrowEventNoneTest.class, 
//	IntermediateThrowMessageEventTest.class,
//	IntermediateThrowEscalationEventTest.class, // https://bugzilla.redhat.com/show_bug.cgi?id=1162174
//	IntermediateCatchSignalSingleTest.class,
//	ExclusiveSplitPriorityTest.class, // @BZ https://bugzilla.redhat.com/show_bug.cgi?id=1176397
//	EventBasedSplitTest.class, 
//	BoundaryEscalationEventOnTaskTest.class, // https://bugzilla.redhat.com/show_bug.cgi?id=1165807
	ConditionalBoundaryEventInterruptingTest.class, // https://bugzilla.redhat.com/show_bug.cgi?id=1165667
})
public class AllEditorTests extends TestSuite {
	
	static {
		System.setProperty(SWTBotPreferences.KEY_MAX_ERROR_SCREENSHOT_COUNT, "0");
	}
	
}