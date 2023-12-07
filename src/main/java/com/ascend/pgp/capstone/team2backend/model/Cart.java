package com.ascend.pgp.capstone.team2backend.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Document("Cart")
public class Cart {

	@Id
	private BigInteger _id;
	private BigInteger itemId;
	private BigInteger quantity;

	public Cart(BigInteger itemId, BigInteger quantity) {
		super();
		this.itemId = itemId;
		this.quantity = quantity;
	}

	public BigInteger get_id() {
		return _id;
	}

	public void set_id(BigInteger _id) {
		this._id = _id;
	}

	public BigInteger getItemId() {
		return itemId;
	}

	public void setItemId(BigInteger itemId) {
		this.itemId = itemId;
	}

	public BigInteger getQuantity() {
		return quantity;
	}

	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}

}
