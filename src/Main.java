public class Main {
    public static void separation() {
        System.out.println("========================================================");
    }
    public static void main(String[] args) {
        separation();
        Author tolstoi = new Author("Lev","Tolstoi");
        Author pushkin = new Author("Alexander","Pushkin");
        Book warAndPeace = new Book(tolstoi, "War and Peace", 0);
        Book captainsDaugher = new Book(pushkin, "Captain's Daugher", 0);
        System.out.println("warAndPeace.getAuthor().getFirtsName() = " + warAndPeace.getAuthor().getFirtsName());
        System.out.println("warAndPeace.getAuthor().getLastName() = " + warAndPeace.getAuthor().getLastName());
        System.out.println("warAndPeace.getNameOfTheBook() = " + warAndPeace.getNameOfTheBook());
        warAndPeace.setTheYearOfPublishing(1865);
        System.out.println("warAndPeace.getTheYearOfPublishing() = " + warAndPeace.getTheYearOfPublishing());
        separation();
        System.out.println("captainsDaugher.getAuthor().getFirtsName() = " + captainsDaugher.getAuthor().getFirtsName());
        System.out.println("captainsDaugher.getAuthor().getLastName() = " + captainsDaugher.getAuthor().getLastName());
        System.out.println("captainsDaugher.getNameOfTheBook() = " + captainsDaugher.getNameOfTheBook());
        captainsDaugher.setTheYearOfPublishing(1836);
        System.out.println("captainsDaugher.getTheYearOfPublishing() = " + captainsDaugher.getTheYearOfPublishing());
        separation();


    }
}