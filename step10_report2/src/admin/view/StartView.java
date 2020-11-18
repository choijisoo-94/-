package admin.view;

import controller.ProductController;
import model.domain.Product;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("1. 모든 상품 정보 검색");
		System.out.println("\n 1층  = A1/A2/A3 , 2층  = B1/B2/B3 , 3층  = C1/C2/C3  ");
		ProductController.getProductList();
		
		System.out.println("\n2. 특정 상품 정보 검색");
		ProductController.getProduct("바인더");
		
		System.out.println("\n3. 존재하지 않는 상품 정보 검색");
		ProductController.getProduct("귤");
		
		System.out.println("\n4. 새로운 상품을 새로 등록");
		System.out.println(" 1) 6공 다이어리");
		Product newProduct = new Product("6공 다이어리", 3, "B1 - 3", 3000);
		ProductController.insertProductList(newProduct);
		System.out.println("\n 2) 돗자리");
		Product newProduct2 = new Product("돗자리", 7, "C1 - 3", 4500);
		ProductController.insertProductList(newProduct2);
		System.out.println("\n 3) 충전기");
		Product newProduct3 = new Product("C-TYPE 충전기", 35, "B2 - 1", 4000);
		ProductController.insertProductList(newProduct3);
		
		
		System.out.println("\n5. 새로운 상품 생성한 것을 검색");
		ProductController.getProduct("6공 다이어리");
		ProductController.getProduct("돗자리");
		
		System.out.println("\n6. 저장 후 모든 상품 검색");
		ProductController.getProductList();
		
		System.out.println("\n7. 저장한 상품의 재고 업데이트");
		ProductController.updateProduct("충전기", 15);
		ProductController.updateProduct("마대자루", 0);
	
		System.out.println("\n8. 재고 수량 개선한 상품 검색");
		ProductController.getProduct("6공 다이어리");
		
		System.out.println("\n9. 상품의 위치 정보 수정 시도");
		ProductController.updateProduct2("일회용 마스크", "B1 - 3");
		ProductController.updateProduct2("C-TYPE 충전기", null);
		
		System.out.println("\n10. 상품의 위치 정보 수정 후 검색");
		System.out.println("\n 일회용 마스크의 위치가 A1인 1층에서 B1인 2층으로 상품 이동하였습니다.");
		System.out.println("\n C-TYPE 충전기는 소진되어 B2의 위치에 현재 존재하지 않습니다.");
		
		ProductController.getProduct("일회용 마스크");
		ProductController.getProduct("C-TYPE 충전기");
		
		
		System.out.println("\n11. 삭제하고자 하는 항목  잘못 검색");
		ProductController.deleteProduct("샴푸---");
		
		
		System.out.println("\n12. 삭제하고자 하는 항목 삭제");
		ProductController.deleteProduct("샴푸");
		ProductController.deleteProduct("일회용 마스크");
		ProductController.deleteProduct("포카리 스웨트");
		ProductController.deleteProduct("이어폰");
		ProductController.deleteProduct("꽃 프린팅 에코백");
		ProductController.deleteProduct("메모리 폼 배게");
		ProductController.deleteProduct("이젤");
		ProductController.deleteProduct("풍선");
		ProductController.deleteProduct("미키마우스 양말");
		
		System.out.println("\n13. 삭제 후 남은 항목");
		ProductController.getProductList();
	}
}
