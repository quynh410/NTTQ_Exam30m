package ra.presentation;

import ra.util.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nguyên: ");
        String intInp =  sc.nextLine();
        System.out.println(Validator.validInteger(intInp)? "Hợp lê" : "Không hợp lệ");

        System.out.println("Nhập số thưc float: ");
        String inpFloat = sc.nextLine();
        System.out.println(Validator.validFloat((inpFloat)) ? "Hợp lê" : "Không hợp lệ");

        System.out.println("Nhập số Double: ");
        String inpDouble = sc.nextLine();
        System.out.println(Validator.validDouble(inpDouble) ? "Hợp lê" : "Không hợp lệ");

        System.out.println("Nhập giá trị boolean true/false: ");
        String inpBoolean = sc.nextLine();
        System.out.println(Validator.validBoolean(inpBoolean)? "Hợp lê" : "Không hợp lệ");

        System.out.println("Nhập chuỗi 1 chuỗi : ");
        String inp1 = sc.nextLine();
        System.out.println(Validator.validString(inp1 ,1,20) ? "Hợp lê" : "Không hợp lệ");

        System.out.println("Nhập email: ");
        String inpEmail = sc.nextLine();
        System.out.println(Validator.validEmail(inpEmail)? "Hợp lê" : "Không hợp lệ");

        System.out.println("Nhập số điện thoại : ");
        String inpPhone = sc.nextLine();
        System.out.println(Validator.validPhone(inpPhone)? "Hợp lê" : "Không hợp lệ");
    }
}
