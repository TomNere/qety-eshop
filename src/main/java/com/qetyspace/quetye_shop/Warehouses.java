package com.qetyspace.quetye_shop;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Warehouses implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "Flowers")
	private java.util.List<com.qetyspace.quetye_shop.Flower> flowers;

	public Warehouses() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.util.List<com.qetyspace.quetye_shop.Flower> getFlowers() {
		return this.flowers;
	}

	public void setFlowers(
			java.util.List<com.qetyspace.quetye_shop.Flower> flowers) {
		this.flowers = flowers;
	}

	public Warehouses(java.lang.String name,
			java.util.List<com.qetyspace.quetye_shop.Flower> flowers) {
		this.name = name;
		this.flowers = flowers;
	}

}