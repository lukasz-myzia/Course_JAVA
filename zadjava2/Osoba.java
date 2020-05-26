package zadjava2;

public class Osoba {
    private String firstName;
    private String lastName;

//1. Konstruktor domyślny nie jest generowany, gdy w klasie zdefiniowano własny konstruktor
//2. "Nie jest wymagane pisanie konstruktora domyślnego bez parametrów..." 
    
    Osoba(){}
        
        public String getFirstName() { return firstName; } // bez this.
        public String getLastName() { return lastName; }
        
        public void setFirstName(String imie) { this.firstName = imie; }
        public void setLastName(String nazwisko) { this.lastName = nazwisko; }
        
}
    

