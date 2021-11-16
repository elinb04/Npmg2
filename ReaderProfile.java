import java.util.jar.Attributes.Name;

public class ReaderProfile
{
    String name;
    String surname;
    char grade;
    String phone;
    int takenBooks;

    public ReaderProfile(String name, String surname, char grade, String phone, int takenBooks)
    {
    	setGrade(grade);
        setPhone(phone);
        setTakenBooks(takenBooks);
        setName(name);
        setSurname(surname);
    }

    public ReaderProfile(char grade, String phone, String name, String surname)
    {
    	setGrade(grade);
        setPhone(phone);
        setName(name);
        setSurname(surname);
    }

    public char getGrade() 
    {
        return grade;
    }

    public String getName() 
    {
        return name;
    }

    public String getPhone() 
    {
        return phone;
    }
    public int getTakenBooks() 
    {
        return takenBooks;
    }
    public String getSurname() 
    {
        return surname;
    }


    public void setGrade(char grade) 
    {
        if(grade != ' ')
            this.grade = grade;
    }

    public void setName(String name) 
    {
        if(name != null && !name.isEmpty())
            this.name = name;
    }

    public void setPhone(String phone) 
    {
        if(phone != null && phone.length() == 10)
            this.phone = phone;
    }
    public void setTakenBooks(int takenBooks) 
    {
        if(takenBooks > -1)
            this.takenBooks = takenBooks;
    }
    public void setSurname(String surname) 
    {
        if(surname != null && !surname.isEmpty())
            this.surname = surname;
    }

    public String toString() 
    {
        return String.format("%s, %s, %c, %s, %d", getName(), getSurname(), getGrade(), getPhone(), getTakenBooks());
    }
}