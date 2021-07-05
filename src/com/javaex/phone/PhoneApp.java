package com.javaex.phone;

import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {
		
		PhoneDao phoneDao = new PhoneDao();
	      List<PersonVo> personList;
	      
	   
		
		System.out.println("******************");
		System.out.println("* 전화 번호 *");
		System.out.println("******************");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.리스트  ");
			System.out.print("2.등록  ");
			System.out.print("3.수정");
			System.out.print("4.삭제  ");
			System.out.print("5.검색  ");
			System.out.println("6. 종료");
			System.out.println("---------------------");
			
			System.out.print("메뉴번호:");
			int num = sc.nextInt();
			sc.nextLine();
			
	
			
			 if(num == 1) {
				System.out.println("리스트");
				personList = phoneDao.getPhoneList();
				printList(personList);
				
			
				
				
			}else if (num == 2) {
				System.out.println("이름");
				String name = sc.nextLine();
				System.out.println("전화번호");
				String hp = sc.nextLine();
				System.out.println("회사번호");
				String company = sc.nextLine();
				
				PersonVo vo = new PersonVo(name,hp,company);
				phoneDao.PersonInsert(vo);
				
			}else if(num == 3) {
				System.out.println("수정");
				int idup = sc.nextInt();
				sc.nextLine();
				System.out.println("이름");
				String nameup = sc.nextLine();
				System.out.println("전화번호");
				String hpup = sc.nextLine();
				System.out.println("회사번호");
				String companyup = sc.nextLine();
				
				PersonVo voup = new PersonVo(idup,nameup,hpup,companyup);
				phoneDao.PersonUpdate(voup);
				
				
			}else if(num == 4) {
				System.out.println("삭제");
				int personId = sc.nextInt();
				
				PersonVo vode = new PersonVo(personId);
				phoneDao.PersonDelete(vode);
				
			}else if(num == 5) {
				System.out.println("검색어");
				
				String search = sc.nextLine();
				
				personList = phoneDao.getPhoneList(search);
				
				printList(personList);
				
			
				
			}else if(num==6) {
				
				System.out.println("종료");
				break;
			}else {
				System.out.println("다시입력해주세요.");
			}
			
			
			
			
		}
		
	

	}

	public static void printList(List<PersonVo> personList) {
		for(int i =0; i<personList.size(); i++) {
			
			PersonVo personVo =personList.get(i);
			System.out.println(personVo.getPersonId() +personVo.getName()+ personVo.getHp() + personVo.getCompany());
			
			/*
			int personId = personList.get(i).getPersonId();
			String name = personList.get(i).getName();
			String hp = personList.get(i).getHp();
			String company = personList.get(i).getCompany();
			
			System.out.println(personId+name+hp+company);
			*/
		}
	}


}
