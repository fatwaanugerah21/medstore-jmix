package com.company.medstore.screen.product;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.Product;

@UiController("Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
public class ProductEdit extends StandardEditor<Product> {
}