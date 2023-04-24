package com.mycompany.listbooks;
public class ListBooks {
  public static String[] model = new String[10];

  public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        viewShowListBook();
    }
      public static void showListBook() {
    System.out.println("LISTBOOK");
    for (var i = 0; i < model.length; i++) {
      var book = model[i];
      var no = i + 1;

      if (book != null) {
        System.out.println(no + ". " + book);
      }
    }
  }
      
  public static void testShowListBook() {
    model[0] = "Belajar Java Dasar";
    model[1] = "Studi Kasus Java Dasar : Aplikasi ListBook";
    model[2] = "Belajar PHP";
    showListBook();
  }
  public static void addListBook(String book) {
    // cek apakah model penuh?
    var isFull = true;
    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        // model masih ada yang kosong
        isFull = false;
        break;
      }
    }

    // jika penuh, kita resize ukuran array 2x lipat
    if (isFull) {
      var temp = model;
      model = new String[model.length * 2];

      for (int i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }

    // tambahkan ke posisi yang data array nya NULL
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = book;
        break;
      }
    }
  }
//test add book
  public static void testAddListBook() {
    for (int i = 0; i < 25; i++) {
      addListBook("Contoh Book Ke." + i);
    }
    showListBook();
  }
  
  //menghapus books list
public static boolean removeListBook(Integer number) {
    if ((number - 1) >= model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (int i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }
public static void testRemoveListBook() {
    addListBook("Satu");
    addListBook("Dua");
    addListBook("Tiga");
    addListBook("Empat");
    addListBook("Lima");

    var result = removeListBook(1);
    System.out.println(result);

    result = removeListBook(2);
    System.out.println(result);

    showListBook();
  }

  public static void viewShowListBook() {
    while (true) {
      showListBook();

      System.out.println("MENU : ");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("x. Keluar");

      var input = input("Pilih");

      if (input.equals("1")) {
        viewAddListBook();
      } else if (input.equals("2")) {
        viewRemoveListBook();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak dimengerti");
      }
    }
  }
  
  public static void testViewShowListBook() {
    addListBook("Satu");
    addListBook("Dua");
    addListBook("Tiga");
    addListBook("Empat");
    addListBook("Lima");
    viewShowListBook();
  }

    /**
   * Menampilkan view menambahkan book list
   */
  public static void viewAddListBook() {
    System.out.println("MENAMBAH LISTBOOK");

    var book = input("Book (x Jika Batal)");

    if (book.equals("x")) {
      // batal
    } else {
      addListBook(book);
    }
  }
  
  public static void testViewAddListBook() {
    addListBook("Satu");
    addListBook("Dua");

    viewAddListBook();

    showListBook();
  }


  //menghapus list books
   public static void viewRemoveListBook() {
    System.out.println("MENGHAPUS LISTBOOK");

    var number = input("Nomor yang Dihapus (x Jika Batal)");

    if (number.equals("x")) {
      // batal
    } else {
      boolean success = removeListBook(Integer.valueOf(number));
      if (!success) {
        System.out.println("Gagal menghapus ListBook : " + number);
      }
    }
  }
 
  public static void testViewRemoveListBook() {
    addListBook("Satu");
    addListBook("Dua");
    addListBook("Tiga");

    showListBook();

    viewRemoveListBook();

    showListBook();
  }
  
  public static String input(String info) {
    System.out.print(info + " : ");
    String data = scanner.nextLine();
    return data;
  }


}
