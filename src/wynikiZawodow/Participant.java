package wynikiZawodow;

public class Participant implements Comparable<Participant> {
    private String firstName;
    private String lastName;
    private int result;

    public Participant(String firstName, String lastName, int result) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.result = result;
    }


    @Override
    public String toString() {
        return "Participant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", result=" + result +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public int compareTo(Participant participant) {
        if(this.result > participant.result){
            return 1;
        } else if(this.result == participant.result){
            if(this.firstName == participant.firstName){
                return this.lastName.compareTo(participant.lastName);
            } else{
                return this.firstName.compareTo(participant.firstName);
            }

        } else {
            return -1;
        }

    }
}
