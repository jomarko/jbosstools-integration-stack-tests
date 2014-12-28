package org.jboss.tools.bpmn2.reddeer.editor.jbpm.boundaryevents;

import org.jboss.tools.bpmn2.reddeer.editor.Element;
import org.jboss.tools.bpmn2.reddeer.editor.ElementType;
import org.jboss.tools.bpmn2.reddeer.editor.jbpm.eventdefinitions.TimerType;
import org.jboss.tools.bpmn2.reddeer.properties.shell.TimerSetUpCTab;

/**
 * 
 */
public class TimerBoundaryEvent extends BoundaryEvent {

	/**
	 * 
	 * @param name
	 */
	public TimerBoundaryEvent(String name) {
		super(name, ElementType.ERROR_BOUNDARY_EVENT);
	}
	
	public TimerBoundaryEvent(Element element) {
		super(element);
	}
	
	public void setTimer(TimerType timerType, String duration) {
		graphitiProperties.setUpTabs(new TimerSetUpCTab(timerType, duration));
		refresh();
	}
	
	public void setTimer(String duration) {
		setTimer(TimerType.DURATION, duration);
	}
	
}
