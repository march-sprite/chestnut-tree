package io.chestnut.core;



public class ChestnutComponent<T extends Chestnut> implements Comparable<ChestnutComponent<?>> {
	protected String componentId;
	protected int respondOrder;
	protected T componentOwner;
	
	@Override
	public int compareTo(ChestnutComponent<?> otherComponent) {
		return otherComponent.respondOrder > this.respondOrder?1:0;
	}
	
	
	public final T getOwner() {
		return componentOwner;
	}

	@SuppressWarnings("unchecked")
	public void setComponentOwner(Chestnut componentOwner) {
		this.componentOwner = (T) componentOwner;
	}

	
}
