package com.company.medstore.screen.smallstorage;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.SmallStorage;

@UiController("SmallStorage.browse")
@UiDescriptor("small-storage-browse.xml")
@LookupComponent("smallStoragesTable")
public class SmallStorageBrowse extends StandardLookup<SmallStorage> {
}