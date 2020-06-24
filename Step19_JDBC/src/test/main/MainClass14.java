package test.main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JTable.PrintMode;

import test.DAO.MemberDAO;
import test.DTO.MemberDto;

public class MainClass14 {
	/*
	 * Scanner 객체를 이용해서 검색할 회원 번호를 입력 받아서
	 * 입력 받은 번호에 해당되는 회원 정보를 얻어와서
	 * 아래와같은 방식으로출력
	 */
	public static void main(String[] args) {
		
		while(true) {
			try {
				Scanner scan=new Scanner(System.in);
				System.out.println();
				System.out.println("회원번호입력");
				int num=scan.nextInt();
				MemberDAO dao=MemberDAO.getInstatnce();
				MemberDto dto=dao.getData(num);
				
				if(dto==null) {
					System.out.println(num+"번 회원은 존재하지 않습니다.");
				}else {
					printMember(dto);
					System.out.println(dto.getName()+"님의 정보가 검색 되었습니다");
				}
			}catch(Exception e){
				System.out.println("숫자를 입력해주세요");
			}
	
		}

	}
	public static void printMember(MemberDto dto) {
		System.out.println(dto.getNum()+"|"+dto.getName()+"|"+dto.getAddr());
	}
	
}
