package tugas_kel50;

public class userService {
    
    private String[][] data = new String [2][3];
    private String[][] histories = new String [2][4];
    private String email, password, roles = "";
    
    public userService (String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data =
        {
            {"AbinayaKelompok50@gmail.com", "12345", "superAdmin"},
            {"JikriKelompok50@gmail.com", "12345", "user"}
        };
        String[][] histories =
        {
            {"AbinayaKelompok50@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "25-04-2020"},
            {"JikriKelompok50@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "25-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for (int i = 0; i < data.length; i++)
        {
            if (data[i][0].equals(email) && data[i][1].equals(password))
            {
                roles = data[i][2];

                return true;
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if (status == true)
        {
            System.out.println("Welcome " + roles);
            System.out.println("Logged it as user email " + email);
            if (histories[0][0].equals(email))
            {
                System.out.println(histories[0][1]);
                System.out.println(histories[0][2]);
                System.out.println("Tanggal Pinjaman : " + histories[0][3]);
            }
            else if (histories[1][0].equals(email))
            {
                System.out.println(histories[1][1]);
                System.out.println(histories[1][2]);
                System.out.println("Tanggal Pinjaman : " + histories[1][3]);
            }
        }
        else
        {
            System.out.println("Invalid Login");
        }
    }
}
