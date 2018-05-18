package org.vaadin.mikotin.events.internal;

import org.vaadin.mikotin.GoogleSignin;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

@DomEvent("google-signout-attempted")
public class InternalSignOutEvent extends ComponentEvent<GoogleSignin> {
    public InternalSignOutEvent(GoogleSignin source, boolean fromClient) {
        super(source, fromClient);
    }
}
