package org.mikotin.googlesignin.events.internal;

import org.mikotin.googlesignin.GoogleSignin;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

@DomEvent("google-signout-attempted")
public class InternalSignOutEvent extends ComponentEvent<GoogleSignin> {
	private static final long serialVersionUID = 582900770044067825L;

	public InternalSignOutEvent(GoogleSignin source, boolean fromClient) {
        super(source, fromClient);
    }
}
