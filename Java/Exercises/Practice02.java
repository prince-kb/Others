class Practice02{
    public static void main(String[] args) {
        onlineLibrary l = new onlineLibrary();
        l.addBook("hero");
        l.showBooks();
    }
}
class onlineLibrary{
    int n;
    String books[];
    onlineLibrary(){
        n=0;
    }

    void addBook(String book){
        
            for(String b :books){
                if(b!=null){
                    if(book==b){
                        System.out.println("Same book already exist");
                        return;
                    }
                }
            }
        this.books[n]=book;
        n+=1;
    }

    void showBooks(){
        for (String book : books) {
            if(book.equals(null)){
                return;
            }
            else System.out.println("* "+book);
        }
    }
}