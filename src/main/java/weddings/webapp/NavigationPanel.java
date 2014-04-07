package weddings.webapp;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

import weddings.*;

public class NavigationPanel extends Panel {
    public NavigationPanel(String id) {
        super(id);
        add(new Link("navigateHelloWorld") {
            @Override
            public void onClick() {
                setResponsePage(HelloWorldPage.class);
            }
        });
        add(new Link("navigateCustomer") {
            @Override
            public void onClick() {
                setResponsePage(CustomerPage.class);
            }
        });
    }
}