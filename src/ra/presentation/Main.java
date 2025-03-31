package presentation;

import ra.util.Validator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        String intInput = scanner.nextLine();
        if (Validator.validInteger(intInput)) {
            System.out.println("Số nguyên hợp lệ");
        } else {
            System.out.println("Số nguyên không hợp lệ");
        }

        System.out.print("Nhập một số thực (float): ");
        String floatInput = scanner.nextLine();
        if (Validator.validFloat(floatInput)) {
            System.out.println("Số thực hợp lệ");
        } else {
            System.out.println("Số thực không hợp lệ");
        }

        System.out.print("Nhập một số thực (double): ");
        String doubleInput = scanner.nextLine();
        if (Validator.validDouble(doubleInput)) {
            System.out.println("Số thực hợp lệ");
        } else {
            System.out.println("Số thực không hợp lệ");
        }

        System.out.print("Nhập một giá trị boolean (true/false): ");
        String boolInput = scanner.nextLine();
        if (Validator.validBoolean(boolInput)) {
            System.out.println("Giá trị boolean hợp lệ");
        } else {
            System.out.println("Giá trị boolean không hợp lệ");
        }

        System.out.print("Nhập một chuỗi: ");
        String strInput = scanner.nextLine();
        if (Validator.validString(strInput, 3, 10)) {
            System.out.println("Chuỗi hợp lệ");
        } else {
            System.out.println("Chuỗi không hợp lệ");
        }

        System.out.print("Nhập một địa chỉ email: ");
        String emailInput = scanner.nextLine();
        if (Validator.validEmail(emailInput)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        System.out.print("Nhập một số điện thoại di động Việt Nam: ");
        String phoneInput = scanner.nextLine();
        if (Validator.validPhone(phoneInput)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
