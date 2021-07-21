package com.company.medstore.screen.product;

import io.jmix.ui.component.GroupTable;
import io.jmix.ui.screen.*;
import com.company.medstore.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
public class ProductBrowse extends StandardLookup<Product> {

}