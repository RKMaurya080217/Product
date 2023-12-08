package com.product.dto;

public class ProductDTO {
	private int productid;
	private String productname;
	private String productdesc;
	private int productprice;
	private int productquantity;
	private boolean productstock;

	public ProductDTO() {
		super();
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}


	public boolean isProductstock() {
		return productstock;
	}

	public void setProductstock(boolean productstock) {
		this.productstock = productstock;
	}

	@Override
	public String toString() {
		return "ProductDTO [productid=" + productid + ", productname=" + productname + ", productdesc=" + productdesc
				+ ", productprice=" + productprice + ", productquantity=" + productquantity + ", productstock="
				+ productstock + "]";
	}

}
