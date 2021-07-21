package com.company.medstore.screen.equipment;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.Equipment;

@UiController("Equipment.edit")
@UiDescriptor("equipment-edit.xml")
@EditedEntityContainer("equipmentDc")
public class EquipmentEdit extends StandardEditor<Equipment> {
}