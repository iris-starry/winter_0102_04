package vendingmachine.vo;

import java.util.ArrayList;

public class ProductDAO {
	ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
	
	public void insert(ProductVO vo) {
		productList.add(vo);
	}
	
	public ArrayList<ProductVO> select() {
		return productList;
	}
}