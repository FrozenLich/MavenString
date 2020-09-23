public class HuluRegistration {
    private String email;
    private String password;
    private String name;
    private int birthYear;
    private int birthMonth;
    private int birthDate;
    private String gender;

    public HuluRegistration() {
        email = null;
        password = null;
        name = null;
        birthDate = -1;
        birthMonth = -1;
        birthYear = -1;
        gender = null;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        int atIndex = email.indexOf('@');
        if(atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1)
            System.out.println("Please enter a valid email address");
        else
            this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() <= 5)
            System.out.println("Passwords must be six or more characters");
        else
            this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() == 0)
            System.out.println("Please enter your name");
        else
            this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear < 1990 || birthYear > 2020)
            System.out.println("Please enter a valid year");
        else
            this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        if (birthMonth < 1 || birthMonth > 12)
            System.out.println("Please enter a valid month");
        else
            this.birthMonth = birthMonth;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        if (birthDate < 1 || birthDate > 31)
            System.out.println("Please enter a valid date");
        else
            this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female") || gender.equals("Prefer not to say"))
            this.gender = gender;
        else
            System.out.println("Please enter your gender");
    }
}
