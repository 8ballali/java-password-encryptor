public class Main {
    public static void main(String[] args)throws Exception {
        PasswordStore pass1 = new PasswordStore("Iqbal", "1234567", "password");
        pass1.setCategory(PasswordStore.CAT_WEBAPP);
        System.out.println(pass1);
        System.out.println("USERNAME: "+pass1.username+" PASSWORD: "+pass1.getPassword());
    }
}
