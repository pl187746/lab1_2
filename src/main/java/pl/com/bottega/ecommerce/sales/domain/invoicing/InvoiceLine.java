/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductData;
import pl.com.bottega.ecommerce.sales.domain.purchase.Item;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class InvoiceLine {

	private Item item;

	private Money gros;

	private Tax tax;

	InvoiceLine(Item item, Tax tax) {
		this.item = item;
		this.tax = tax;

		this.gros = item.getTotalCost().add(tax.getAmount());
	}
	
	public Item getItem() {
		return item;
	}

	public ProductData getProduct() {
		return item.getProductData();
	}

	public int getQuantity() {
		return item.getQuantity();
	}

	public Money getNet() {
		return item.getTotalCost();
	}

	public Money getGros() {
		return gros;
	}

	public Tax getTax() {
		return tax;
	}
}
