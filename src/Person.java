public class Person {
    protected String name;
    protected String surname;
    protected int tickets_amount;
    public Person(String name, String surname, int tickets_amount) {
        this.name = name;
        this.surname = surname;
        this.tickets_amount = tickets_amount;
    }

    public int getTickets_amount() {
        return tickets_amount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void spendTicket() {
        tickets_amount--;
    }