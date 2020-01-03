package com.ez.herb.product.model;

import java.util.List;

public interface ProductDAO {
	List<ProductVO> selectProductByEvent(String eventName);
	ProductVO selectProduct(int productNo);
	
}
