package weddings.webapp.customer;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.list.PropertyListView;

import weddings.domain.Customer;
import weddings.webapp.ContentPanel;

public class WeddingPanel extends ContentPanel {
    private List<Customer> customerList = new ArrayList<>();

    public WeddingPanel(String id) {
        super(id);
        add(new CustomerForm("customerForm", customerList));

        add(new PropertyListView<Customer>("customerList", customerList) {
            @Override
            public void populateItem(final ListItem<Customer> listItem) {
                listItem.add(new Label("firstName"));
                listItem.add(new MultiLineLabel("lastName"));
                listItem.add(new MultiLineLabel("address"));
            }
        }).setVersioned(false);
    }
}
