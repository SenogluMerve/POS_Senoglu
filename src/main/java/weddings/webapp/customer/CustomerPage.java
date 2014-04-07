package weddings.webapp.customer;

import org.apache.wicket.Component;

import weddings.webapp.WeddingManagementPage;


public class CustomerPage extends WeddingManagementPage {

    protected Component contentPanel() {
        return new WeddingPanel("weddingPanel");
    }
}
