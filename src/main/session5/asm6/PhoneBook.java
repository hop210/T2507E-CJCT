package main.session5.asm6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pn : PhoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                pn.addPhone(phone);
                return;
            }
        }
        // nếu chưa có tên
        PhoneNumber newPN = new PhoneNumber(name);
        newPN.addPhone(phone);
        PhoneList.add(newPN);
    }

    @Override
    public void removePhone(String name) {
        PhoneList.removeIf(pn -> pn.getName().equalsIgnoreCase(name));
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber pn : PhoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                pn.getPhones().clear();
                pn.addPhone(newphone);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng");
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pn : PhoneList) {
            if (pn.getName().equalsIgnoreCase(name)) {
                System.out.println("Name: " + pn.getName());
                System.out.println("Phones: " + pn.getPhones());
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng");
    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    // hàm phụ để hiển thị toàn bộ danh bạ
    public void showAll() {
        for (PhoneNumber pn : PhoneList) {
            System.out.println(pn.getName() + " : " + pn.getPhones());
        }
    }
}
