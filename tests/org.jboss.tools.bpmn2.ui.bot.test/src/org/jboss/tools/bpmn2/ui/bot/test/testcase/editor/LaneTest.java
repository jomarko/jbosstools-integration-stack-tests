package org.jboss.tools.bpmn2.ui.bot.test.testcase.editor;

import org.jboss.tools.bpmn2.reddeer.DefaultOutlineView;
import org.jboss.tools.bpmn2.reddeer.editor.ElementType;
import org.jboss.tools.bpmn2.reddeer.editor.jbpm.activities.UserTask;
import org.jboss.tools.bpmn2.reddeer.editor.jbpm.startevents.StartEvent;
import org.jboss.tools.bpmn2.reddeer.editor.jbpm.swimlanes.Lane;
import org.jboss.tools.bpmn2.ui.bot.test.JBPM6BaseTest;
import org.jboss.tools.bpmn2.ui.bot.test.jbpm.JbpmAssertions;
import org.jboss.tools.bpmn2.ui.bot.test.requirements.ProcessDefinitionRequirement.ProcessDefinition;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;
import org.jboss.tools.bpmn2.reddeer.editor.jbpm.Process;

@ProcessDefinition(name="BPMN2-Lane", project="EditorTestProject")
public class LaneTest extends JBPM6BaseTest {

	DefaultOutlineView outlineView = new DefaultOutlineView();
	
	@Override
	public void buildProcessModel() {
		new StartEvent("StartProcess").delete();
		
		Process process = new Process("BPMN2-Lane");
		process.add("Manager", ElementType.LANE);
		
		Lane lane = new Lane("Manager");
		lane.add("StartProcess", ElementType.START_EVENT);
		
		
		StartEvent start = new StartEvent("StartProcess");
		start.append("ManagerIssues", ElementType.USER_TASK);

		UserTask manager = new UserTask("ManagerIssues");
		manager.addActor("frank");
		manager.append("EndProcess", ElementType.END_EVENT);
	}

	@Override
	public void assertRunOfProcessModel(KieSession kSession) {
		ProcessInstance processInstance = kSession.startProcess("BPMN2Lane");
		JbpmAssertions.assertProcessInstanceCompleted(processInstance, kSession);
	}
}