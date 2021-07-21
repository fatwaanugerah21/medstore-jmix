package com.company.medstore.screen.importtobigstorage;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.ImportToBigStorage;

@UiController("ImportToBigStorage.browse")
@UiDescriptor("import-to-big-storage-browse.xml")
@LookupComponent("table")
public class ImportToBigStorageBrowse extends MasterDetailScreen<ImportToBigStorage> {
}