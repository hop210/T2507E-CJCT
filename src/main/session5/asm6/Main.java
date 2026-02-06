package main.session5.asm6;

public class Main {
    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();

        pb.insertPhone("An", "0901234567");
        pb.insertPhone("An", "0912345678");
        pb.insertPhone("Binh", "0988888888");
        pb.insertPhone("Cuong", "0977777777");

        System.out.println("📒 Danh bạ ban đầu:");
        pb.showAll();

        System.out.println("\n🔍 Tìm An:");
        pb.searchPhone("An");

        System.out.println("\n✏ Cập nhật số cho Bình:");
        pb.updatePhone("Binh", "0999999999");
        pb.showAll();

        System.out.println("\n❌ Xóa An:");
        pb.removePhone("An");
        pb.showAll();

        System.out.println("\n🔃 Sắp xếp danh bạ:");
        pb.sort();
        pb.showAll();
    }
}
