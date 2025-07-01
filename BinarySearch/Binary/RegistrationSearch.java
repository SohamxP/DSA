package Binary;

public class RegistrationSearch {

    Registration[] registrations;

    public RegistrationSearch() {
        Database db = new Database();
        registrations = db.getRegistrations();
    }

    public Registration search(String license) {
        int left = 0; // Start at the beginning of the list
        int right = registrations.length - 1; // Start at the end of the list
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparitor = registrations[mid].license.compareTo(license);
            if (comparitor == 0) {
                return registrations[mid];
            } else if (comparitor < 0) {

                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // If we never find the license
    }

    public void printAll() {
        for (Registration reg : registrations) {
            System.out.println(reg);
        }
    }

    public static void main(String[] args) {

        String license = "GIG-1870";
        RegistrationSearch regSearch = new RegistrationSearch();
        System.out.println();
        Registration reg = regSearch.search(license);

        if (reg != null) {
            System.out.println("Registration found");
            System.out.println(reg);
        } else {
            System.out.println("No registration found with license " + license);
        }

        System.out.println();
    }

}
