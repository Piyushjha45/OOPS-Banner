public class UC4BannerApp {

    public static void main(String[] args) {
        String[] banner = {
                "************",
                "* *",
                "* WELCOME TO SRMIST         *",
                "* *",
                "* OOPS - UC4 Assignment       *",
                "* *",
                "************"
        };

        for (String line : banner) {
            System.out.println(line);
        }

        System.out.println("\n--- Single String Output ---\n");
        String fullBanner = String.join("\n", banner);
        System.out.println(fullBanner);
    }
}