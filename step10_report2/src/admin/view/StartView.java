package admin.view;

import controller.ProductController;
import model.domain.Product;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("1. ��� ��ǰ ���� �˻�");
		System.out.println("\n 1��  = A1/A2/A3 , 2��  = B1/B2/B3 , 3��  = C1/C2/C3  ");
		ProductController.getProductList();
		
		System.out.println("\n2. Ư�� ��ǰ ���� �˻�");
		ProductController.getProduct("���δ�");
		
		System.out.println("\n3. �������� �ʴ� ��ǰ ���� �˻�");
		ProductController.getProduct("��");
		
		System.out.println("\n4. ���ο� ��ǰ�� ���� ���");
		System.out.println(" 1) 6�� ���̾");
		Product newProduct = new Product("6�� ���̾", 3, "B1 - 3", 3000);
		ProductController.insertProductList(newProduct);
		System.out.println("\n 2) ���ڸ�");
		Product newProduct2 = new Product("���ڸ�", 7, "C1 - 3", 4500);
		ProductController.insertProductList(newProduct2);
		System.out.println("\n 3) ������");
		Product newProduct3 = new Product("C-TYPE ������", 35, "B2 - 1", 4000);
		ProductController.insertProductList(newProduct3);
		
		
		System.out.println("\n5. ���ο� ��ǰ ������ ���� �˻�");
		ProductController.getProduct("6�� ���̾");
		ProductController.getProduct("���ڸ�");
		
		System.out.println("\n6. ���� �� ��� ��ǰ �˻�");
		ProductController.getProductList();
		
		System.out.println("\n7. ������ ��ǰ�� ��� ������Ʈ");
		ProductController.updateProduct("������", 15);
		ProductController.updateProduct("�����ڷ�", 0);
	
		System.out.println("\n8. ��� ���� ������ ��ǰ �˻�");
		ProductController.getProduct("6�� ���̾");
		
		System.out.println("\n9. ��ǰ�� ��ġ ���� ���� �õ�");
		ProductController.updateProduct2("��ȸ�� ����ũ", "B1 - 3");
		ProductController.updateProduct2("C-TYPE ������", null);
		
		System.out.println("\n10. ��ǰ�� ��ġ ���� ���� �� �˻�");
		System.out.println("\n ��ȸ�� ����ũ�� ��ġ�� A1�� 1������ B1�� 2������ ��ǰ �̵��Ͽ����ϴ�.");
		System.out.println("\n C-TYPE ������� �����Ǿ� B2�� ��ġ�� ���� �������� �ʽ��ϴ�.");
		
		ProductController.getProduct("��ȸ�� ����ũ");
		ProductController.getProduct("C-TYPE ������");
		
		
		System.out.println("\n11. �����ϰ��� �ϴ� �׸�  �߸� �˻�");
		ProductController.deleteProduct("��Ǫ---");
		
		
		System.out.println("\n12. �����ϰ��� �ϴ� �׸� ����");
		ProductController.deleteProduct("��Ǫ");
		ProductController.deleteProduct("��ȸ�� ����ũ");
		ProductController.deleteProduct("��ī�� ����Ʈ");
		ProductController.deleteProduct("�̾���");
		ProductController.deleteProduct("�� ������ ���ڹ�");
		ProductController.deleteProduct("�޸� �� ���");
		ProductController.deleteProduct("����");
		ProductController.deleteProduct("ǳ��");
		ProductController.deleteProduct("��Ű���콺 �縻");
		
		System.out.println("\n13. ���� �� ���� �׸�");
		ProductController.getProductList();
	}
}
