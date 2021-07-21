package com.company.medstore.screen.smallstorage;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.SmallStorage;

@UiController("SmallStorage.edit")
@UiDescriptor("small-storage-edit.xml")
@EditedEntityContainer("smallStorageDc")
public class SmallStorageEdit extends StandardEditor<SmallStorage> {
}