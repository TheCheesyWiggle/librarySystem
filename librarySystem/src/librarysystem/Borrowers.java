
package librarysystem;


public class Borrowers {
    private String bName;
    private String books;
    private String email;
    private String address;

    public Borrowers(String name, String books, String email, String address) {
        this.bName = bName;
        this.books = books;
        this.email = email;
        this.address = address;
    }
    
    public String toString(){
        return bName+" , "+books+" , "+email+" , "+address;
    }

    public String getbName() {
        return bName;
    }

    public String getBooks() {
        return books;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setbName(String name) {
        this.bName = bName;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
