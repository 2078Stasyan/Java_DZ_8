public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1958;

        post.name = "Иван";
        post.passport = "4444 №55564512";
        post.patronymic = "Иванович";
        post.phone = "+7 (912)-896-88-78";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
