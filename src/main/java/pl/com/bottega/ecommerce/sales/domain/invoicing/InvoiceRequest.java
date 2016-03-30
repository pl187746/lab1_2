package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.sales.domain.purchase.Item;

public class InvoiceRequest {
	private ClientData client;	
	private List<Item> items = new ArrayList<Item>();
	
	public InvoiceRequest(ClientData client){
		this.client = client;
	}
	
	public void add(Item item){
		items.add(item);
	}
	
	public ClientData getClient() {
		return client;
	}
	
	public Collection<Item> getItems() {
		return Collections.unmodifiableCollection(items);
	}

	public ClientData getClientData() {
		return client;
	}
}
