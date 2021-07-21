package com.company.medstore.screen.equipmentgroup;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.EquipmentGroup;

@UiController("EquipmentGroup.edit")
@UiDescriptor("equipment-group-edit.xml")
@EditedEntityContainer("equipmentGroupDc")
public class EquipmentGroupEdit extends StandardEditor<EquipmentGroup> {
}