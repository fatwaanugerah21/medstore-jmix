package com.company.medstore.screen.master;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.Master;

@UiController("Master.browse")
@UiDescriptor("master-browse.xml")
@LookupComponent("table")
public class MasterBrowse extends MasterDetailScreen<Master> {
}