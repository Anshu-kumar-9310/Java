import java.security.PublicKey;

class Library {
//    Static Variables: Belong to the class, not individual instances.
//    Shared among all instances of the class
// IN SHORT: static variable ki value reset nhi hoti hai jab bhi hum new object banate hai.
    private static int totalBooksInLibrary = 0;
    private static int totalBooksCurrentlyPresentInLibrary = 0;
    public String title;
    public String author;
    public String isbn;
    private boolean isBorrowed = false;

    public void borrowBook(){
        if(!this.isBorrowed){
            System.out.printf("Book is Borrowed Successfully: %s - %s - %s",this.title,this.author,this.isbn);
            this.isBorrowed =true;
            System.out.println();
            totalBooksCurrentlyPresentInLibrary--;
        }else{
            System.out.printf("Sorry! Book is already borrowed: %s - %s",this.title,this.author);
            System.out.println();
        }

    }
    public void returnBook(){
        if(this.isBorrowed){
            System.out.printf("Book is Returned Successfully: %s - %s -%s",this.title,this.author,this.isbn);
            this.isBorrowed =false;
            System.out.println();
            totalBooksCurrentlyPresentInLibrary++;
        }else{
            System.out.printf("Check Again! Book is already in Library: %s - %s",this.title,this.author);
            System.out.println();
        }


    }

    public static void getTotalBooks(){
        System.out.println("Total Books in Library is: "+totalBooksInLibrary);
    }

    public void getTotalBooksCurrentlyPresentInLibrary(){
        System.out.println("Total Books Currently Present in Library is: "+totalBooksCurrentlyPresentInLibrary);
    }


    public Library(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooksInLibrary++;
        totalBooksCurrentlyPresentInLibrary++;
    }

    public static void main(String[] args) {
        Library book1 = new Library("Think Grow And Rich","Anshu Kumar","001");
        getTotalBooks();
        Library book2 = new Library("Harry Potter","Sachin Singh","002");
        Library book3 = new Library("The Invisible Man","Ashish Kumar","003");
        getTotalBooks();

        book2.borrowBook();
        book2.getTotalBooksCurrentlyPresentInLibrary();
        book1.borrowBook();
        book2.borrowBook();
        book1.returnBook();
        book3.returnBook();
        book3.borrowBook();
        book3.returnBook();
        book2.getTotalBooksCurrentlyPresentInLibrary();
        book2.returnBook();
        book2.getTotalBooksCurrentlyPresentInLibrary();



    }
}
