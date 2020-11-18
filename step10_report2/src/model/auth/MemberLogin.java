package model.auth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import controller.OptionController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MemberLogin {
	static Scanner scan = new Scanner(System.in);

	public static boolean loginDaiso(){
		boolean passCustomer = true;
		int pass = 0;
		System.out.println("�α����� ����  ID�� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("ID : ");
		String ID = scan.nextLine();
		System.out.print("PW : ");
		String PW = scan.nextLine();
		File file = new File("C:\\Users\\Playdata\\Desktop\\MemberDB.txt");
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			try {
				while((line = bufReader.readLine()) != null) {
					int passID = line.indexOf(ID);
					int passPW = line.indexOf(PW);
					if(passID != -1 && passPW != -1) {
						log.info(ID + "�����Բ��� �α����� �ϼ̽��ϴ�.(�α��α�� ����)");
						System.out.println();
						System.out.println("�α��� �Ǽ̽��ϴ�. ���̼ҿ� ���Ű� ȯ���մϴ�!^^");
						pass = 1;}	}
				if(pass == 0) {
					System.out.println("�α��� �����Դϴ�. ȸ�������� �������ּ���.");
					return false;}
					bufReader.close();
			} catch (IOException e) {
				//e.printStackTrace();
				view.FailView.failMessageView("�����ͺ��̽� ���� ����� �����Դϴ�.");
			}
		}catch (FileNotFoundException e) {
			//e.printStackTrace();
			view.FailView.failMessageView("�����ͺ��̽� ������ ã�� �� �����ϴ�.");
		}
		return true;
	}
}
