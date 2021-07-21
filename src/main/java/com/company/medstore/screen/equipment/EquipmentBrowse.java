package com.company.medstore.screen.equipment;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.Equipment;

@UiController("Equipment.browse")
@UiDescriptor("equipment-browse.xml")
@LookupComponent("equipmentsTable")
public class EquipmentBrowse extends StandardLookup<Equipment> {
}