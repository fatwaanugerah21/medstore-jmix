package com.company.medstore.screen.department;

import io.jmix.ui.screen.*;
import com.company.medstore.entity.Department;

@UiController("Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
public class DepartmentBrowse extends StandardLookup<Department> {
}