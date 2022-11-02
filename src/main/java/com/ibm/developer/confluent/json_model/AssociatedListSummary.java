package com.ibm.developer.confluent.json_model;

import java.util.List;

public class AssociatedListSummary {
private List<AssociatedDispatches> associatedDispatches;

/**
 * @return the associatedDispatches
 */
public List<AssociatedDispatches> getAssociatedDispatches() {
	return associatedDispatches;
}

/**
 * @param associatedDispatches the associatedDispatches to set
 */
public void setAssociatedDispatches(List<AssociatedDispatches> associatedDispatches) {
	this.associatedDispatches = associatedDispatches;
}
}
