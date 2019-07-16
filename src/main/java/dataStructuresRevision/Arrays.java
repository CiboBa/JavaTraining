package dataStructuresRevision;

public class Arrays {

    public static void main(String[] args) {

        String[] alphabet = {"a", "b", "c", "d", "e", "f"};

        System.out.println("The old fashioned way");
        for (int i = 0; i < 5; i++) {
            System.out.print(alphabet[i] + " ");
        }

        System.out.println("\n\nUsing the length variable");
        for (int j = 0; j < alphabet.length; j++) {
            System.out.print(alphabet[j] + " ");
        }

        System.out.println("\n\nUsing For Each loop");
        for (String letter : alphabet) {
            System.out.print(letter + " ");
        }

        String[][] users = {
                {"John", "Williams", "jw@testemail.com", "56784775"},
                {"Sarah", "Jackson", "sj@testemail.com", "56784788"},
                {"Rachel", "Wallace", "rw@testemail.com", "45698775"}
        };

        //Get the size of the array
        int numOfUsers = users.length;
        int numOfFields = users[0].length;
        System.out.println("number of users: " + numOfUsers);
        System.out.println("number of fields: " + numOfFields);

        //Traverse the double array
        for (int i = 0; i < numOfUsers; i++) {
            String firstName = users[i][0];
            String lastName = users[i][1];
            String email = users[i][2];
            String phone = users[i][3];
            System.out.println(firstName + " " + lastName + " " + email + " " + phone);
        }

        //Using For Each
        for (String[] user : users) {
            System.out.print("[ ");
            for (String field : user) {
                System.out.print(field + " ");
            }
            System.out.println(" ]");
        }

    }
}
