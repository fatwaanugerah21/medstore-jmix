package com.company.medstore.screen.equipmentgroup;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.EquipmentGroup;

@UiController("EquipmentGroup.browse")
@UiDescriptor("equipment-group-browse.xml")
@LookupComponent("equipmentGroupsTable")
public class EquipmentGroupBrowse extends StandardLookup<EquipmentGroup> {
}